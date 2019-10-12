package com.Junit4004TDD.TDD;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class ServerCucumber extends TestCase {
	Server s = new Server();
	int count = 0;

	@Given("I am playing Yahtzee and I run the server")
	public void I_am_playing_Yahtzee_and_I_run_the_server() throws UnknownHostException, IOException {
		String[] args = new String[1];
		args[0] = "test";
		s.main(args);
	}

	@When("I connect all 3 players to the server")
	public void I_connect_all_3_players_to_the_server() {

	}

	@Then("check that game connects with all players and players score correctly")
	public void check_that_game_connects_with_all_players_and_players_score_correctly() {
		assertTrue(s.p1.round == 14);
		assertTrue(s.p2.round == 14);
		assertTrue(s.p3.round == 14);
	}

	@Given("I am playing Yahtzee")
	public void I_am_playing_Yahtzee() {
	}

	@Then("check that player one has joined the game")
	public void check_that_player_one_has_joined_the_game() {
		assertTrue(s.p1.name != null);
	}

	@Then("check that player two has joined the game")
	public void check_that_player_two_has_joined_the_game() {
		assertTrue(s.p2.name != null);
	}

	@Then("check that player three has joined the game")
	public void check_that_player_three_has_joined_the_game() {
		assertTrue(s.p3.name != null);
	}

	@Given("a winner is announced after playing Yahtzee")
	public void a_winner_is_announced_after_playing_Yahtzee() throws UnknownHostException, IOException {
	}

	@Then("check that player one has ended their game")
	public void check_that_player_one_has_ended_their_game() {
		assertTrue(s.p1.round == 14);
	}

	@Then("check that player two has ended their game")
	public void check_that_player_two_has_ended_their_game() {
		assertTrue(s.p2.round == 14);
	}

	@Then("check that player three has ended their game")
	public void check_that_player_three_has_ended_their_game() {
		assertTrue(s.p3.round == 14);
	}
}
