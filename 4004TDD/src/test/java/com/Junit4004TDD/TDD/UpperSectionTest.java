package com.Junit4004TDD.TDD;

import java.util.ArrayList;

import junit.framework.TestCase;

public class UpperSectionTest extends TestCase{

	public void testCheckUpperAddition() { //should take two 2's and disregard the 3 and have 4 as the score for twos
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(3);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);
		p1.dg.DiceGroup=DiceGroup;
		p1.set(2, p1.dg.sumUS(2));
		assertEquals(p1.twos,4);
	}
	
	public void testCheckUpperAddition2() { //should take twos and 2 value
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(2); d2.setNumber(6); d3.setNumber(3);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);
		p1.dg.DiceGroup=DiceGroup;
		p1.set(2, p1.dg.sumUS(2));
		assertEquals(p1.twos,2);
	}
	
	public void testUpperTotal() { //should add both 1's and return 2
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		d1.setNumber(1); d2.setNumber(1);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);
		DiceGroup dc= new DiceGroup();
		int total = dc.getTotal(DiceGroup);
		assertEquals(total,2); 
	}
	
	public void testUpperSum() { //proper summation functionality for upper section
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(2); d4.setNumber(3); d5.setNumber(5);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		DiceGroup dc = new DiceGroup();
		dc.DiceGroup=DiceGroup;
		int i=dc.sumUS(2);
		assertEquals(i,6);
	}
}
