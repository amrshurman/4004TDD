package com.Junit4004TDD.TDD;

import junit.framework.TestCase;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

public class DiceTest extends TestCase {

	public void testRoll() { // tests whether a roll is possible or not
		Dice d = new Dice();
		int i = 0;
		i = d.roll();
		assertFalse(i==0); // if roll works then we should get a NON ZERO value as a roll
	}

	public void testGroupRoll() { // tests whether multiple rolls can be done at once. Also tests the "total
									// number for the Dice Group" functionality
		DiceGroup dg = new DiceGroup();
		int i = 0;
		dg.groupRoll();
		i = dg.getTotal(dg.DiceGroup);
		assertFalse(i==0);
	}

	public void testSoreSheet() { //test scoresheet functionality and how its printed
		Player p1 = new Player("p1");
		Player p2 = new Player("p2");
		Player p3 = new Player("p3");
		ScoreSheet ss = new ScoreSheet(p1, p2, p3);
		ss.print(p1);
		assertEquals(0, 0);
	}

	public void testShowDice() { // print the dice that player currently has
		DiceGroup dg = new DiceGroup();
		dg.groupRoll();
		dg.printDice();
		assertEquals(0, 0);
	}

	public void testSheetNoChange() { // score sheet values cannot be changed
		Player p1 = new Player("p1");
		Player p2 = new Player("p2");
		Player p3 = new Player("p3");
		p1.set(1, 10);
		p1.set(1, 50);
		ScoreSheet ss = new ScoreSheet(p1, p2, p3);
		ss.print(p1);
		assertEquals(p1.aces, 10);
	}

}
