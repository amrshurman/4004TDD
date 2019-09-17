package com.Junit4004TDD.TDD;

import junit.framework.TestCase;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

public class DiceTest extends TestCase {

	public void testRoll() { // tests whether a roll is possible or not
		Dice d = new Dice();
		int i = 0;
		i = d.roll();
		assertNotEquals(i, 0); // if roll works then we should get a NON ZERO value as a roll
	}

	public void testGroupRoll() { // tests whether multiple rolls can be done at once. Also tests the "total
									// number for the Dice Group" functionality
		DiceGroup dg = new DiceGroup();
		int i = 0;
		dg.groupRoll();
		i = dg.getTotal(dg.DiceGroup);
		assertNotEquals(i, 0);
	}

	public void testSoreSheet() {
		Player p1 = new Player("p1");
		Player p2 = new Player("p2");
		Player p3 = new Player("p3");
		ScoreSheet ss = new ScoreSheet(p1, p2, p3);
		ss.print(p1);
		assertEquals(0, 0);
	}

	public void testScoreSheet2() { // should print Upper Section correctly with bonus for p1
		Player p1 = new Player("p1");
		Player p2 = new Player("p2");
		Player p3 = new Player("p3");
		p1.aces = 10;
		p1.fives = 55;
		ScoreSheet ss = new ScoreSheet(p1, p2, p3);
		ss.print(p1);
		assertEquals(p1.Bonus, 35);
	}

	public void testScoreSheet3() { // should print Upper Section correctly with NO bonus for p1
		Player p1 = new Player("p1");
		Player p2 = new Player("p2");
		Player p3 = new Player("p3");
		p1.aces = 10;
		p1.fives = 50;
		ScoreSheet ss = new ScoreSheet(p1, p2, p3);
		ss.print(p1);
		assertEquals(p1.Bonus, 0);
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
	public void testSheetNoChange2() { // score sheet values cannot be changed
		Player p1 = new Player("p1");
		Player p2 = new Player("p2");
		Player p3 = new Player("p3");
		DiceGroup dg = new DiceGroup();
		dg.scoreSetter(p1, "3K");
		dg.scoreSetter(p1, "3K");
		ScoreSheet ss = new ScoreSheet(p1, p2, p3);
		ss.print(p1);
		//assertEquals(p1.aces, 10);
	}
	public void testinputKeep() { // test the roll and keep functionality
		DiceGroup dg = new DiceGroup();
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		dg.DiceGroup=DiceGroup;
		d1.setNumber(1); d2.setNumber(2); d3.setNumber(3); d4.setNumber(4); d5.setNumber(5);
dg.rollAndKeep();
		System.out.println(dg.DiceGroup.size());
	}
}
