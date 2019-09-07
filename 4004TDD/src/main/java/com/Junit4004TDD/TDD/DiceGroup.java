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

	public void groupRoll(ArrayList<Dice> d) { // roll all selected dice
		for (int i = 0; i < d.size(); i++) {
			d.get(i).roll();
		}
	}

	public int getTotal(ArrayList<Dice> d) { // get total number of selected dice
		int t = 0;
		for (int i = 0; i < d.size(); i++) {
			t += d.get(i).getNumber();
		}
		return t;
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
			if (count > 1) { //if we find any group of duplicated numbers then we add to list of upper addition group
				fd.add(d.get(i));
			}
		}
		return fd;
	}

}
