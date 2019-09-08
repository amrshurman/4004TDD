package com.Junit4004TDD.TDD;

import junit.framework.TestCase;

import java.util.ArrayList;

public class LowerSectionTest extends TestCase{
	public void test3ofKind() { //should take all twos as three of a kind
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2); DiceGroup.add(d3); 
		DiceGroup dc= new DiceGroup();
		ArrayList<Dice> NewDiceGroup= dc.OfKind(DiceGroup);
		assertEquals(NewDiceGroup.size(),3); //size of group should be 3
	}
	public void test4ofKind() { //should take all twos as four of a kind
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(2);d4.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2); DiceGroup.add(d3); DiceGroup.add(d4); 
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
}
