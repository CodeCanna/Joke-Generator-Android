package io.codecanna.jokegenerator;

// TODO: Add a thumbs up and thumbs down buttons so users can rate the joke.
// TODO: Maybe even a share button?

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.facebook.stetho.Stetho;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Stetho.initializeWithDefaults(this);

    Button jokeButton = findViewById(R.id.joke_button);
    JBClickHandler clickHandler = new JBClickHandler();
    jokeButton.setOnClickListener(clickHandler);
  }
}