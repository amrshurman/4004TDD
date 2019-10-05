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
	public void i_am_scoring_for_each_category() {

	}

	@Then("check that player 1 finishes game correctly")
	public void check_that_correct_value_is_stored() {
assertEquals(p1.ss.p1.aces,5);
assertEquals(p1.ss.p1.twos,10);
assertEquals(p1.ss.p1.threes,0);
assertEquals(p1.ss.p1.fours,0);
assertEquals(p1.ss.p1.fives,0);
assertEquals(p1.ss.p1.sixes,0);
assertEquals(p1.ss.p1.Bonus,0);
assertEquals(p1.ss.p1.threeOfKind,12);
assertEquals(p1.ss.p1.fourOfKind,17);
assertEquals(p1.ss.p1.fullHouse,25);
assertEquals(p1.ss.p1.smStraight,30);
assertEquals(p1.ss.p1.lgStraight,40);
assertEquals(p1.ss.p1.Yahtzee,50);

	}

}
