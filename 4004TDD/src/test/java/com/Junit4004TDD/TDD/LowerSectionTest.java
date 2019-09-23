package com.Junit4004TDD.TDD;

import junit.framework.TestCase;
import java.util.ArrayList;

public class LowerSectionTest extends TestCase{
	public void test3ofKind() { //should take all twos as three of a kind
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(2);d4.setNumber(3);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2); DiceGroup.add(d3); DiceGroup.add(d4); 
		DiceGroup dc= new DiceGroup();
		ArrayList<Dice> NewDiceGroup= dc.OfKind(DiceGroup);
		assertEquals(NewDiceGroup.size(),3); //size of group should be 3
	}
	public void test4ofKind() { //should take all twos as four of a kind
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(2);d4.setNumber(2);d5.setNumber(5);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2); DiceGroup.add(d3); DiceGroup.add(d4); DiceGroup.add(d5); 
		DiceGroup dc= new DiceGroup();
		ArrayList<Dice> NewDiceGroup= dc.OfKind(DiceGroup);
		assertEquals(NewDiceGroup.size(),4); //size of group should be 4
	}
	public void testYahtzee() { //should take all 5
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(2);d4.setNumber(2);d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2); DiceGroup.add(d3); DiceGroup.add(d4); DiceGroup.add(d5); 
		DiceGroup dc= new DiceGroup();
		ArrayList<Dice> NewDiceGroup= dc.OfKind(DiceGroup);
		assertEquals(NewDiceGroup.size(),5); //size of group should be 5
	}
	
	public void testSmallSeq() { //should take 3,4,5,6
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		
		d1.setNumber(1); d2.setNumber(3); d3.setNumber(4);d4.setNumber(5);d5.setNumber(6);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2); DiceGroup.add(d3); DiceGroup.add(d4); DiceGroup.add(d5); 
		DiceGroup dc= new DiceGroup();
		ArrayList<Dice> NewDiceGroup= dc.sequence(DiceGroup);
		assertEquals(NewDiceGroup.size(),4); //size of group should be 4
	}
	public void testSmallSeq2() { //should take 1,2,3,4
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		
		d1.setNumber(1); d2.setNumber(3); d3.setNumber(4);d4.setNumber(5);d5.setNumber(6);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2); DiceGroup.add(d3); DiceGroup.add(d4); DiceGroup.add(d5); 
		DiceGroup dc= new DiceGroup();
		ArrayList<Dice> NewDiceGroup= dc.sequence(DiceGroup);
		assertEquals(NewDiceGroup.size(),4); //size of group should be 4
	}
	public void testlongSeq() { //should take 1,2,3,4,5
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		
		d1.setNumber(4); d2.setNumber(6); d3.setNumber(2);d4.setNumber(5);d5.setNumber(3);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2); DiceGroup.add(d3); DiceGroup.add(d4); DiceGroup.add(d5); 
		DiceGroup dc= new DiceGroup();
		ArrayList<Dice> NewDiceGroup= dc.sequence(DiceGroup);
		assertEquals(NewDiceGroup.size(),5); //size of group should be 5
	}
	public void testFullHouse() { //should take all
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		
		d1.setNumber(1); d2.setNumber(1); d3.setNumber(1);d4.setNumber(2);d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2); DiceGroup.add(d3); DiceGroup.add(d4); DiceGroup.add(d5); 
		DiceGroup dc= new DiceGroup();
		ArrayList<Dice> NewDiceGroup= dc.fullHouse(DiceGroup);
		assertEquals(NewDiceGroup.size(),5); //size of group should be 5
	}
	public void testChance() { //should take sum of all
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		
		d1.setNumber(1); d2.setNumber(1); d3.setNumber(1);d4.setNumber(1);d5.setNumber(1);
		DiceGroup dg= new DiceGroup();
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2); DiceGroup.add(d3); DiceGroup.add(d4); DiceGroup.add(d5); 
		assertEquals(dg.getTotal(DiceGroup),5); 
	}
	public void test3KScore() { //Three of a kind score test
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(1); d2.setNumber(1); d3.setNumber(1); d4.setNumber(2);d5.setNumber(5);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.suggestions(p1);
		p1.dg.scoreSetter(p1,"7");
		assertEquals(p1.threeOfKind,10);
	}
	public void test4KScore() { //four of a kind score test. Should be suggested to add 3 of a kind as well
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(1); d2.setNumber(1); d3.setNumber(1); d4.setNumber(1);d5.setNumber(5);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.suggestions(p1);
		p1.dg.scoreSetter(p1,"8");
		assertEquals(p1.fourOfKind,9);
	}
	public void testFHScore() { //full house score
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(1); d2.setNumber(1); d3.setNumber(1); d4.setNumber(2);d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.suggestions(p1);
		p1.dg.scoreSetter(p1,"9");
		assertEquals(p1.fullHouse,25);
	}
	public void testSsScore() { //test for small straight score
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(1); d2.setNumber(2); d3.setNumber(3); d4.setNumber(4);d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.suggestions(p1);
		p1.dg.scoreSetter(p1,"10");
		assertEquals(p1.smStraight,30);
	}
	public void testLsScore() { //test for long straight score
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(1); d2.setNumber(2); d3.setNumber(3); d4.setNumber(4);d5.setNumber(5);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.suggestions(p1);
		p1.dg.scoreSetter(p1,"11");
		assertEquals(p1.lgStraight,40);
	}
	public void testYahtzeeScore() { //test for long yahtzee score
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(2); d4.setNumber(2);d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.suggestions(p1);
		p1.dg.scoreSetter(p1,"12");
		assertEquals(p1.Yahtzee,50);
	}
	public void testYahtzeeBonusScore() { //test for long yahtzee bonus score if spot in upper section not taken
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(2); d4.setNumber(2);d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.suggestions(p1);
		p1.dg.scoreSetter(p1,"12");
		p1.dg.suggestions(p1); //score another yahtzee with same dice
		p1.dg.scoreSetter(p1,"12");
		assertEquals(p1.Yahtzee,150);
		assertEquals(p1.twos,10);
	}
	public void testChanceScore() { //test for long chance score
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		d1.setNumber(1); d2.setNumber(2); d3.setNumber(4); d4.setNumber(6);d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.suggestions(p1);
		p1.dg.scoreSetter(p1,"13");
		assertEquals(p1.chance,15);
	}
}
