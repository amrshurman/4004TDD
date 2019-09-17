package com.Junit4004TDD.TDD;

import java.io.Serializable;

public class Player implements Serializable {
	public String name;
	public int aces = 0;
	public int twos = 0;
	public int threes = 0;
	public int fours = 0;
	public int fives = 0;
	public int sixes = 0;
	public int USBeforeBonus = 0;
	public int Bonus = 0;
	public int USAfterBonus = 0;
	public int threeOfKind = 0;
	public int fourOfKind = 0;
	public int fullHouse = 0;
	public int smStraight = 0;
	public int lgStraight = 0;
	public int Yahtzee = 0;
	public int chance = 0;
	public int YahtzeeBonus = 0;
	public int TotalLS = 0;
	public int TotalUS = 0;
	public int GrandTotal = 0;
	public boolean acesB = false;
	public boolean twosB = false;
	public boolean threesB = false;
	public boolean foursB = false;
	public boolean fivesB = false;
	public boolean sixesB = false;
	public boolean ThreeKB = false;
	public boolean FourKB = false;
	public boolean fullB = false;
	public boolean smB = false;
	public boolean lB = false;
	public boolean yahtzeeB = false;
	public boolean yahtzeeB2 = false;
	public boolean chanceB = false;
	public int round = 1;

	public Player(String name) {
		this.name = name;
	}

	public DiceGroup dg = new DiceGroup();

	public int USbefore() {
		if ((aces + twos + threes + fours + fives + sixes) > 62) {
			Bonus = 35;
		}
		return (aces + twos + threes + fours + fives + sixes);
	}

	public int USafter() {
		USAfterBonus = Bonus + aces + twos + threes + fours + fives + sixes;
		return USAfterBonus;
	}

	public int totLS() {
		TotalLS = threeOfKind + fourOfKind + Yahtzee + smStraight + lgStraight + chance + YahtzeeBonus + fullHouse;
		return TotalLS;
	}

	public int totUS() {
		TotalUS = USAfterBonus;
		return TotalUS;
	}

	public int GrandTotal() {
		GrandTotal = TotalUS + TotalLS;
		return GrandTotal;
	}

	public void set(int i, int j) {
		if (i == 1) {
			if ((acesB == false)||(yahtzeeB2==true)) {
				aces = j;
				acesB = true;
				yahtzeeB2=false;
			} else {
				System.out.println("Score category cannot be set more than once!");
			}
		}
		if (i == 2) {
			if ((twosB == false)||(yahtzeeB2==true)) {
				twos = j;
				twosB = true;
				yahtzeeB2=false;
			} else {
				System.out.println("Score category cannot be set more than once!");
			}
		}
		if (i == 3) {
			if ((threesB == false)||(yahtzeeB2==true)) {
				threes = j;
				threesB = true;
				yahtzeeB2=false;
			} else {
				System.out.println("Score category cannot be set more than once!");
			}
		}
		if ((i == 4)||(yahtzeeB2==true)) {
			if (foursB == false) {
				fours = j;
				foursB = true;
				yahtzeeB2=false;
			} else {
				System.out.println("Score category cannot be set more than once!");
			}
		}
		if ((i == 5)||(yahtzeeB2==true)) {
			if (fivesB == false) {
				fives = j;
				fivesB = true;
				yahtzeeB2=false;
			}
		}
		if ((i == 6)||(yahtzeeB2==true)) {
			if (sixesB == false) {
				sixes = j;
				sixesB = true;
				yahtzeeB2=false;
			} else {
				System.out.println("Score category cannot be set more than once!");
			}
		}
		if ((i == 7)||(yahtzeeB2==true)) {
			if (ThreeKB == false) {
				threeOfKind = j;
				ThreeKB = true;
				yahtzeeB2=false;
			} else {
				System.out.println("Score category cannot be set more than once!");
			}
		}
		if ((i == 8)||(yahtzeeB2==true)) {
			if (FourKB == false) {
				fourOfKind = j;
				FourKB = true;
				yahtzeeB2=false;
			} else {
				System.out.println("Score category cannot be set more than once!");
			}
		}
		if ((i == 9)||(yahtzeeB2==true)) {
			if (fullB == false) {
				fullHouse = j;
				fullB = true;
				yahtzeeB2=false;
			} else {
				System.out.println("Score category cannot be set more than once!");
			}
		}
		if ((i == 10)||(yahtzeeB2==true)) {
			if (smB == false) {
				smStraight = j;
				smB = true;
				yahtzeeB2=false;
			} else {
				System.out.println("Score category cannot be set more than once!");
			}
		}
		if ((i == 11)||(yahtzeeB2==true)) {
			if (lB == false) {
				lgStraight = j;
				lB = true;
				yahtzeeB2=false;
			} else {
				System.out.println("Score category cannot be set more than once!");
			}
		}
		if ((i == 13)||(yahtzeeB2==true)) {
			if (chanceB == false) {
				chance = j;
				chanceB = true;
				yahtzeeB2=false;
			} else {
				System.out.println("Score category cannot be set more than once!");
			}
		}
	}
	public void setY(int i, int j, int z) {
		if (i == 12) {
			if (yahtzeeB == false) {
				Yahtzee = j;
				yahtzeeB = true;
			} else {
				YahtzeeBonus += 100;
				yahtzeeB2 = true;
				System.out.println("100 points added to Yahtzee! You must also score in another category!");
				if (YahtzeeBonus(z)==false) {
					System.out.println("Not able to score in the same numbered upper section since it is already taken so you must choose another place to score!");
				dg.fh=true;
				dg.sseq=true;
				dg.lseq=true;
					String choice = dg.inputChoice(this);
				dg.scoreSetter(this, choice);
				}
			}
		}
	}
	public boolean YahtzeeBonus(int z) {
		if (z==1) {
			if (acesB==false) {
				aces=5;
				acesB=true;
				System.out.println("added 5 points to ones!");
				return true;
			}
		}
		if (z==2) {
			if (twosB==false) {
				twos=10;
				twosB=true;
				System.out.println("added 10 points to twos!");
				return true;
			}
		}
		if (z==3) {
			if (threesB==false) {
				threes=15;
				threesB=true;
				System.out.println("added 15 points to threes!");
				return true;
			}
		}
		if (z==4) {
			if (foursB==false) {
				fours=20;
				foursB=true;
				System.out.println("added 20 points to fours!");
				return true;
			}
		}
		if (z==5) {
			if (fivesB==false) {
				fives=25;
				fivesB=true;
				System.out.println("added 25 points to fives!");
				return true;
			}
		}
		if (z==6) {
			if (sixesB==false) {
				sixes=30;
				sixesB=true;
				System.out.println("added 30 points to sixes!");
				return true;
			}
		}
		return false;
	}
}
