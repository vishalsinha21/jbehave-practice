package org.vs.tennisgame;

public class TennisGame {

    Player player1;
    Player player2;
    Score score;

    public TennisGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        score = new Score();
    }

    public void winBall(Player player) {
        if (player == player1) {
            score.player1Wins();
        }
        if (player == player2) {
            score.player2Wins();
        }
    }

    public String getScore() {
        return score.getScore(player1.getName(), player2.getName());
    }
}
