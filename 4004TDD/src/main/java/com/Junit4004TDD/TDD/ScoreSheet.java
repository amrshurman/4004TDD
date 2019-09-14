package com.Junit4004TDD.TDD;

public class ScoreSheet {
	public Player p1;
	public Player p2;
	public Player p3;

	public ScoreSheet(Player p1, Player p2, Player p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public void print() {
		System.out.println("FIRST PLACE:");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Upper Section | " + p1.name + "  |  " + p2.name + "  |  " + p3.name);
		System.out.println("        Aces  | " + p1.aces + "   |  " + p2.aces + "   |  " + p3.aces);
		System.out.println("        Twos  | " + p1.twos + "   |  " + p2.twos + "   |  " + p3.twos);
		System.out.println("      Threes  | " + p1.threes + "   |  " + p2.threes + "   |  " + p3.threes);
		System.out.println("       Fours  | " + p1.fours + "   |  " + p2.fours + "   |  " + p3.fours);
		System.out.println("       Fives  | " + p1.fives + "   |  " + p2.fives + "   |  " + p3.fives);
		System.out.println("       Sixes  | " + p1.sixes + "   |  " + p2.sixes + "   |  " + p3.sixes);
		System.out.println("  Total Score | " + p1.USbefore() + "   |  " + p2.USbefore() + "   |  " + p3.USbefore());
		System.out.println("       Bonus  | " + p1.Bonus + "   |  " + p2.Bonus + "   |  " + p3.Bonus);
		System.out.println("       Total  | " + p1.USafter() + "   |  " + p2.USafter() + "   |  " + p3.USafter());
		System.out.println("Lower Section");
		System.out.println(" 3 of a kind  | " + p1.threeOfKind + "   |  " + p2.threeOfKind + "   |  " + p3.threeOfKind);
		System.out.println(" 4 of a kind  | " + p1.fourOfKind + "   |  " + p2.fourOfKind + "   |  " + p3.fourOfKind);
		System.out.println("  Full House  | " + p1.fullHouse + "   |  " + p2.fullHouse + "   |  " + p3.fullHouse);
		System.out.println("Sm. Straight  | " + p1.smStraight + "   |  " + p2.smStraight + "   |  " + p3.smStraight);
		System.out.println("Lg. Straight  | " + p1.lgStraight + "   |  " + p2.lgStraight + "   |  " + p3.lgStraight);
		System.out.println("     YAHTZEE  | " + p1.Yahtzee + "   |  " + p2.Yahtzee + "   |  " + p3.Yahtzee);
		System.out.println("      chance  | " + p1.chance + "   |  " + p2.chance + "   |  " + p3.chance);
		System.out.println(
				"YAHTZEE Bonus | " + p1.YahtzeeBonus + "   |  " + p2.YahtzeeBonus + "   |  " + p3.YahtzeeBonus);
		System.out.println("Total Lower   | " + p1.totLS() + "   |  " + p2.totLS() + "   |  " + p3.totLS());
		System.out.println("Total Upper   | " + p1.totUS() + "   |  " + p2.totUS() + "   |  " + p3.totUS());
		System.out.println("---------------------------------");
		System.out.println(
				"Grand Total   | " + p1.GrandTotal() + "   |  " + p2.GrandTotal() + "   |  " + p3.GrandTotal());

	}

}
