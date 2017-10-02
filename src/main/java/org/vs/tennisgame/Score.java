package org.vs.tennisgame;

public class Score {

    private int player1Score;
    private int player2Score;

    public void player1Wins() {
        player1Score++;
    }

    public void player2Wins() {
        player2Score++;
    }


    public String getScore(String name1, String name2) {
        if (player1Score >= 3 && player2Score >= 3) {
            if (player1Score == player2Score) {
                return "deuce";
            } else if (player1Score == player2Score + 1) {
                return "advantage " + name1;
            } else if (player2Score == player1Score + 1) {
                return "advantage " + name2;
            } else if (player1Score > player2Score + 1) {
                return name1 + " won";
            } else {
                return name2 + " won";
            }
        }

        if (player1Score > 3 && player2Score < 3) {
            return name1 + " won";
        }

        if (player2Score > 3 && player1Score < 3) {
            return name2 + " won";
        }

        return getTermForScore(player1Score) + "|" + getTermForScore(player2Score);
    }

    public String getTermForScore(int score) {
        if (score == 0) {
            return "love";
        } else if (score == 1) {
            return "fifteen";
        } else if (score == 2) {
            return "thirty";
        } else if (score == 3) {
            return "forty";
        }

        return "love";
    }
}
