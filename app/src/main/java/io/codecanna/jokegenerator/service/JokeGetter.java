package io.codecanna.jokegenerator.service;

import io.codecanna.jokegenerator.Joke;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JokeGetter {
  @GET("/")
  public Call<Joke> getJoke();
}
