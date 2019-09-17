package com.Junit4004TDD.TDD;

import java.util.ArrayList;

import junit.framework.TestCase;

public class ValuePickedOnceTest extends TestCase{
	public void testSheetNoChange2() { // score sheet values cannot be changed
		Player p1 = new Player("p1");
		Player p2 = new Player("p2");
		Player p3 = new Player("p3");
		DiceGroup dg = new DiceGroup();
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		dg.DiceGroup=DiceGroup;
		d1.setNumber(3); d2.setNumber(3); d3.setNumber(3); d4.setNumber(4); d5.setNumber(5);
		dg.pickDice(p1);
		dg.scoreSetter(p1, "3K");
		dg.pickDice(p1);
		dg.scoreSetter(p1, "3K");
		ScoreSheet ss = new ScoreSheet(p1, p2, p3);
		ss.print(p1);
		//assertEquals(p1.aces, 10);
	}
}
