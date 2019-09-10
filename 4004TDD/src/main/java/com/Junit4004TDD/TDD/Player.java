package com.Junit4004TDD.TDD;

public class Player {
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
	public int smStraight = 0;
	public int lgStraight = 0;
	public int Yahtzee = 0;
	public int chance = 0;
	public int YahtzeeBonus = 0;
	public int TotalLS = 0;
	public int TotalUS = 0;
	public int GrandTotal = 0;
	public boolean acesB=false;
	public boolean twosB=false;
	public boolean threesB=false;
	public boolean foursB=false;
	public boolean fivesB=false;
	public boolean sixesB=false;
	public boolean ThreeKB=false;
	public boolean FourKB=false;
	public boolean smB=false;
	public boolean lB=false;
	public boolean yahtzeeB=false;
	
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
		TotalLS = threeOfKind + fourOfKind + Yahtzee + smStraight + lgStraight + chance + YahtzeeBonus;
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
	public void set(int i,int j) {
		if ((i==1)&&(acesB==false)) {
			aces=j;
			acesB=true;
		}
		if ((i==2)&&(twosB==false)) {
			twos=j;
			twosB=true;
		}
		if ((i==3)&&(threesB==false)) {
			threes=j;
			threesB=true;
		}
		if ((i==4)&&(foursB==false)) {
			fours=j;
			foursB=true;
		}
		if ((i==5)&&(fivesB==false)) {
			fives=j;
			fivesB=true;
		}
		if ((i==6)&&(sixesB==false)) {
			sixes=j;
			sixesB=true;
		}
		if ((i==7)&&(ThreeKB==false)) {
			threeOfKind=j;
			ThreeKB=true;
		}
		if ((i==8)&&(FourKB==false)) {
			fourOfKind=j;
			FourKB=true;
		}
		if ((i==9)&&(smB==false)) {
			smStraight=j;
			smB=true;
		}
		if ((i==10)&&(lB==false)) {
			lgStraight=j;
			lB=true;
		}
		if ((i==11)&&(yahtzeeB==false)) {
			Yahtzee=j;
			yahtzeeB=true;
		}
	}
}
