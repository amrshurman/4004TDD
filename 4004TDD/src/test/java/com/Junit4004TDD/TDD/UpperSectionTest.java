package com.Junit4004TDD.TDD;

import java.util.ArrayList;

import junit.framework.TestCase;

public class UpperSectionTest extends TestCase{

	public void testCheckUpperAddition() { //should take two 2's and disregard the 3
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(3);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);
		DiceGroup dc= new DiceGroup();
		ArrayList<Dice> NewDiceGroup= dc.upperAddition(DiceGroup);
		System.out.println(NewDiceGroup.get(1).getNumber());
		assertEquals(NewDiceGroup.get(0).getNumber(),2);
	}
}
