package io.codecanna.jokegenerator.service;

import android.app.Application;
import android.content.Context;

/**
 * Get access to the application context from anywhere
 */
public class GlobalContext extends Application {
  private static Context appContext;
  @Override
  public void onCreate() {
    super.onCreate();
    appContext = getApplicationContext();
  }

  public static Context getAppContext() {
    return appContext;
  }
}
