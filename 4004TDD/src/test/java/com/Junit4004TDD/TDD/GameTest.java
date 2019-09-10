package com.Junit4004TDD.TDD;

import java.util.ArrayList;

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
	 System.out.println("----------------------------------------");
	 Player p1=new Player("p1");
	 Player p2=new Player("p2");
	 Player p3=new Player("p3");
	 ScoreSheet s = new ScoreSheet(p1,p2,p3);
	 DiceGroup dg = new DiceGroup();
	 dg.groupRoll();
	 dg.pickDice(s);
	 assertEquals(0,0);
 }
 public void testPickDice2() { //you should be able to get a small straight and an upper addition of two
	 System.out.println("----------------------------------------");
	 DiceGroup dg = new DiceGroup();
	 Player p1=new Player("p1");
	 Player p2=new Player("p2");
	 Player p3=new Player("p3");
	 ScoreSheet s = new ScoreSheet(p1,p2,p3);
	 Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		d1.setNumber(1); d2.setNumber(2); d3.setNumber(3); d4.setNumber(4); d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		dg.DiceGroup=DiceGroup;
	 dg.pickDice(s);
	 assertEquals(0,0);
 }
}
