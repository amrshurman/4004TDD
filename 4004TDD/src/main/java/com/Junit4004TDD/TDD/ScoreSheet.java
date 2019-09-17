package com.Junit4004TDD.TDD;

import java.io.Serializable;

public class ScoreSheet implements Serializable {
	public Player p1;
	public Player p2;
	public Player p3;
	int round = 0;
	public int g1 = 0;
	public int g2 = 0;
	public int g3 = 0;

	public ScoreSheet(Player p1, Player p2, Player p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public void roundDone(int i) {
		System.out.println("Round " + i + " Complete!");
		round = i;
	}

	public void winner() {
		if ((p1.GrandTotal > p2.GrandTotal) && (p1.GrandTotal > p3.GrandTotal)) {
			System.out.println(p1.name + " has won the game with: " + p1.GrandTotal + " points!");
		}
		if ((p2.GrandTotal > p1.GrandTotal) && (p2.GrandTotal > p3.GrandTotal)) {
			System.out.println(p2.name + " has won the game with: " + p2.GrandTotal + " points!");
		}
		if ((p3.GrandTotal > p2.GrandTotal) && (p3.GrandTotal > p1.GrandTotal)) {
			System.out.println(p3.name + " has won the game with: " + p3.GrandTotal + " points!");
		}
	}

	public void print(Player p) {
		p.USbefore();p.USafter();p.totLS(); p.totUS(); 
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("|  Name: " + p.name + "          | Current Score: " + p.GrandTotal() + " |          Round: "
				+ p.round + "                                 |");
		System.out.println(
				"|-------------------------------------------------------------------------------------------|");
		System.out.println(
				"|  Ones: " + p.aces + "  | Twos:" + p.twos + "  | Threes: " + p.threes + "  | Fours: " + p.fours
						+ "  | Fives: " + p.fives + "  | Sixes: " + p.sixes + "  | Bonus: " + p.Bonus + "           |");
		System.out.println(
				"|-------------------------------------------------------------------------------------------|");
		System.out.println("|  3 of a kind: " + p.threeOfKind + "  | 4 of a kind:" + p.fourOfKind + "  | Full House: "
				+ p.fullHouse + "  | Sm. Straight: " + p.smStraight + "  | Lg. Straight:" + p.lgStraight + "   |");
		System.out.println(
				"|-------------------------------------------------------------------------------------------|");
		System.out.println("|  YAHTZEE: " + p.Yahtzee + " |   Chance: " + p.chance + " |   YAHTZEE Bonus: "
				+ p.YahtzeeBonus + "                                            |");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
	}

}
