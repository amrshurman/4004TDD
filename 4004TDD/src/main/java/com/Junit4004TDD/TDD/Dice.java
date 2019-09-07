package com.Junit4004TDD.TDD;

import java.util.Random;

public class Dice { //class for INDIVIDUAL die
private int number=0;
	
	public int roll() { //rolls an individual die
		Random r = new Random();
		number = r.nextInt(6) + 1;
		return number;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int i) {
		number = i;
	}
}
