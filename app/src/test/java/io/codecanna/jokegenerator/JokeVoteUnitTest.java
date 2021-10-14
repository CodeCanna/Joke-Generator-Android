package io.codecanna.jokegenerator;

import io.codecanna.jokegenerator.model.JokeVote;
import org.junit.Test;
import static org.junit.Assert.*;

public class JokeVoteUnitTest {

  public String[][] testVotes = {
      {
          "134",
          "9pOR7pzItrc",
          "true"

      },
      {
          "432",
          "69xAsrHYDAd",
          "false"
      },
      {
          "2",
          "G6pr4EQfiqc",
          "true"
      }
  };

  @Test
  public void testJokeVotes() {
    for (String[] testVote : testVotes) {
      JokeVote vote = new JokeVote(Integer.parseInt(testVote[0]), testVote[1],
          Boolean.parseBoolean(testVote[2]));

      assertEquals(Integer.parseInt(testVote[0]), vote.getId());
      assertEquals(testVote[1], vote.getJokeId());
      assertEquals(Boolean.parseBoolean(testVote[2]), vote.getIsLike());
    }
  }
}
