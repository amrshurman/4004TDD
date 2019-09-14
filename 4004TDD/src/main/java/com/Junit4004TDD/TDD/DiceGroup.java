package com.Junit4004TDD.TDD;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceGroup { // class for GROUP of dice
	ArrayList<Dice> DiceGroup = new ArrayList<Dice>();
	boolean threeK = false;
	boolean fourK = false;
	boolean sseq = false;
	boolean lseq = false;
	boolean fh = false;
	boolean y = false;
	
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
		System.out.println("-----------------------------------------------");
		System.out.println("Current Dice numbers:");
		for (int i = 0; i < DiceGroup.size(); i++) {
			System.out.println("Dice (" + (i + 1) + "): " + DiceGroup.get(i).getNumber());
		}
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
			System.out.print("YAHTZEE! for values: ");
		}
		if (OfKind(DiceGroup).size() == 3) {
			threeK = true;
		}
		if (OfKind(DiceGroup).size() == 4) {
			fourK = true;
		}
		if (sequence(DiceGroup).size() == 4) {
			sseq = true;
		}
		if (sequence(DiceGroup).size() == 5) {
			lseq = true;
		}
		if (fullHouse(DiceGroup).size() > 0) {
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
		if (OfKind(DiceGroup).size() == 3) {
			threeK = true;
			System.out.print("This group has a 3 of a kind: ");
			for (int i = 0; i < OfKind(DiceGroup).size(); i++) {
				System.out.print(OfKind(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		if (OfKind(DiceGroup).size() == 4) {
			fourK = true;
			System.out.print("This group has a 4 of a kind: ");
			for (int i = 0; i < OfKind(DiceGroup).size(); i++) {
				System.out.print(OfKind(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		if (sequence(DiceGroup).size() == 4) {
			sseq = true;
			System.out.print("This group has a small sequence with the numbers: ");
			for (int i = 0; i < sequence(DiceGroup).size(); i++) {
				System.out.print(sequence(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		if (sequence(DiceGroup).size() == 5) {
			lseq = true;
			System.out.print("This group has a long sequence with the numbers: ");
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
		System.out.println(
				"Type (a1) to scratch aces value. Type (a2) to scratch twos value. Type (a3) to scratch threes value.");
		System.out.println(
				"Type (a4) to scratch fours value. Type (a5) to scratch fives value. Type (a6) to scratch sixes value.");
		System.out.println(
				"Type (3k) to scratch 3 of a kind value. Type (4k) to scratch 4 of a kind value. Type (fh) to scratch");
		System.out.println(
				"Full House value. Type (ss) to scratch small straight value. Type (ls) to scratch long straight value.");
		System.out.println("Type (y) to scratch YAHTZEE value. Type (c) to scratch chance value.");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
		Scanner s = new Scanner(System.in);
		String choice = s.nextLine();
		s.close();
		return choice;
	}
	public void scoreSetter(Player p,String choice) {
		if (choice.equals("a1")) {
			p.set(1, sumUS(1));
		}
		if (choice.equals("a2")) {
			p.set(2, sumUS(2));
		}
		if (choice.equals("a3")) {
			p.set(3, sumUS(3));
		}
		if (choice.equals("a4")) {
			p.set(4, sumUS(4));
		}
		if (choice.equals("a5")) {
			p.set(5, sumUS(5));
		}
		if (choice.equals("a6")) {
			p.set(6, sumUS(6));
		}
		if (choice.equals("3K")) {
			if (threeK == true) {
				p.set(7, p.dg.getTotal(DiceGroup));
				threeK = false;
			} else {
				p.set(7, 0);
			}
		}
		if (choice.equals("4K")) {
			if (fourK == true) {
				p.set(8, p.dg.getTotal(DiceGroup));
				fourK = false;
			} else {
				p.set(8, 0);
			}
		}
		if (choice.equals("fh")) {
			if (fh == true) {
				p.set(9, 25);
				fh = false;
			} else {
				p.set(9, 0);
			}
		}
		if (choice.equals("ss")) {
			if (sseq == true) {
				p.set(10, 30);
				sseq = false;
			} else {
				p.set(10, 0);
			}
		}
		if (choice.equals("ls")) {
			if (lseq == true) {
				p.set(11, 40);
				lseq = false;
			} else {
				p.set(11, 0);
			}
		}
		if (choice.equals("y")) {
			if (y == true) {
				p.set(12, 50);
				y = false;
			} else {
				p.set(12, 0);
			}
		}
		if (choice.equals("c")) {
			p.set(13, p.dg.getTotal(DiceGroup));
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

	public void rollAndKeep() {
		boolean one = false;
		boolean two = false;
		boolean three = false;
		boolean four = false;
		boolean five = false;
		for (int i = 0; i < DiceGroup.size(); i++) {
			System.out.println("Type (" + (i + 1) + ") if you want to roll " + DiceGroup.get(i).getNumber());
		}
		System.out.println("Type (r) if you want to reroll everything.");
		while (true) {
			System.out.println("Type (d) if you are done rolling.");
			Scanner s = new Scanner(System.in);
			String choice = s.nextLine();
			if (choice.equals("r")) {
				groupRoll();
				break;
			}
			if (choice.equals("1")) {
				one = true;
			}
			if (choice.equals("2")) {
				two = true;
			}
			if (choice.equals("3")) {
				three = true;
			}
			if (choice.equals("4")) {
				four = true;
			}
			if (choice.equals("5")) {
				five = true;
			}
			if (choice.equals("d")) {
				break;
			}
		}
		if (one==true) {
			DiceGroup.get(0).roll();
		}
		if (two==true) {
			DiceGroup.get(1).roll();
		}
		if (three==true) {
			DiceGroup.get(2).roll();
		}
		if (four==true) {
			DiceGroup.get(3).roll();
		}
		if (five==true) {
			DiceGroup.get(4).roll();
		}
		printDice();
	}
	public String convertList() {
		String s="";
		for (int i=0;i<DiceGroup.size();i++) {
			s+=DiceGroup.get(i).getNumber();
		}
		return s;
	}
	public void convertString(String s) {
		for (int i=0;i<DiceGroup.size();i++) {
			DiceGroup.get(i).setNumber(Character.getNumericValue(s.charAt(i)));
		}
	}
}
