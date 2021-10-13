package io.codecanna.jokegenerator;

// TODO: Add a joke drum sound that is played after each button press.
// TODO: Style the joke display and increase joke font size.
// TODO: Add a thumbs up and thumbs down buttons so users can rate the joke.
// TODO: Maybe even a share button?

import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button jokeButton = findViewById(R.id.joke_button);
    JBClickHandler clickHandler = new JBClickHandler();
    jokeButton.setOnClickListener(clickHandler);
  }
}