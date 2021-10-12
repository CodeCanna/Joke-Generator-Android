package io.codecanna.jokegenerator.service;

import io.codecanna.jokegenerator.model.Joke;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface JokeGetter {
  @Headers({
      "Accept: application/json"
  })
  @GET("/")
  public Call<Joke> getJoke();
}
