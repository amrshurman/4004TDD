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
		p.USbefore();
		p.USafter();
		p.totLS();
		p.totUS();
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("|  Name: " + p.name + "          | Current Score: " + p.GrandTotal() + " |          Round: "
				+ p.round + "                                 |");
		System.out.println(
				"|-------------------------------------------------------------------------------------------|");
		System.out.println(
				"|  Ones: " + p.sPrint(1) + "  | Twos:" + p.sPrint(2) + "  | Threes: " + p.sPrint(3) + "  | Fours: " + p.sPrint(4)
						+ "  | Fives: " + p.sPrint(5) + "  | Sixes: " + p.sPrint(6) + "  | Bonus: " + p.Bonus + "           |");
		System.out.println(
				"|-------------------------------------------------------------------------------------------|");
		System.out.println("|  3 of a kind: " + p.sPrint(7) + "  | 4 of a kind:" + p.sPrint(8) + "  | Full House: "
				+ p.sPrint(9) + "  | Sm. Straight: " + p.sPrint(10) + "  | Lg. Straight:" + p.sPrint(11) + "   |");
		System.out.println(
				"|-------------------------------------------------------------------------------------------|");
		System.out.println("|  YAHTZEE: " + p.sPrint(12) + " |   Chance: " + p.sPrint(13)
				+ "                                                                |");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
	}
}
