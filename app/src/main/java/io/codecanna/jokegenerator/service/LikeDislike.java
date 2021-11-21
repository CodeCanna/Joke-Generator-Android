package io.codecanna.jokegenerator.service;

import android.util.Log;

/**
 * Hand like or dislike button clicks
 */
public class LikeDislike {
    public enum VoteType {
        LIKE,
        DISLIKE
    }

    VoteType vote;

    public LikeDislike(VoteType voteType, String jokeIds) {
        if (voteType == VoteType.LIKE) {
            this.vote = VoteType.LIKE;
        } else if (voteType == VoteType.DISLIKE) {
            this.vote = VoteType.DISLIKE;
        }
    }

    public VoteType getVote() {
        return this.vote;
    }
}
