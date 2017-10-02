package org.vs.tennisgame;

public class TestTennisGame {

    public static void main(String[] args) {
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");

        TennisGame game = new TennisGame(player1, player2);

        game.winBall(player1);
        System.out.println(game.getScore());
        game.winBall(player2);
        System.out.println(game.getScore());
        game.winBall(player1);
        System.out.println(game.getScore());
        game.winBall(player1);
        System.out.println(game.getScore());
        game.winBall(player2);
        System.out.println(game.getScore());
        game.winBall(player2);
        System.out.println(game.getScore());
        game.winBall(player1);
        System.out.println(game.getScore());
        game.winBall(player2);
        System.out.println(game.getScore());
        game.winBall(player2);
        System.out.println(game.getScore());
        game.winBall(player1);
        System.out.println(game.getScore());
        game.winBall(player1);
        System.out.println(game.getScore());
        game.winBall(player1);
        System.out.println(game.getScore());
    }
}
