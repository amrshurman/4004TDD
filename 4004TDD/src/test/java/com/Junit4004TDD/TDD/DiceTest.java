package com.Junit4004TDD.TDD;

import junit.framework.TestCase;
import static org.junit.Assert.assertNotEquals;
public class DiceTest extends TestCase{
	
	public void testRoll() { //tests whether a roll is possible or not
	Dice d = new Dice();
	int i=0;
	i = d.roll();
	assertNotEquals(i,0); //if roll works then we should get a NON ZERO value as a roll
	}
	
	public void testGroupRoll() { //tests whether multiple rolls can be done at once. Also tests the "total number for the Dice Group" functionality
		DiceGroup dg = new DiceGroup();
		int i = 0;
		dg.groupRoll(dg.DiceGroup);
		i=dg.getTotal(dg.DiceGroup);
		assertNotEquals(i,0);
	}
	
}
