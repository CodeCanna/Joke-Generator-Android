package io.codecanna.jokegenerator;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import io.codecanna.jokegenerator.model.Joke;
import io.codecanna.jokegenerator.service.BaddumTss;
import io.codecanna.jokegenerator.service.JokeGetter;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.logging.HttpLoggingInterceptor.Level;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * This class hands the clicks from the joke button
 */
public class JBClickHandler implements OnClickListener {
  @Override
  public void onClick(View v) {
    TextView tv = v.getRootView().findViewById(R.id.joke_display);
    BaddumTss drumSound = new BaddumTss();
    // Set our logging to view our Response data
    HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
    interceptor.setLevel(Level.BODY);

    // Create OKHttpClient to add our logging interceptor
    OkHttpClient httpClient = new OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build();

    // Create a new retrofit2 instance
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://icanhazdadjoke.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClient)
        .build();

    JokeGetter jokeGetter = retrofit.create(JokeGetter.class);

    // Create a new joke getter to use
    Call<Joke> joke = jokeGetter.getJoke();
    drumSound.baddumTss();
    // I'm using .enqueue here, so I don't have to worry about managing threads.
    joke.enqueue(new Callback<Joke>() {
      @Override
      public void onResponse(Call<Joke> call, Response<Joke> response) {
        System.out.println(response.body().getJokeBody());
        tv.setText(response.body().getJokeBody());
      }

      @Override
      public void onFailure(Call<Joke> call, Throwable t) {
        t.printStackTrace();
      }
    });

    Log.println(Log.ASSERT, "TEST", "JOKE BUTTON CLICKED!");
  }
}
