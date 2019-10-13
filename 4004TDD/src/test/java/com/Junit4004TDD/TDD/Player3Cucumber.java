package com.Junit4004TDD.TDD;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class Player3Cucumber extends TestCase{
	Client3 p3 = new Client3();
	int count=0;
	
	@Given("I am playing Yahtzee and run client 3")
	public void i_am_playing_Yahtzee() throws IOException {
		String[] args=new String[1];
		args[0]="test";
		p3.main(args);
	}

	@When("I connect player 3 to the server")
	public void i_am_scoring_for_each_category() {

	}

	@Then("check that player 3 finishes game correctly")
	public void check_that_correct_value_is_stored() {
/*		assertEquals(p3.ss.p3.aces,5);
		assertEquals(p3.ss.p3.twos,10);
		assertEquals(p3.ss.p3.threes,15);
		assertEquals(p3.ss.p3.fours,20);
		assertEquals(p3.ss.p3.fives,25);
		assertEquals(p3.ss.p3.sixes,30);
		assertEquals(p3.ss.p3.Bonus,35);
		assertEquals(p3.ss.p3.threeOfKind,12);
		assertEquals(p3.ss.p3.fourOfKind,19);
		assertEquals(p3.ss.p3.fullHouse,25);
		assertEquals(p3.ss.p3.smStraight,30);
		assertEquals(p3.ss.p3.lgStraight,40);
		assertEquals(p3.ss.p3.Yahtzee,150);
		assertTrue(p3.ss.p3.chance!=0); */
	}
	@Given("I have finished playing a full game of yahtzee with Player 3")
	public void I_have_finished_playing_a_full_game_of_yahtzee_with_Player_3() throws IOException {
	}
	@Then("check that P3 scored Ones correctly")
	public void check_that_P3_scored_Ones_correctly() {
assertEquals(p3.ss.p3.aces,5);
	}
	@Then("check that P3 scored Twos correctly")
	public void check_that_P3_scored_Twos_correctly() {
assertEquals(p3.ss.p3.twos,10);
	}
	@Then("check that P3 scored Threes correctly")
	public void check_that_P3_scored_Threes_correctly() {
assertEquals(p3.ss.p3.threes,15);
	}
	@Then("check that P3 scored Fours correctly")
	public void check_that_P3_scored_Fours_correctly() {
assertEquals(p3.ss.p3.fours,20);
	}
	@Then("check that P3 scored Fives correctly")
	public void check_that_P3_scored_Fives_correctly() {
assertEquals(p3.ss.p3.fives,25);
	}
	@Then("check that P3 scored Sixes correctly")
	public void check_that_P3_scored_Sixes_correctly() {
assertEquals(p3.ss.p3.sixes,30);
	}
	@Then("check that P3 scored Bonus correctly")
	public void check_that_P3_scored_Bonus_correctly() {
assertEquals(p3.ss.p3.Bonus,35);
	}
	@Then("check that P3 scored Three of a Kind correctly")
	public void check_that_P3_scored_Three_of_a_Kind_correctly() {
assertEquals(p3.ss.p3.threeOfKind,12);
	}
	@Then("check that P3 scored Four of a Kind correctly")
	public void check_that_P3_scored_Four_of_a_Kind_correctly() {
assertEquals(p3.ss.p3.fourOfKind,19);
	}
	@Then("check that P3 scored Full House correctly")
	public void check_that_P3_scored_Full_House_correctly() {
		assertEquals(p3.ss.p3.fullHouse,25);
	}
	@Then("check that P3 scored Small Straight correctly")
	public void check_that_P3_scored_Small_Straight_correctly() {
		assertEquals(p3.ss.p3.smStraight,30);
	}
	@Then("check that P3 scored Long Straight correctly")
	public void check_that_P3_scored_Long_Straight_correctly() {
assertEquals(p3.ss.p3.lgStraight,40);
	}
	@Then("check that P3 scored Yahtzee correctly")
	public void check_that_P3_scored_Yahtzee_correctly() {
		assertEquals(p3.ss.p3.Yahtzee,150);
	}
	@Then("check that P3 scored Chance correctly")
	public void check_that_P3_scored_Chance_correctly() {
	assertTrue(p3.ss.p3.chance!=0);
	}
}
