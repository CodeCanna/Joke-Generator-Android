package io.codecanna.jokegenerator;

import io.codecanna.jokegenerator.model.Joke;
import org.junit.Test;

import static org.junit.Assert.*;

public class JokeUnitTest {

  // Test Jokes
  String[][] jokes = {
      // Joke 1
      {
          "9pOR7pzItrc", // id
          "How do you make a water bed more bouncy. You use Spring Water", // body
          "200" // status
      },
      // Joke 2
      {
          "69xAsrHYDAd", // id
          "Why did Mozart kill all his chickens?\\r\\nBecause when he asked them who the best composer was, they'd all say \\\"Bach bach bach!\\\"\\r\\n",
          // body
          "200" // status
      },
      // Joke 3
      {
          "G6pr4EQfiqc", // id
          "What did the piece of bread say to the knife? Butter me up.", // body
          "200" // status
      }
  };


  @Test
  public void jokeTest() {
    for (String[] strings : jokes) {
      Joke joke = new Joke(strings[0], strings[1], Integer.parseInt(strings[2])); // Create a joke to test
      assertEquals(strings[0], joke.getJokeId()); // Test the getter/setter for id
      assertEquals(strings[1], joke.getJokeBody()); // Test the getter/setter for joke body
      assertEquals(Integer.parseInt(strings[2]), joke.getStatus()); // Test the getter/setter for joke status
    }
  }
}