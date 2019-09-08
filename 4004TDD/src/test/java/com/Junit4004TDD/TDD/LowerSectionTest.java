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
		System.out.println("Size: " + NewDiceGroup.size());
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
		System.out.println("Size: " + NewDiceGroup.size());
		assertEquals(NewDiceGroup.size(),4); //size of group should be 4
	}
}
