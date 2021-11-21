package io.codecanna.jokegenerator;

// TODO: Add a thumbs up and thumbs down buttons so users can rate the joke.
// TODO: Maybe even a share button?

import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.facebook.stetho.Stetho;
import io.codecanna.jokegenerator.service.LikeDislike;

public class MainActivity extends AppCompatActivity {
  public void handleLike(View view) {
    Log.println(Log.ASSERT, "MESSAGE:", "You clicked the Like Button");
  }

  public void handleDislike(View view) {
    Log.println(Log.ASSERT, "MESSAGE:", "You clicked the Dislike Button!");
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Stetho.initializeWithDefaults(this);

    Button jokeButton = findViewById(R.id.joke_button);
    JBClickHandler clickHandler = new JBClickHandler();
    jokeButton.setOnClickListener(clickHandler);

    LikeDislike likeDislike = new LikeDislike(LikeDislike.VoteType.DISLIKE, "Placeholder");
  }
}