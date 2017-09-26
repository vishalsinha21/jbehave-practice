package org.vs.berlinclock;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Before;
import org.junit.Test;
import org.vs.berlinclock.BerlinClock;
import org.vs.berlinclock.TimeConverter;

import static org.assertj.core.api.Assertions.assertThat;
import static org.vs.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;

/**
 * Acceptance test class that uses the JBehave (Gerkin) syntax for writing stories.  You should not need to
 * edit this class to complete the exercise, this is your definition of done.
 */
public class BerlinClockFixture {

    private TimeConverter berlinClock;
    private String theTime;

    @Before
    public void setUp() throws Exception {
        berlinClock = new BerlinClock();
    }

    @Test
    public void berlinClockAcceptanceTests() throws Exception {
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("berlin-clock.story")
                .run();
    }

    @When("the time is $time")
    public void whenTheTimeIs(String time) {
        theTime = time;
    }

    @Then("the clock should look like $")
    public void thenTheClockShouldLookLike(String theExpectedBerlinClockOutput) {
        assertThat(berlinClock.convertTime(theTime)).isEqualTo(theExpectedBerlinClockOutput);
    }
}
