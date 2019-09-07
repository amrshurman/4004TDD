package com.Junit4004TDD.TDD;

import junit.framework.TestCase;
import static org.junit.Assert.assertNotEquals;
public class DiceTest extends TestCase{
	
	public void testRoll() {
	Dice d = new Dice();
	int i=0;
	i = d.roll();

	assertNotEquals(i,0);
	}
	
	
	
}
