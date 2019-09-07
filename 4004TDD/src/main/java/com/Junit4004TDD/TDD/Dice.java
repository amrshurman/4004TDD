package com.Junit4004TDD.TDD;

import java.util.Random;

public class Dice {
private int number=0;
	
	public int roll() {
		Random r = new Random();
		number = r.nextInt(6) + 1;
		return number;
	}
}
