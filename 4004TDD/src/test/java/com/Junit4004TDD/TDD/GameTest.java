package com.Junit4004TDD.TDD;

import junit.framework.TestCase;

public class GameTest extends TestCase{ //should print score sheet properly
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
 public void testPickDice() { //you should be able to pick the dice that you want and reroll the rest 
	 DiceGroup dg = new DiceGroup();
	 dg.groupRoll();
	 dg.pickDice();
	 assertEquals(0,0);
 }
}
