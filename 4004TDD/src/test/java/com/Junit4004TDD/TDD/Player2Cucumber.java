package com.Junit4004TDD.TDD;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class Player2Cucumber extends TestCase{
	Client2 p2 = new Client2();
	int count=0;
	
	@Given("I am playing Yahtzee and run client 2")
	public void i_am_playing_Yahtzee() throws IOException {
		String[] args=new String[1];
		args[0]="test";
		p2.main(args);
	}

	@When("I connect player 2 to the server")
	public void I_connect_player_2_to_the_server() {

	}

	@Then("check that player 2 finishes game correctly")
	public void check_that_player_2_finishes_game_correctly() {
/*		assertTrue(p2.ss.p2.acesB);
		assertTrue(p2.ss.p2.twosB);
		assertEquals(p2.ss.p2.threes,15);
		assertEquals(p2.ss.p2.fours,20);
		assertEquals(p2.ss.p2.fives,25);
		assertTrue(p2.ss.p2.sixesB);
		assertEquals(p2.ss.p2.Bonus,35);
		assertTrue(p2.ss.p2.ThreeKB);
		assertTrue(p2.ss.p2.FourKB);
		assertTrue(p2.ss.p2.fullB);
		assertTrue(p2.ss.p2.smB);
		assertEquals(p2.ss.p2.lgStraight,40);
		assertEquals(p2.ss.p2.Yahtzee,50);
		assertTrue(p2.ss.p2.chance!=0); */
	}
	@Given("I have finished playing a full game of yahtzee with Player 2")
	public void I_have_finished_playing_a_full_game_of_yahtzee_Player_2() throws IOException {
	}
	@Then("check that P2 scored Ones correctly")
	public void check_that_P2_scored_Ones_correctly() {
assertTrue(p2.ss.p2.acesB);
	}
	@Then("check that P2 scored Twos correctly")
	public void check_that_P2_scored_Twos_correctly() {
assertTrue(p2.ss.p2.twosB);
	}
	@Then("check that P2 scored Threes correctly")
	public void check_that_P2_scored_Threes_correctly() {
assertEquals(p2.ss.p2.threes,15);
	}
	@Then("check that P2 scored Fours correctly")
	public void check_that_P2_scored_Fours_correctly() {
assertEquals(p2.ss.p2.fours,20);
	}
	@Then("check that P2 scored Fives correctly")
	public void check_that_P2_scored_Fives_correctly() {
assertEquals(p2.ss.p2.fives,25);
	}
	@Then("check that P2 scored Sixes correctly")
	public void check_that_P2_scored_Sixes_correctly() {
assertTrue(p2.ss.p2.sixesB);
	}
	@Then("check that P2 scored Bonus correctly")
	public void check_that_P2_scored_Bonus_correctly() {
assertEquals(p2.ss.p2.Bonus,35);
	}
	@Then("check that P2 scored Three of a Kind correctly")
	public void check_that_P2_scored_Three_of_a_Kind_correctly() {
		assertTrue(p2.ss.p2.ThreeKB);
	}
	@Then("check that P2 scored Four of a Kind correctly")
	public void check_that_P2_scored_Four_of_a_Kind_correctly() {
		assertTrue(p2.ss.p2.FourKB);
	}
	@Then("check that P2 scored Full House correctly")
	public void check_that_P2_scored_Full_House_correctly() {
		assertTrue(p2.ss.p2.fullB);
	}
	@Then("check that P2 scored Small Straight correctly")
	public void check_that_P2_scored_Small_Straight_correctly() {
assertTrue(p2.ss.p2.smB);
	}
	@Then("check that P2 scored Long Straight correctly")
	public void check_that_P2_scored_Long_Straight_correctly() {
assertEquals(p2.ss.p2.lgStraight,40);
	}
	@Then("check that P2 scored Yahtzee correctly")
	public void check_that_P2_scored_Yahtzee_correctly() {
		assertEquals(p2.ss.p2.Yahtzee,50);
	}
	@Then("check that P2 scored Chance correctly")
	public void check_that_P2_scored_Chance_correctly() {
	assertTrue(p2.ss.p2.chance!=0);
	}
}
