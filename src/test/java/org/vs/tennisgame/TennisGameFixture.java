package org.vs.tennisgame;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vs.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;

public class TennisGameFixture {

    private TennisGame tennisGame;
    private Player player1;
    private Player player2;
    private String name1;
    private String name2;

    @Before
    public void setUp() throws Exception {
        initialize();
    }

    private void initialize() {
        player1 = new Player(name1);
        player2 = new Player(name2);

        tennisGame = new TennisGame(player1, player2);
    }

    @Test
    public void fizzBuzzAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("tennis-game.story")
                .run();
    }

    @Given("a new game with players $name1 and $name2")
    public void givenANewGame(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
        initialize();
    }

    @When("$player wins a ball")
    public void whenPlayerWinsABall(String player) {
        if (player.equals("Player1")) {
            tennisGame.winBall(player1);
        }
        if (player.equals("Player2")) {
            tennisGame.winBall(player2);
        }
    }

    @Then("score should be $")
    public void thenFizzBuzzShouldReturn(String score) {
        assertThat(tennisGame.getScore()).isEqualTo(score);
    }
}
