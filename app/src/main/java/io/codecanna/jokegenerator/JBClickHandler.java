package io.codecanna.jokegenerator;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class JBClickHandler extends View implements OnClickListener {
  TextView jokeDisplay = findViewById(R.id.joke_display);

  public JBClickHandler(Context context) {
    super(context);
  }

  @Override
  public void onClick(View v) {
    Log.println(Log.INFO, "Joke Button:", "Clicked Joke Button!");
    /*
    FIXME: This line produces this error:
     java.lang.NullPointerException: Attempt to invoke virtual method 'void android.widget.TextView.setText(java.lang.CharSequence)' on a null object reference
     But why?
     */
//    jokeDisplay = findViewById(R.id.joke_display);
    jokeDisplay.setText("Knock Knock...");
  }
}
