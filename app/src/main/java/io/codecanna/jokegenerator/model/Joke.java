package io.codecanna.jokegenerator.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This is a Joke class that represents a joke returned from icanhazdadjoke.com
 */
public class Joke {
  @SerializedName("id")
  @Expose
  private String jokeId;

  @SerializedName("joke")
  @Expose
  private String jokeBody;

  @SerializedName("status")
  @Expose
  private int status;

  public String getJokeId() {
    return jokeId;
  }

  public void setJokeId(String jokeId) {
    this.jokeId = jokeId;
  }

  public String getJokeBody() {
    return this.jokeBody;
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
