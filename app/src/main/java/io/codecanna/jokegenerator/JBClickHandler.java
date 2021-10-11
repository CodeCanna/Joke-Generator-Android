package io.codecanna.jokegenerator;

import android.app.Notification.Action;
import android.app.PendingIntent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.gson.Gson;
import io.codecanna.jokegenerator.service.JokeGetter;
import java.io.IOException;
import java.lang.reflect.GenericDeclaration;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JBClickHandler extends Thread implements OnClickListener {

  public void run() {
    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://icanhazdadjoke.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(httpClient.build())
        .build();

    JokeGetter jokeGetter = retrofit.create(JokeGetter.class);

    try {
      Response<Joke> jokeResponse = jokeGetter.getJoke().execute();
      Log.println(Log.ASSERT, "JOKE:", jokeResponse.body().getJokeBody());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void onClick(View v) {
    Log.println(Log.ASSERT, "TEST", "JOKE BUTTON CLICKED!");

    this.start();


    TextView tv = (TextView) v.getRootView().findViewById(R.id.joke_display);
    tv.setText("Knock Knock...");
  }
}
