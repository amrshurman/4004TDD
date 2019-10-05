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
	public void i_am_scoring_for_each_category() {

	}

	@Then("check that player 2 finishes game correctly")
	public void check_that_correct_value_is_stored() {
		assertEquals(p2.ss.p2.aces,5);
		assertEquals(p2.ss.p2.twos,10);
		assertEquals(p2.ss.p2.threes,15);
		assertEquals(p2.ss.p2.fours,20);
		assertEquals(p2.ss.p2.fives,25);
		assertEquals(p2.ss.p2.sixes,30);
		assertEquals(p2.ss.p2.Bonus,35);
		assertEquals(p2.ss.p2.threeOfKind,12);
		assertEquals(p2.ss.p2.fourOfKind,17);
		assertEquals(p2.ss.p2.fullHouse,25);
		assertEquals(p2.ss.p2.smStraight,30);
		assertEquals(p2.ss.p2.lgStraight,40);
		assertEquals(p2.ss.p2.Yahtzee,50);
	}

}
