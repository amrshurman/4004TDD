package com.Junit4004TDD.TDD;

public class Player {
public String name;
public int aces=0;
public int twos=0;
public int threes=0;
public int fours=0;
public int fives=0;
public int sixes=0;
public int USBeforeBonus = 0;
public int Bonus = 0;
public int USAfterBonus = 0;
public int threeOfKind = 0;
public int fourOfKind = 0;
public int smStraight = 0;
public int lgStraight = 0;
public int Yahtzee = 0;
public int chance = 0;
public int YahtzeeBonus = 0;
public int TotalLS = 0;
public int TotalUS = 0;
public int GrandTotal = 0;

public Player(String name) {
	this.name=name;
}
public DiceGroup dg = new DiceGroup();

}
