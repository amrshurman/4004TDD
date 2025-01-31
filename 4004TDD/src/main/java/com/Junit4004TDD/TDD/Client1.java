package com.Junit4004TDD.TDD;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client1 {
	static ScoreSheet ss = new ScoreSheet(null, null, null);
	public static void main(String[] args) throws IOException {
		try {
			Socket ssocket = new Socket("localhost", 6666); // sending socket
			DataOutputStream dout = new DataOutputStream(ssocket.getOutputStream());
			System.out.println("Enter your name and press enter to connect to the server:");
			String choice="";
			if (args.length>0) {
			if (args[0].equals("test")) {
				choice = "Bob";
				System.out.println("Bob");
			}
			}
			else {
			Scanner s = new Scanner(System.in);
			choice = s.nextLine();
			}
			dout.writeUTF(choice);
			dout.flush();
			dout.close();
			ssocket.close();
			// s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		ServerSocket rs = new ServerSocket(9999); // receiving socket
		while (true) {
			try {
				System.out.println("Waiting for your turn...");
				Socket s = rs.accept();// establishes connection
				System.out.println("It's your turn! Player 1: ");
				 ObjectInputStream is=new ObjectInputStream(s.getInputStream());
			     ss=(ScoreSheet)is.readObject();
				DiceGroup dg = new DiceGroup();
				Player p = new Player(ss.p1.name);
				dg=ss.p1.dg;
			     ss.print(ss.p1);ss.print(ss.p2);ss.print(ss.p3);
			     if (ss.p3.round==14) {
			    	 ss.winner();
			    	 Socket ssocket = new Socket("localhost", 6667); // sending socket
						DataOutputStream dout = new DataOutputStream(ssocket.getOutputStream());
						dout.writeUTF("qqqqqqq");
						if (args.length>0) break;
			    	 System.exit(1);
			     }
			     p.round++;
			     String choice="";
			     if (args.length>0) {
			    	 choice=dg.rollKeepInputTest(p,ss.p1.round);
			     }
			     else {
			     choice=dg.rollKeepInput(p);
			     }
				Socket ssocket = new Socket("localhost", 6667); // sending socket
				DataOutputStream dout = new DataOutputStream(ssocket.getOutputStream());
				String d = dg.convertList();
				choice+=d;
				dout.writeUTF(choice);
				dout.flush();
				dout.close();
				ssocket.close();
			//	rs.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}