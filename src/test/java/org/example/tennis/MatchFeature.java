package org.example.tennis;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Game;
import org.junit.Assert;

public class MatchFeature {

    private static final String[] players = {"one", "two"};
    private static Game game;

    @BeforeAll
    public static void init() {
        game = new Game(players);
    }

    @Given("Score is {string} - {string}")
    public void scoreBeforePoint(String str1, String str2) {
        Assert.assertEquals(str1 + " - " + str2, game.getAnnouncement());
    }

    @Given("Score is {string}")
    public void scoreIsDeuce(String str1) {
        Assert.assertEquals(str1, game.getAnnouncement());
    }

    @When("Player {string} score")
    public void playerScoreAPoint(String player) {
        game.playerScore(game.getPlayer(player));
    }

    @Then("The score is {string} - {string}")
    public void scoreAfterPoint(String str1, String str2) {
        Assert.assertEquals(str1 + " - " + str2, game.getAnnouncement());
    }

    @Then("The score is {string}")
    public void scoreShouldBeDeuce(String str1) {
        Assert.assertEquals(str1, game.getAnnouncement());
    }

    @Then("Player {string} win the point and win the game")
    public void playerWin(String str1) {
        Assert.assertEquals("Player " + str1 + " win the game", game.getAnnouncement());
    }
}
