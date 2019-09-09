package com.Junit4004TDD.TDD;

import java.util.ArrayList;

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
		for (int i = 0; i < DiceGroup.size(); i++) {
			System.out.println("Dice ("+(i+1)+"): " +DiceGroup.get(i).getNumber());
		}
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
		ArrayList<Dice> fd = new ArrayList<Dice>();
		int count = 0;
		for (int i = 0; i < d.size(); i++) {
			ArrayList<Dice> tempd = new ArrayList<Dice>();
			Dice td = new Dice();
			if (d.get(i).getNumber() < 4) {
				td = d.get(i);
				tempd.add(td);
				count++;
				for (int z = 0; z < d.size(); z++) {
					for (int j = 0; j < d.size(); j++) {
						if (td.getNumber() == d.get(j).getNumber() - 1) {
							td = d.get(j);
							tempd.add(td);
							count++;
						}
					}
				}
			}
			if (fd.size() <= tempd.size()) {
				fd = tempd;
			}
		}
		if (count > 3) {
			return fd;
		} else
			return null;
	}

	public ArrayList<Dice> fullHouse(ArrayList<Dice> d) {
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
				for (int k = 0; k < d.size(); k++) {
					if (target != d.get(k).getNumber()) {
						fd2.add(d.get(k));
					}
				}
				if (fd2.size()==2) {
					if (fd2.get(0).getNumber()==fd2.get(1).getNumber()) {
						fd.add(fd2.get(0));fd.add(fd2.get(1));
					}
				}
			}
		}
		return fd;
	}
}
