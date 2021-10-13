package io.codecanna.jokegenerator.service;

import android.media.MediaPlayer;
import io.codecanna.jokegenerator.R;

public class BaddumTss extends MediaPlayer {
  MediaPlayer player;
  public BaddumTss() {
    this.player = MediaPlayer.create(GlobalContext.getAppContext(), R.raw.drum_sound);
  }

  public void baddumTss() {
    player.start();
  }
}
