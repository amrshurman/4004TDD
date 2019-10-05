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
		assertEquals(p3.ss.p3.aces,5);
		assertEquals(p3.ss.p3.twos,10);
		assertEquals(p3.ss.p3.threes,15);
		assertEquals(p3.ss.p3.fours,20);
		assertEquals(p3.ss.p3.fives,25);
		assertEquals(p3.ss.p3.sixes,30);
		assertEquals(p3.ss.p3.Bonus,35);
		assertEquals(p3.ss.p3.threeOfKind,12);
		assertEquals(p3.ss.p3.fourOfKind,17);
		assertEquals(p3.ss.p3.fullHouse,25);
		assertEquals(p3.ss.p3.smStraight,30);
		assertEquals(p3.ss.p3.lgStraight,40);
		assertEquals(p3.ss.p3.Yahtzee,150);
		assertTrue(p3.ss.p3.chance!=0);
	}

}
