package io.codecanna.jokegenerator.model;

/**
 * This class represents a single vote for a joke, it includes its own id as well as the id of the joke the vote is attached to.
 */
public class JokeVote {
  private int id;
  private String jokeId;
  private boolean isLike;

  public JokeVote(int id, String jokeId, boolean isLike) {
    this.setId(id);
    this.setJokeId(jokeId);
    this.setIsLike(isLike);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getJokeId() {
    return jokeId;
  }

  public void setJokeId(String jokeId) {
    this.jokeId = jokeId;
  }

  public boolean getIsLike() {
    return isLike;
  }

  public void setIsLike(boolean like) {
    this.isLike = like;
  }
}
