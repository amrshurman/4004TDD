package com.Junit4004TDD.TDD;

import junit.framework.TestCase;

public class UpperSectionTest extends TestCase{

	public void checkUpperAddition() {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(3);
		upperAddition ua= new upperAddition();
		assertEquals(ua,4);
	}
}
