package com.Junit4004TDD.TDD;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
	//	int count = 0;
		Player p1=new Player("null");
		Player p2=new Player("null");
		Player p3=new Player("null");
		try {
			System.out.println("Waiting for Player 1 to connect with the server...");
			ServerSocket rs = new ServerSocket(6666); // receiving socket
			Socket s = rs.accept();// establishes connection
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String) dis.readUTF();
			System.out.println("Established connection with Player 1: " + str);
			p1=new Player(str);
			rs.close();
		//	count++;
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			Socket ssocket = new Socket("localhost", 9999); // sending socket
			DataOutputStream dout = new DataOutputStream(ssocket.getOutputStream());
			System.out.println("Notifying player 1 to start:");
			dout.writeUTF("");
			dout.flush();
			dout.close();
			ssocket.close();
			p1.dg.groupRoll();
			p1.dg.pickDice(p1);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
