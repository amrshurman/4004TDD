package com.Junit4004TDD.TDD;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client1 {
	public static void main(String[] args) {
		try {
			Socket ssocket = new Socket("localhost", 6666); // sending socket
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
		//while (true) {
			try {
				System.out.println("Waiting for your turn...");
				ServerSocket rs = new ServerSocket(9999); // receiving socket
				Socket s = rs.accept();// establishes connection
				DataInputStream dis = new DataInputStream(s.getInputStream());
				String str = (String) dis.readUTF();
				System.out.println("It's your turn! Player 1: ");
				DiceGroup dg = new DiceGroup();
				Player p = new Player(str);
				dg.convertString(str);
				int count = 2;
				Scanner s1 = new Scanner(System.in);
				String o = "";
				String choice = "";
				dg.printDice();
				dg.suggestions(p);
				while (!o.equals("s")) {
					System.out.println(
							"Type (r) to reroll some dice. (" + count + " tries left.) Type (s) to enter a score");
					o = s1.nextLine();
					if (o.equals("r")) {
						if (count > 0) {
							dg.rollAndKeep();
							dg.suggestions(p);
							count--;
						} else {
							System.out.println("You cannot reroll because you ran out of any re rolls");
						}
					} else if (o.equals("s")) {
						choice = dg.inputChoice(p);
					}
				}
				Socket ssocket = new Socket("localhost", 6667); // sending socket
				DataOutputStream dout = new DataOutputStream(ssocket.getOutputStream());
				String d = dg.convertList();
				choice+=d;
				dout.writeUTF(choice);
				dout.flush();
				dout.close();
				ssocket.close();
				rs.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		//}
	}
}