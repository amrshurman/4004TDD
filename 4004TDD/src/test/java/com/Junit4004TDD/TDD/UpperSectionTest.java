package com.Junit4004TDD.TDD;

import java.util.ArrayList;

import junit.framework.TestCase;

public class UpperSectionTest extends TestCase{

	public void testCheckUpperAddition() { //should take one and store in aces section as 2.
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(1); d2.setNumber(1); d3.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);
		p1.dg.DiceGroup=DiceGroup;
		p1.set(1, p1.dg.sumUS(1));
		assertEquals(p1.aces,2);
	}
	
	public void testCheckUpperAddition2() { //should take two 2's and disregard the 3. Hence score is 4 in twos
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
	public void testCheckUpperAddition3() { 
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(3); d2.setNumber(6); d3.setNumber(3);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);
		p1.dg.DiceGroup=DiceGroup;
		p1.set(3, p1.dg.sumUS(3));
		assertEquals(p1.threes,6);
	}
	public void testCheckUpperAddition4() { 
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(3); d2.setNumber(4); d3.setNumber(3);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);
		p1.dg.DiceGroup=DiceGroup;
		p1.set(4, p1.dg.sumUS(4));
		assertEquals(p1.fours,4);
	}
	public void testCheckUpperAddition5() { 
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(5); d2.setNumber(5); d3.setNumber(5);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);
		p1.dg.DiceGroup=DiceGroup;
		p1.set(5, p1.dg.sumUS(5));
		assertEquals(p1.fives,15);
	}
	public void testCheckUpperAddition6() { 
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(5); d2.setNumber(6); d3.setNumber(5);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);
		p1.dg.DiceGroup=DiceGroup;
		p1.set(6, p1.dg.sumUS(6));
		assertEquals(p1.sixes,6);
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
	public void testAcesScore() { //test for long chance score
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(1); d2.setNumber(1); d3.setNumber(4); d4.setNumber(6);d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.pickDice(p1);
		p1.dg.scoreSetter(p1,"1");
		assertEquals(p1.aces,2);
	}
	public void testTwosScore() { //test for long chance score
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(1); d2.setNumber(1); d3.setNumber(2); d4.setNumber(6);d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.pickDice(p1);
		p1.dg.scoreSetter(p1,"2");
		assertEquals(p1.twos,4);
	}
	public void testThreesScore() { //test for long chance score
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(1); d2.setNumber(3); d3.setNumber(4); d4.setNumber(6);d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.pickDice(p1);
		p1.dg.scoreSetter(p1,"3");
		assertEquals(p1.threes,3);
	}
	public void testFourScore() { //test for long chance score
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(1); d2.setNumber(3); d3.setNumber(4); d4.setNumber(6);d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.pickDice(p1);
		p1.dg.scoreSetter(p1,"4");
		assertEquals(p1.fours,4);
	}
	public void testFivesScore() { //test for long chance score
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(1); d2.setNumber(5); d3.setNumber(4); d4.setNumber(6);d5.setNumber(5);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.pickDice(p1);
		p1.dg.scoreSetter(p1,"5");
		assertEquals(p1.fives,10);
	}
	public void testSixesScore() { //test for long chance score
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(1); d2.setNumber(3); d3.setNumber(6); d4.setNumber(6);d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.pickDice(p1);
		p1.dg.scoreSetter(p1,"6");
		assertEquals(p1.sixes,12);
	}
}
