package com.Junit4004TDD.TDD;

import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) {
		// int count = 0;
		Player p1 = new Player("null");
		Player p2 = new Player("null");
		Player p3 = new Player("null");
		try {
			System.out.println("Waiting for Player 1 to connect with the server...");
			ServerSocket rs = new ServerSocket(6666); // receiving socket
			Socket s = rs.accept();// establishes connection
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String) dis.readUTF();
			System.out.println("Established connection with Player 1: " + str);
			p1 = new Player(str);
			rs.close();
			// count++;
		} catch (Exception e) {
			System.out.println(e);
		}
		while (true) {
			try {
				Socket ssocket = new Socket("localhost", 9999); // sending socket
				DataOutputStream dout = new DataOutputStream(ssocket.getOutputStream());
				System.out.println("Notifying player 1 to start:");
				p1.dg.groupRoll();
				String sL = p1.dg.convertList();
				dout.writeUTF(sL);
				dout.flush();
				dout.close();
				ssocket.close();
				ServerSocket rs = new ServerSocket(6667); // receiving socket
				Socket s = rs.accept();// establishes connection
				DataInputStream dis = new DataInputStream(s.getInputStream());
				String str = (String) dis.readUTF();
				String choice = String.valueOf(str.charAt(0))+String.valueOf(str.charAt(1));
				String d = String.valueOf(str.charAt(2))+String.valueOf(str.charAt(3))+String.valueOf(str.charAt(4))+String.valueOf(str.charAt(5))+String.valueOf(str.charAt(6));
				System.out.println("Recieved output from Player 1: ");
				p1.dg.convertString(d);
				p1.dg.pickDice(p1);
				p1.dg.scoreSetter(p1, choice);
				ScoreSheet ss = new ScoreSheet(p1, p2, p3);
				ss.print();
				rs.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
