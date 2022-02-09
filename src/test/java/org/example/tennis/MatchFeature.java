package org.example.tennis;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Player;
import org.junit.Assert;

public class MatchFeature {

    private Player player;

    @ParameterType(".*")
    public Player player (String playerName) {

        if (player == null) {
            player = new Player();
        }
        return player;
    }

    @Given("score is love - love")
    public void score_is_love_love() {
    }

    @Given("score is {string} - love")
    public void score_is_love(String string) {
        System.out.println(string);

        if (!string.isEmpty())
            player.setScore(string);
    }

    @When("Player {player} score")
    public void player_one_score(Player player) {
        player.incrementScore();
        System.out.println(player);
    }

    @Then("The score is new {string} - love")
    public void the_score_is_new_love(String str1) {
        Assert.assertEquals(str1, player.getScore());
    }
}
