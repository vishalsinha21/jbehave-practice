package org.vs.fizzbuzz;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Before;
import org.junit.Test;
import org.vs.fizzbuzz.FizzBuzz;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vs.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;

public class FizzBuzzFixture {

    private FizzBuzz fizzBuzz;
    private int number;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void fizzBuzzAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("fizz-buzz.story")
                .run();
    }

    @When("the number is $number")
    public void whenTheNumberIs(int number) {
        this.number = number;
    }

    @Then("FizzBuzz should return $")
    public void thenFizzBuzzShouldReturn(String expectedResult) {
        assertThat(fizzBuzz.get(number)).isEqualTo(expectedResult);
    }
}
