package com.Junit4004TDD.TDD;

import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;
import java.util.ArrayList;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class Player1Cucumber extends TestCase{
	Client1 p1 = new Client1();
	int count=0;
	@Given("I am playing Yahtzee and run client 1")
	public void i_am_playing_Yahtzee() throws IOException {
		String[] args=new String[1];
		args[0]="test";
		p1.main(args);	

	}
	@When("I connect player 1 to the server")
	public void I_connect_player_1_to_the_server() {

	}

	@Then("check that player 1 finishes game correctly")
	public void check_that_player_1_finishes_game_correctly() {

	}
	
	@Given("I have finished playing a full game of yahtzee with Player 1")
	public void I_have_finished_playing_a_full_game_of_yahtzee_Player_1() throws IOException {
	}
	@Then("check that P1 scored Ones correctly")
	public void check_that_P1_scored_Ones_correctly() {
assertEquals(p1.ss.p1.aces,0);
	}
	@Then("check that P1 scored Twos correctly")
	public void check_that_P1_scored_Twos_correctly() {
assertEquals(p1.ss.p1.twos,0);
	}
	@Then("check that P1 scored Threes correctly")
	public void check_that_P1_scored_Threes_correctly() {
assertEquals(p1.ss.p1.threes,0);
	}
	@Then("check that P1 scored Fours correctly")
	public void check_that_P1_scored_Fours_correctly() {
assertEquals(p1.ss.p1.fours,0);
	}
	@Then("check that P1 scored Fives correctly")
	public void check_that_P1_scored_Fives_correctly() {
assertEquals(p1.ss.p1.fives,0);
	}
	@Then("check that P1 scored Sixes correctly")
	public void check_that_P1_scored_Sixes_correctly() {
assertEquals(p1.ss.p1.sixes,0);
	}
	@Then("check that P1 scored Bonus correctly")
	public void check_that_P1_scored_Bonus_correctly() {
assertEquals(p1.ss.p1.Bonus,0);
	}
	@Then("check that P1 scored Three of a Kind correctly")
	public void check_that_P1_scored_Three_of_a_Kind_correctly() {
assertEquals(p1.ss.p1.threeOfKind,0);
	}
	@Then("check that P1 scored Four of a Kind correctly")
	public void check_that_P1_scored_Four_of_a_Kind_correctly() {
assertEquals(p1.ss.p1.fourOfKind,0);
	}
	@Then("check that P1 scored Full House correctly")
	public void check_that_P1_scored_Full_House_correctly() {
		assertEquals(p1.ss.p1.fullHouse,0);
	}
	@Then("check that P1 scored Small Straight correctly")
	public void check_that_P1_scored_Small_Straight_correctly() {
		assertTrue(p1.ss.p1.smB);
	}
	@Then("check that P1 scored Long Straight correctly")
	public void check_that_P1_scored_Long_Straight_correctly() {
assertEquals(p1.ss.p1.lgStraight,0);
	}
	@Then("check that P1 scored Yahtzee correctly")
	public void check_that_P1_scored_Yahtzee_correctly() {
		assertEquals(p1.ss.p1.Yahtzee,0);
	}
	@Then("check that P1 scored Chance correctly")
	public void check_that_P1_scored_Chance_correctly() {
	assertTrue(p1.ss.p1.chance!=0);
	}
}
