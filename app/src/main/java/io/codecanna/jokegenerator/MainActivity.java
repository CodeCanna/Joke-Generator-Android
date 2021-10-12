package io.codecanna.jokegenerator;

// TODO: Add a joke drum sound that is played after each button press.
// TODO: Style the joke display and increase joke font size.

import android.widget.Button;
import android.view.View;
import androidx.activity.contextaware.ContextAware;
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