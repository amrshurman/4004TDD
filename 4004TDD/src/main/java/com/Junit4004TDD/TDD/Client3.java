package com.Junit4004TDD.TDD;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client3 {

	public static void main(String[] args) throws IOException {
		try {
			Socket ssocket = new Socket("localhost", 4444); // sending socket
			DataOutputStream dout = new DataOutputStream(ssocket.getOutputStream());
			System.out.println("Enter your name and press enter to connect to the server:");
			Scanner s = new Scanner(System.in);
			String choice = s.nextLine();
			dout.writeUTF(choice);
			dout.flush();
			dout.close();
			ssocket.close();
			// s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		ServerSocket rs = new ServerSocket(3333); // receiving socket
		while (true) {
			try {
				System.out.println("Waiting for your turn...");
				Socket s = rs.accept();// establishes connection
				System.out.println("It's your turn! Player 3: ");
				ObjectInputStream is = new ObjectInputStream(s.getInputStream());
				ScoreSheet ss = (ScoreSheet) is.readObject();
				DiceGroup dg = new DiceGroup();
				Player p = new Player(ss.p3.name);
				dg = ss.p3.dg;
				ss.print(ss.p3);
				ss.print(ss.p2);
				ss.print(ss.p1);
				if (ss.p3.round == 14) {
					ss.winner();
					System.exit(1);
				}
				p.round++;
				int count = 2;
				Scanner s1 = new Scanner(System.in);
				String o = "";
				String choice = "";
				dg.printDice();
				dg.suggestions(p);
				while (!o.equals("3")) {
					if (count != 0) {
						System.out.println(
								"Type (1) to select dice to hold and reroll the rest. (" + count + " tries left.) ");
						System.out.println("Type (2) to reroll all the dice. (" + count + " tries left.) ");
						System.out.println("Type (3) to score this round");
						o = s1.nextLine();
					}
					if (o.equals("1") && (count > 0)) {
						dg.rollAndKeep();
						dg.suggestions(p);
						count--;
					}
					if (o.equals("2") && (count > 0)) {
						dg.groupRoll();
						dg.printDice();
						dg.suggestions(p);
						count--;
					} else if (o.equals("3") || (count == 0)) {
						choice = dg.inputChoice(p);
						count = 2;
						break;
					}
				}
				Socket ssocket = new Socket("localhost", 3334); // sending socket
				DataOutputStream dout = new DataOutputStream(ssocket.getOutputStream());
				String d = dg.convertList();
				choice += d;
				dout.writeUTF(choice);
				dout.flush();
				dout.close();
				ssocket.close();
				// rs.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}