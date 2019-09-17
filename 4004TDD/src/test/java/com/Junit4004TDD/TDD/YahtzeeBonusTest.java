package com.Junit4004TDD.TDD;

import junit.framework.TestCase;
import java.util.ArrayList;

public class YahtzeeBonusTest extends TestCase{
	public void testYahtzeeBonusScore2() { //test for long yahtzee bonus score if spot in upper section is taken
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Dice d3 = new Dice();
		Dice d4 = new Dice();
		Dice d5 = new Dice();
		Player p1=new Player("p1");
		ScoreSheet ss = new ScoreSheet(p1,null,null);
		d1.setNumber(2); d2.setNumber(2); d3.setNumber(2); d4.setNumber(2);d5.setNumber(2);
		ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
		DiceGroup.add(d1);DiceGroup.add(d2);DiceGroup.add(d3);DiceGroup.add(d4);DiceGroup.add(d5);
		p1.dg.DiceGroup=DiceGroup;
		p1.dg.suggestions(p1);
		p1.dg.scoreSetter(p1,"y");
		p1.dg.suggestions(p1); //score another yahtzee with same dice
		p1.dg.scoreSetter(p1,"y");
		p1.dg.suggestions(p1); //score another yahtzee with same dice
		p1.dg.scoreSetter(p1,"y");
		ss.print(p1);
		assertEquals(p1.YahtzeeBonus,200);
	}
}