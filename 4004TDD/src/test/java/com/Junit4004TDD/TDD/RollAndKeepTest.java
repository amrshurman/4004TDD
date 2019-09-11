package com.Junit4004TDD.TDD;

import java.util.ArrayList;

import junit.framework.TestCase;

public class RollAndKeepTest extends TestCase{
	 public void testRollAndKeep() { //test keeping some of the dice and rolling the rest
		 Player p1 = new Player("p1");
		 Player p2 = new Player("p2");
		 Player p3 = new Player("p3");
			Dice d1 = new Dice();
			Dice d2 = new Dice();
			Dice d3 = new Dice();
			Dice d4 = new Dice();
			Dice d5 = new Dice();
			d1.setNumber(1); d2.setNumber(2); d3.setNumber(2); d4.setNumber(3); d5.setNumber(5);
			ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
			DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
			p1.dg.DiceGroup=DiceGroup;
		 p1.rollAndKeep();
		 assertEquals(p1.aces,10);
	 }
}
