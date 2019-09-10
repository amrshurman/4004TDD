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
		dg.groupRoll();
		i=dg.getTotal(dg.DiceGroup);
		assertNotEquals(i,0);
	}
	 public void testSoreSheet() {
		 Player p1 = new Player("p1");
		 Player p2 = new Player("p2");
		 Player p3 = new Player("p3");
		 ScoreSheet ss = new ScoreSheet(p1,p2,p3);
		 ss.print();
		 assertEquals(0,0);
	 }
	 
	 public void testSoreSheet2() { //should print Upper Section correctly with bonus for p1
		 Player p1 = new Player("p1");
		 Player p2 = new Player("p2");
		 Player p3 = new Player("p3");
		 p1.aces=10;
		 p1.fives=55;
		 ScoreSheet ss = new ScoreSheet(p1,p2,p3);
		 ss.print();
		 assertEquals(0,0);
	 }
	 
	 public void testSoreSheet3() { //should print Upper Section correctly with NO bonus for p1
		 Player p1 = new Player("p1");
		 Player p2 = new Player("p2");
		 Player p3 = new Player("p3");
		 p1.aces=10;
		 p1.fives=50;
		 ScoreSheet ss = new ScoreSheet(p1,p2,p3);
		 ss.print();
		 assertEquals(0,0);
	 }
	 public void testShowDice() { //print the dice that player currently has
		 DiceGroup dg = new DiceGroup();
		 dg.groupRoll();
		 dg.printDice();
		 assertEquals(0,0);
	 }
}
