package com.Junit4004TDD.TDD;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class ServerCucumber extends TestCase{
	Server s = new Server();
	int count=0;
	
	@Given("I am playing Yahtzee")
	public void i_am_playing_Yahtzee() throws UnknownHostException, IOException {
		String[] args=new String[1];
		args[0]="test";
		s.main(args);
	}

	@When("I am scoring for each category")
	public void i_am_scoring_for_each_category() {

	}

	@Then("check that correct value is stored")
	public void check_that_correct_value_is_stored() {

	}

}
