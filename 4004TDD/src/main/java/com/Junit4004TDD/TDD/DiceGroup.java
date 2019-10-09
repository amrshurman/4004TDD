package com.Junit4004TDD.TDD;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class DiceGroup implements Serializable { // class for GROUP of dice
	ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
	boolean threeK = false;
	boolean fourK = false;
	boolean sseq = false;
	boolean lseq = false;
	boolean fh = false;
	boolean y = false;

	boolean onesSet = false;
	boolean twosSet = false;
	boolean threesSet = false;
	boolean foursSet = false;
	boolean fivesSet = false;
	boolean sixesSet = false;
	boolean threeKSet = false;
	boolean fourKSet = false;
	boolean sseqSet = false;
	boolean lseqSet = false;
	boolean fhSet = false;
	boolean ySet = false;
	boolean chanceSet = false;
int testPick=1;
	public DiceGroup() { // initializes the total 5 dice
		for (int i = 0; i < 5; i++) {
			Dice d = new Dice();
			DiceGroup.add(d);
		}
	}

	public void groupRoll() { // roll all selected dice
		for (int i = 0; i < DiceGroup.size(); i++) {
			DiceGroup.get(i).roll();
		}
	}

	public int getTotal(ArrayList<Dice> d) { // get total number of selected dice
		int t = 0;
		for (int i = 0; i < d.size(); i++) {
			t += d.get(i).getNumber();
		}
		return t;
	}

	public void printDice() {
		// System.out.println("-----------------------------------------------");
		System.out.println("You rolled:");
		System.out.println(" (1)       (2)       (3)       (4)       (5)");
		System.out.println("-----     -----     -----     -----     -----");
		System.out.println("| " + DiceGroup.get(0).getNumber() + " |     | " + DiceGroup.get(1).getNumber()
				+ " |     | " + DiceGroup.get(2).getNumber() + " |     | " + DiceGroup.get(3).getNumber() + " |     | "
				+ DiceGroup.get(4).getNumber() + " |");
		System.out.println("-----     -----     -----     -----     -----");

		System.out.println("-----------------------------------------------");
	}

	public ArrayList<Dice> OfKind(ArrayList<Dice> d) {
		ArrayList<Dice> fd = new ArrayList<Dice>();
		for (int i = 0; i < d.size(); i++) {
			int count = 0;
			int target = 0;
			target = d.get(i).getNumber();
			for (int j = 0; j < d.size(); j++) {
				if (target == d.get(j).getNumber()) {
					count++;
				}
			}
			if (count > 2) { // if we find any group of duplicated numbers then we add to list of upper
								// addition group
				fd.add(d.get(i));
			}
		}
		return fd;
	}

	public ArrayList<Dice> sequence(ArrayList<Dice> d) {
		ArrayList<Dice> empty = new ArrayList<Dice>();
		ArrayList<Dice> fd = new ArrayList<Dice>();
		int count = 0;
		for (int i = 0; i < d.size(); i++) {
			ArrayList<Dice> tempd = new ArrayList<Dice>();
			Dice td = new Dice();
			if (d.get(i).getNumber() < 4) {
				count = 0;
				td = d.get(i);
				tempd.add(td);
				count++;
				for (int z = 0; z < d.size(); z++) {
					for (int j = 0; j < d.size(); j++) {
						if (td.getNumber() == (d.get(j).getNumber() - 1)) {
							td = d.get(j);
							tempd.add(td);
							count++;
						}
					}
				}
			}
			if (fd.size() < tempd.size()) {
				fd = tempd;
			}
		}
		if (fd.size() > 3) {
			return fd;
		} else
			return empty;
	}

	public ArrayList<Dice> fullHouse(ArrayList<Dice> d) {
		ArrayList<Dice> empty = new ArrayList<Dice>();
		ArrayList<Dice> fd = new ArrayList<Dice>();
		ArrayList<Dice> fd2 = new ArrayList<Dice>();
		for (int i = 0; i < d.size(); i++) {
			int count = 0;
			int target = 0;
			target = d.get(i).getNumber();
			for (int j = 0; j < d.size(); j++) {
				if (target == d.get(j).getNumber()) {
					count++;
				}
			}
			if (count == 3) { // if we find any group of duplicated numbers then we add to list
				fd.add(d.get(i));
				fd.add(d.get(i));
				fd.add(d.get(i));
				for (int k = 0; k < d.size(); k++) {
					if (target != d.get(k).getNumber()) {
						fd2.add(d.get(k));
					}
				}
				if (fd2.size() == 2) {
					if (fd2.get(0).getNumber() == fd2.get(1).getNumber()) {
						fd.add(fd2.get(0));
						fd.add(fd2.get(1));
						return fd;
					}
				}
			}
		}
		return empty;
	}

	public void pickDice(Player p) {

		if (OfKind(DiceGroup).size() == 5) {
			y = true;
		}
		if (OfKind(DiceGroup).size() == 3) {
			threeK = true;
		}
		if (OfKind(DiceGroup).size() >= 4) {
			fourK = true;
		}
		if (sequence(DiceGroup).size() >= 4) {
			sseq = true;
		}
		if (sequence(DiceGroup).size() >= 5) {
			lseq = true;
		}
		if (fullHouse(DiceGroup).size() == 5) {
			fh = true;
		}
	}

	public void suggestions(Player p) {
		System.out.println("Suggestions for the lower section of the score sheet: ");

		if (OfKind(DiceGroup).size() == 5) {
			System.out.print("YAHTZEE! for values: ");
			y = true;
			for (int i = 0; i < OfKind(DiceGroup).size(); i++) {
				System.out.print(OfKind(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		if (OfKind(DiceGroup).size() >= 3) {
			threeK = true;
			System.out.print("This group has a 3 of a kind: ");
			for (int i = 0; i < 3; i++) {
				System.out.print(OfKind(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		if (OfKind(DiceGroup).size() >= 4) {
			fourK = true;
			System.out.print("This group has a 4 of a kind: ");
			for (int i = 0; i < 4; i++) {
				System.out.print(OfKind(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		if (sequence(DiceGroup).size() == 4) {
			sseq = true;
			System.out.print("This group has a small straight with the numbers: ");
			for (int i = 0; i < sequence(DiceGroup).size(); i++) {
				System.out.print(sequence(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		if (sequence(DiceGroup).size() == 5) {
			lseq = true;
			System.out.print("This group has a long straight with the numbers: ");
			for (int i = 0; i < sequence(DiceGroup).size(); i++) {
				System.out.print(sequence(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		if (fullHouse(DiceGroup).size() > 0) {
			fh = true;
			System.out.print("This group has a full house with the numbers: ");
			for (int i = 0; i < fullHouse(DiceGroup).size(); i++) {
				System.out.print(fullHouse(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
	}

	public String inputChoice(Player p) {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.println("Type (1) to score in ones. Type (2) to score in twos. Type (3) to score in threes.");
		System.out
				.println("Type (4) to score fours value. Type (5) to scratch fives value. Type (6) to score in sixes.");
		System.out
				.println("Type (7) to score 3 of a kind value. Type (8) to score 4 of a kind value. Type (9) to score");
		System.out
				.println(" in Full House. Type (10) to score in small straight. Type (11) to score in long straight.");
		System.out.println("Type (12) to score in YAHTZEE. Type (13) to score in chance.");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		Scanner s = new Scanner(System.in);
		String choice = s.nextLine();
		return choice;
	}

	public String inputChoiceTest(Player p,int i) {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		System.out.println("Type (1) to score in ones. Type (2) to score in twos. Type (3) to score in threes.");
		System.out
				.println("Type (4) to score fours value. Type (5) to scratch fives value. Type (6) to score in sixes.");
		System.out
				.println("Type (7) to score 3 of a kind value. Type (8) to score 4 of a kind value. Type (9) to score");
		System.out
				.println(" in Full House. Type (10) to score in small straight. Type (11) to score in long straight.");
		System.out.println("Type (12) to score in YAHTZEE. Type (13) to score in chance.");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		String choice = String.valueOf(i);
		if (p.name.equals("Rob")&&(i==6)) {
			System.out.println(12);
			return "12";
		}
		if (p.name.equals("Bob")&&(i==1)) {
			System.out.println(6);
			return "6";
		}
		if (p.name.equals("Bob")&&(i==2)) {
			System.out.println(9);
			return "9";
		}
		if (p.name.equals("Bob")&&(i==3)) {
			System.out.println(7);
			return "7";
		}
		if (p.name.equals("Bob")&&(i==5)) {
			System.out.println(3);
			return "3";
		}
		if (p.name.equals("Bob")&&(i==4)) {
			System.out.println(2);
			return "2";
		}
		if (p.name.equals("Bob")&&(i==6)) {
			System.out.println(4);
			return "4";
		}
		if (p.name.equals("Bob")&&(i==7)) {
			System.out.println(11);
			return "11";
		}
		if (p.name.equals("Bob")&&(i==8)) {
			System.out.println(1);
			return "1";
		}
		if (p.name.equals("Bob")&&(i==9)) {
			System.out.println(5);
			return "5";
		}
		if (p.name.equals("Bob")&&(i==10)) {
			System.out.println(12);
			return "12";
		}
		if (p.name.equals("Bob")&&(i==11)) {
			System.out.println(8);
			return "8";
		}
		if (p.name.equals("Bob")&&(i==12)) {
			System.out.println(10);
			return "10";
		}
		System.out.println(i);
		testPick=i;
		return choice;
	}

	public void scoreSetter(Player p, String choice) {
		if (choice.equals("1")) {
			if (onesSet == false) {
				p.set(1, sumUS(1));
				onesSet = true;
			} else {
				System.out.println("You cannot select this value because you already set the value here.");
				scoreSetter(p, inputChoice(p));
			}
		}
		if (choice.equals("2")) {
			if (twosSet == false) {
				p.set(2, sumUS(2));
				twosSet = true;
			} else {
				System.out.println("You cannot select this value because you already set the value here.");
				scoreSetter(p, inputChoice(p));
			}
		}
		if (choice.equals("3")) {
			if (threesSet == false) {
				p.set(3, sumUS(3));
				threesSet = true;
			} else {
				System.out.println("You cannot select this value because you already set the value here.");
				scoreSetter(p, inputChoice(p));
			}
		}
		if (choice.equals("4")) {
			if (foursSet == false) {
				p.set(4, sumUS(4));
				foursSet = true;
			} else {
				System.out.println("You cannot select this value because you already set the value here.");
				scoreSetter(p, inputChoice(p));
			}
		}
		if (choice.equals("5")) {
			if (fivesSet == false) {
				p.set(5, sumUS(5));
				fivesSet = true;
			} else {
				System.out.println("You cannot select this value because you already set the value here.");
				scoreSetter(p, inputChoice(p));
			}
		}
		if (choice.equals("6")) {
			if (sixesSet == false) {
				p.set(6, sumUS(6));
				sixesSet = true;
			} else {
				System.out.println("You cannot select this value because you already set the value here.");
				scoreSetter(p, inputChoice(p));
			}
		}
		if (choice.equals("7")) {
			if ((threeK == true) && (threeKSet == false)) {
				p.set(7, p.dg.getTotal(DiceGroup));
				threeK = false;
				threeKSet = true;
			} else if (threeKSet == true) {
				System.out.println("You cannot select this value because you already set the value here.");
				scoreSetter(p, inputChoice(p));
			} else {
				p.set(7, 0);
			}
		}
		if (choice.equals("8")) {
			if ((fourK == true) && (fourKSet == false)) {
				p.set(8, p.dg.getTotal(DiceGroup));
				fourK = false;
				fourKSet = true;
			} else if (fourKSet == true) {
				System.out.println("You cannot select this value because you already set the value here.");
				scoreSetter(p, inputChoice(p));
			} else {
				p.set(8, 0);
			}
		}
		if (choice.equals("9")) {
			if ((fh == true) && (fhSet == false)) {
				p.set(9, 25);
				fh = false;
				fhSet = true;
			} else if (fhSet == true) {
				System.out.println("You cannot select this value because you already set the value here.");
				scoreSetter(p, inputChoice(p));
			} else {
				p.set(9, 0);
			}
		}
		if (choice.equals("10")) {
			if ((sseq == true) && (sseqSet == false)) {
				p.set(10, 30);
				sseq = false;
				sseqSet = true;
			} else if (sseqSet == true) {
				System.out.println("You cannot select this value because you already set the value here.");
				scoreSetter(p, inputChoice(p));
			} else {
				p.set(10, 0);
			}
		}
		if (choice.equals("11")) {
			if ((lseq == true) && (lseqSet == false)) {
				p.set(11, 40);
				lseq = false;
				lseqSet = true;
			} else if (lseqSet == true) {
				System.out.println("You cannot select this value because you already set the value here.");
				scoreSetter(p, inputChoice(p));
			} else {
				p.set(11, 0);
			}
		}
		if (choice.equals("12")) {
			if (y == true) {
				p.setY(12, 50, DiceGroup.get(0).getNumber());
				y = false;
			} else {
				p.setY(12, 0, DiceGroup.get(0).getNumber());
			}
		}
		if (choice.equals("13")) {
			if (chanceSet == false) {
				p.set(13, p.dg.getTotal(DiceGroup));
				chanceSet = true;
			} else {
				System.out.println("You cannot select this value because you already set the value here.");
				scoreSetter(p, inputChoice(p));
			}
		}
		 threeK = false;
		 fourK = false;
		 sseq = false;
		 lseq = false;
		 fh = false;
		 y = false;
	}

	public String rollKeepInput(Player p) {
		int count = 2;
		Scanner s1 = new Scanner(System.in);
		String o = "";
		String choice = "";
		printDice();
		suggestions(p);
		while (!o.equals("3")) {
			if (count != 0) {
				System.out.println("Type (1) to select dice to hold and reroll the rest. (" + count + " tries left.) ");
				System.out.println("Type (2) to reroll all the dice. (" + count + " tries left.) ");
				System.out.println("Type (3) to score this round");
				o = s1.nextLine();
			}
			if (o.equals("1") && (count > 0)) {
				rollAndKeep();
				suggestions(p);
				count--;
			}
			if (o.equals("2") && (count > 0)) {
				groupRoll();
				printDice();
				suggestions(p);
				count--;
			} else if (o.equals("3") || (count == 0)) {
				choice = inputChoice(p);
				count = 2;
				break;
			}
		}
		return choice;
	}

	public String rollKeepInputTest(Player p,int i) {
		boolean t=false;
		testPick=i;
		int count = 2;
		Scanner s1 = new Scanner(System.in);
		String choice = "";
		rigDice(p);
		printDice();
		suggestions(p);
		System.out.println("Type (1) to select dice to hold and reroll the rest. (" + count + " tries left.) ");
		System.out.println("Type (2) to reroll all the dice. (" + count + " tries left.) ");
		System.out.println("Type (3) to score this round");
		if ((i==10)&&p.name.equals("Tom")) {
			System.out.println("1");
			System.out.println(
					"Please Enter in the Dice position that you want to hold. Please Seperate each number with a <<SPACE>>");
			for (int z = 0; z < DiceGroup.size(); z++) {
				System.out.println("Position: (" + (z + 1) + ") :" + DiceGroup.get(z).getNumber());
			}
			count--;
			System.out.println("1 2 4");
			readKeep("1 2 4");
			printDice();
			suggestions(p);
			System.out.println("Type (1) to select dice to hold and reroll the rest. (" + count + " tries left.) ");
			System.out.println("Type (2) to reroll all the dice. (" + count + " tries left.) ");
			System.out.println("Type (3) to score this round");
		}
		if ((i==9)&&p.name.equals("Tom")) {
			System.out.println("2");
			groupRoll();
			printDice();
			suggestions(p);
			System.out.println("Type (1) to select dice to hold and reroll the rest. (" + count + " tries left.) ");
			System.out.println("Type (2) to reroll all the dice. (" + count + " tries left.) ");
			System.out.println("Type (3) to score this round");
		}
		if ((i==10)&&p.name.equals("Bob")) {
			System.out.println("1");
			System.out.println(
					"Please Enter in the Dice position that you want to hold. Please Seperate each number with a <<SPACE>>");
			for (int z = 0; z < DiceGroup.size(); z++) {
				System.out.println("Position: (" + (z + 1) + ") :" + DiceGroup.get(z).getNumber());
			}
			
			System.out.println("3 4");
			readKeep("3 4");
			printDice();
			suggestions(p);
			System.out.println("Type (1) to select dice to hold and reroll the rest. (" + count + " tries left.) ");
			System.out.println("Type (2) to reroll all the dice. (" + count + " tries left.) ");
			System.out.println("Type (3) to score this round");
			System.out.println("1");
			count--;
			System.out.println(
					"Please Enter in the Dice position that you want to hold. Please Seperate each number with a <<SPACE>>");
			for (int z = 0; z < DiceGroup.size(); z++) {
				System.out.println("Position: (" + (z + 1) + ") :" + DiceGroup.get(z).getNumber());
			}
			System.out.println("1 2 3 5");
			readKeep("1 2 3 5");
			printDice();
			suggestions(p);
			t=true;
		}
		if (t==false) {
		System.out.println("3");
		}
		choice = inputChoiceTest(p,i);
		return choice;
	}

	public void rigDice(Player p) {//System.out.println(testPick);
		ArrayList<Dice> dg = new ArrayList<Dice>();
		if ((testPick > 0) && (testPick < 7)) {
			for (int i = 0; i < 5; i++) {
				Dice d = new Dice();
				d.setNumber(testPick);
				dg.add(d);
			}
			this.DiceGroup = dg;
		}
		if (testPick == 7) {
			for (int i = 0; i < 3; i++) {
				Dice d = new Dice();
				d.setNumber(3);
				dg.add(d);
			}
			Dice d = new Dice();
			d.setNumber(1);
			dg.add(d);
			Dice d2 = new Dice();
			d2.setNumber(2);
			;
			dg.add(d2);
			this.DiceGroup = dg;
		}
		if (testPick == 8) {
			for (int i = 0; i < 4; i++) {
				Dice d = new Dice();
				d.setNumber(4);
				dg.add(d);
			}
			Dice d = new Dice();
			d.setNumber(3);
			dg.add(d);
			this.DiceGroup = dg;
		}
		if (testPick == 9) {
			for (int i = 0; i < 3; i++) {
				Dice d = new Dice();
				d.setNumber(2);
				dg.add(d);
			}
			Dice d = new Dice();
			Dice d2 = new Dice();
			d.setNumber(1);
			dg.add(d);
			d2.setNumber(1);
			dg.add(d2);
			this.DiceGroup = dg;
		}
		if (testPick == 10) {
			Dice d = new Dice();
			Dice d2 = new Dice();
			Dice d3 = new Dice();
			Dice d4 = new Dice();
			Dice d5 = new Dice();
			d.setNumber(1);
			dg.add(d);
			d2.setNumber(2);
			dg.add(d2);
			d3.setNumber(3);
			dg.add(d3);
			d4.setNumber(4);
			dg.add(d4);
			d5.setNumber(1);
			dg.add(d5);
			this.DiceGroup = dg;
		}
		if (testPick == 11) {
			Dice d = new Dice();
			Dice d2 = new Dice();
			Dice d3 = new Dice();
			Dice d4 = new Dice();
			Dice d5 = new Dice();
			d.setNumber(1);
			dg.add(d);
			d2.setNumber(2);
			dg.add(d2);
			d3.setNumber(3);
			dg.add(d3);
			d4.setNumber(4);
			dg.add(d4);
			d5.setNumber(5);
			dg.add(d5);
			this.DiceGroup = dg;
		}
		if (testPick==12) {
			for (int i = 0; i < 5; i++) {
				Dice d = new Dice();
				d.setNumber(6);
				;
				dg.add(d);
			}
			this.DiceGroup = dg;
		}
	}

	public int sumUS(int x) {
		int count = 0;
		for (int i = 0; i < DiceGroup.size(); i++) {
			if (DiceGroup.get(i).getNumber() == x) {
				count += x;
			}
		}
		return count;
	}

	public void readKeep(String s) {
		ArrayList<Dice> dg = new ArrayList<Dice>();
		for (int i = 0; i < s.length(); i += 2) {
			int n = Character.getNumericValue(s.charAt(i));
			if ((n > 0) && (n < 6)) {
				dg.add(DiceGroup.get(n - 1));
			}
		}
		int x = dg.size();
		for (int i = 0; i < (5 - x); i++) {
			Dice d = new Dice(); // System.out.println(dg.size());
			d.roll();
			dg.add(d);
		}
		DiceGroup = dg;
	}

	public void rollAndKeep() {
		System.out.println(
				"Please Enter in the Dice position that you want to hold. Please Seperate each number with a <<SPACE>>");
		for (int i = 0; i < DiceGroup.size(); i++) {
			System.out.println("Position: (" + (i + 1) + ") :" + DiceGroup.get(i).getNumber());
		}
		Scanner s = new Scanner(System.in);
		String choice = s.nextLine();
		readKeep(choice);
		printDice();
	}

	public String convertList() {
		String s = "";
		for (int i = 0; i < DiceGroup.size(); i++) {
			s += DiceGroup.get(i).getNumber();
		}
		return s;
	}

	public void convertString(String s) {
		for (int i = 0; i < DiceGroup.size(); i++) {
			DiceGroup.get(i).setNumber(Character.getNumericValue(s.charAt(i)));
		}
	}
}
