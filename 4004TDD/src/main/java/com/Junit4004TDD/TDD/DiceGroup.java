package com.Junit4004TDD.TDD;

import java.util.ArrayList;
import java.util.Scanner;

public class DiceGroup { // class for GROUP of dice
	ArrayList<Dice> DiceGroup = new ArrayList<Dice>();

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
			System.out.println("Dice ("+(i+1)+"): " +DiceGroup.get(i).getNumber());
		}
		System.out.println("-----------------------------------------------");
	}

	public ArrayList<Dice> upperAddition(ArrayList<Dice> d) { // adds the upper addition part of the score sheet
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
			if (count > 1) { // if we find any group of duplicated numbers then we add to list of upper
								// addition group
				fd.add(d.get(i));
			}
		}
		return fd;
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
					count=0;
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
				fd.add(d.get(i));fd.add(d.get(i));fd.add(d.get(i));
				for (int k = 0; k < d.size(); k++) {
					if (target != d.get(k).getNumber()) {
						fd2.add(d.get(k));
					}
				}
				if (fd2.size()==2) {
					if (fd2.get(0).getNumber()==fd2.get(1).getNumber()) {
						fd.add(fd2.get(0));fd.add(fd2.get(1));
						return fd;
					}
				}
			}
		}
		return empty;
	}
	public void pickDice(ScoreSheet ss) {
		boolean ua=false;
		boolean threeK=false;
		boolean fourK=false;
		boolean sseq=false;
		boolean lseq=false;
		boolean fh=false;
		if (upperAddition(DiceGroup).size()>0) {
			ua=true;
			System.out.print("This group of dice has duplicates from the group: ");
			for (int i=0;i<upperAddition(DiceGroup).size();i++) {
				System.out.print(upperAddition(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		if (OfKind(DiceGroup).size()==3) {
			threeK=true;
			System.out.print("This group has a 3 of a kind: ");
			for (int i=0;i<OfKind(DiceGroup).size();i++) {
				System.out.print(OfKind(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		if (OfKind(DiceGroup).size()==4) {
			fourK=true;
			System.out.print("This group has a 4 of a kind: ");
			for (int i=0;i<OfKind(DiceGroup).size();i++) {
				System.out.print(OfKind(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		if (sequence(DiceGroup).size()==4) {
			sseq=true;
			System.out.print("This group has a small sequence with the numbers: ");
			for (int i=0;i<sequence(DiceGroup).size();i++) {
				System.out.print(sequence(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		if (sequence(DiceGroup).size()==5) {
			lseq=true;
			System.out.print("This group has a long sequence with the numbers: ");
			for (int i=0;i<sequence(DiceGroup).size();i++) {
				System.out.print(sequence(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		if (fullHouse(DiceGroup).size()>0) {
			fh=true;
			System.out.print("This group has a full house with the numbers: ");
			for (int i=0;i<fullHouse(DiceGroup).size();i++) {
				System.out.print(fullHouse(DiceGroup).get(i).getNumber() + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Type (a1) to scratch aces value. Type (a2) to scratch twos value. Type (a3) to scratch threes value.");
		System.out.println("Type (a4) to scratch fours value. Type (a5) to scratch fives value. Type (a6) to scratch sixes value.");
		System.out.println("Type (3k) to scratch 3 of a kind value. Type (4k) to scratch 4 of a kind value. Type (ss) to scratch");
		System.out.println("small straight value. Type (ls) to scratch long straight value. Type (y) to scratch YAHTZEE value.");
		System.out.println("Type (c) to scratch chance value. Type (r) to reroll (if capable).");
		System.out.println("-----------------------------------------------------------------------------------------------------");
		Scanner s = new Scanner(System.in);
		String choice = s.nextLine();
		if (ua==true) {
			if (s.equals("a1")) {
			
			}
		}
	}
}
