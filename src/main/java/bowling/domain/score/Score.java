package bowling.domain.score;

import bowling.exception.CannotCalculateException;

public class Score {

    private static final int SCORE_COUNT_ZERO = 0 ;
    private static final int EMPTY_SCORE = -1;

    private int score;
    private int left;

    private Score(int score, int left) {
        this.score = score;
        this.left = left;
    }

    public static Score of() {
        return Score.of(0, EMPTY_SCORE);
    }

    public static Score of(int pinsCount, int left) {
        return new Score(pinsCount, left);
    }

    public Score bowl(int pinsCount) {
        score = score + pinsCount;
        left = left - 1;
        return this;
    }

    public int getScore() {
        if (!canCalculateScore()) {
            throw new CannotCalculateException();
        }
        return score;
    }

    public boolean canCalculateScore() {
        return left == SCORE_COUNT_ZERO;
    }
}
