package com.Junit4004TDD.TDD;

import java.util.ArrayList;

import junit.framework.TestCase;

public class UpperSectionTest extends TestCase{

	public void testCheckUpperAddition() { //should take two 2's and disregard the 3
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(3);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);
		DiceGroup dc= new DiceGroup();
		ArrayList<Dice> NewDiceGroup= dc.upperAddition(DiceGroup);
		System.out.println(NewDiceGroup.get(1).getNumber());
		System.out.println("Size: " + NewDiceGroup.size());
		assertEquals(NewDiceGroup.get(0).getNumber(),2);
		assertEquals(NewDiceGroup.size(),2);
	}
	
	public void testCheckUpperAddition2() { //should take two 2's and three 3's
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(3); d4.setNumber(3); d5.setNumber(3);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		DiceGroup dc= new DiceGroup();
		ArrayList<Dice> NewDiceGroup= dc.upperAddition(DiceGroup);
		System.out.println("Size: " + NewDiceGroup.size());
		assertEquals(NewDiceGroup.size(),5); //size of group should be 5
		assertEquals(NewDiceGroup.get(4).getNumber(),3);
	}
	
	public void testCheckUpperAddition3() { //should take nothing
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		d1.setNumber(2); d2.setNumber(3);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);
		DiceGroup dc= new DiceGroup();
		ArrayList<Dice> NewDiceGroup= dc.upperAddition(DiceGroup);
		System.out.println("Size: " + NewDiceGroup.size());
		assertEquals(NewDiceGroup.size(),0); //size of group should be 0
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
