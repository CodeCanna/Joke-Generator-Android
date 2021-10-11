package io.codecanna.jokegenerator;

import com.google.gson.annotations.SerializedName;

/**
 * This is a Joke class that represents a joke returned from icanhazdadjokes.com
 */
public class Joke {
  @SerializedName("joke_id")
  private String jokeId;

  @SerializedName("joke_body")
  private String jokeBody;

  @SerializedName("joke_status")
  private int status;

  public String getJokeId() {
    return jokeId;
  }

  public void setJokeId(String jokeId) {
    this.jokeId = jokeId;
  }

  public String getJokeBody() {
    return jokeBody;
  }

  public void setJokeBody(String jokeBody) {
    this.jokeBody = jokeBody;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }
}
