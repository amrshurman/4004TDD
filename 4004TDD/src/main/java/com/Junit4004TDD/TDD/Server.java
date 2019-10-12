package com.Junit4004TDD.TDD;

import java.io.*;
import java.net.*;

public class Server {
	static Player p1 = new Player("null");
	static Player p2 = new Player("null");
	static Player p3 = new Player("null");
	public static void main(String[] args) throws UnknownHostException, IOException {
		// int count = 0;
		String test=null;
		if (args.length>0) {
		test=args[0];
		}
		ScoreSheet ss = new ScoreSheet(p1, p2, p3);
		int round=1;
		try {
			System.out.println("Waiting for Player 1 to connect with the server...");
			ServerSocket rs = new ServerSocket(6666); // receiving socket
			Socket s = rs.accept();// establishes connection
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String) dis.readUTF();
			System.out.println("Established connection with Player 1: " + str);
			p1 = new Player(str);
			rs.close();
			System.out.println("Waiting for Player 2 to connect with the server...");
			rs = new ServerSocket(1111); // receiving socket
			s = rs.accept();// establishes connection
			dis = new DataInputStream(s.getInputStream());
			str = (String) dis.readUTF();
			System.out.println("Established connection with Player 2: " + str);
			p2 = new Player(str);
			rs.close();
			System.out.println("Waiting for Player 3 to connect with the server...");
			rs = new ServerSocket(4444); // receiving socket
			s = rs.accept();// establishes connection
			dis = new DataInputStream(s.getInputStream());
			str = (String) dis.readUTF();
			System.out.println("Established connection with Player 3: " + str);
			p3 = new Player(str);
			
			rs.close();
			ss= new ScoreSheet(p1,p2,p3);
		} catch (Exception e) {
			System.out.println(e);
		}
		p3.round=0;
		while (true) {
			try {
				if (p3.round!=14) {
				p3.round++;
				}
				Socket ssocket = new Socket("localhost", 9999); // sending socket
				DataOutputStream dout = new DataOutputStream(ssocket.getOutputStream());
				System.out.println("Notifying player 1 to start:");
				p1.dg.groupRoll();
				 ObjectOutputStream os=new ObjectOutputStream(ssocket.getOutputStream());
				os.writeObject(ss);
				dout.flush();
				dout.close();
				ssocket.close();
				ServerSocket rs = new ServerSocket(6667); // receiving socket
				Socket s = rs.accept();// establishes connection
				DataInputStream dis = new DataInputStream(s.getInputStream());
				String str = (String) dis.readUTF();
				String choice="";
				String d="";
				if (str.length()==7) {
				choice = String.valueOf(str.charAt(0))+String.valueOf(str.charAt(1));
				}
				else {
					 choice = String.valueOf(str.charAt(0));
				}
				if (str.length()==6) {
				d = String.valueOf(str.charAt(1))+String.valueOf(str.charAt(2))+String.valueOf(str.charAt(3))+String.valueOf(str.charAt(4))+String.valueOf(str.charAt(5));
				}
				else {
					d = String.valueOf(str.charAt(2))+String.valueOf(str.charAt(3))+String.valueOf(str.charAt(4))+String.valueOf(str.charAt(5))+String.valueOf(str.charAt(6));
				}
				System.out.println("Recieved output from Player 1: ");
				p1.dg.convertString(d);
				p1.dg.pickDice(p1);
				p1.dg.scoreSetter(p1, choice);
				ss = new ScoreSheet(p1, p2, p3);
				rs.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			
			try {
				if (p3.round!=14) {
				p1.round++;
				}
				Socket ssocket = new Socket("localhost", 2222); // sending socket
				DataOutputStream dout = new DataOutputStream(ssocket.getOutputStream());
				System.out.println("Notifying player 2 to start:");
				p2.dg.groupRoll();
				 ObjectOutputStream os=new ObjectOutputStream(ssocket.getOutputStream());
					os.writeObject(ss);
				dout.flush();
				dout.close();
				ssocket.close();
				ServerSocket rs = new ServerSocket(2223); // receiving socket
				Socket s = rs.accept();// establishes connection
				DataInputStream dis = new DataInputStream(s.getInputStream());
				String str = (String) dis.readUTF();
				String choice="";
				String d="";
				if (str.length()==7) {
				choice = String.valueOf(str.charAt(0))+String.valueOf(str.charAt(1));
				}
				else {
					 choice = String.valueOf(str.charAt(0));
				}
				if (str.length()==6) {
				d = String.valueOf(str.charAt(1))+String.valueOf(str.charAt(2))+String.valueOf(str.charAt(3))+String.valueOf(str.charAt(4))+String.valueOf(str.charAt(5));
				}
				else {
					d = String.valueOf(str.charAt(2))+String.valueOf(str.charAt(3))+String.valueOf(str.charAt(4))+String.valueOf(str.charAt(5))+String.valueOf(str.charAt(6));
				}
				System.out.println("Recieved output from Player 2: ");
				p2.dg.convertString(d);
				p2.dg.pickDice(p2);
				p2.dg.scoreSetter(p2, choice);
				ss = new ScoreSheet(p1, p2, p3);
				rs.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			
			try {
				if (p3.round!=14) {
				p2.round++;
				}
				Socket ssocket = new Socket("localhost", 3333); // sending socket
				DataOutputStream dout = new DataOutputStream(ssocket.getOutputStream());
				System.out.println("Notifying player 3 to start:");
				p3.dg.groupRoll();
				 ObjectOutputStream os=new ObjectOutputStream(ssocket.getOutputStream());
					os.writeObject(ss);
				dout.flush();
				dout.close();
				ssocket.close();
				ServerSocket rs = new ServerSocket(3334); // receiving socket
				Socket s = rs.accept();// establishes connection
				DataInputStream dis = new DataInputStream(s.getInputStream());
				String str = (String) dis.readUTF();
				String choice="";
				String d="";
				if (str.length()==7) {
				choice = String.valueOf(str.charAt(0))+String.valueOf(str.charAt(1));
				}
				else {
					 choice = String.valueOf(str.charAt(0));
				}
				if (str.length()==6) {
				d = String.valueOf(str.charAt(1))+String.valueOf(str.charAt(2))+String.valueOf(str.charAt(3))+String.valueOf(str.charAt(4))+String.valueOf(str.charAt(5));
				}
				else {
					d = String.valueOf(str.charAt(2))+String.valueOf(str.charAt(3))+String.valueOf(str.charAt(4))+String.valueOf(str.charAt(5))+String.valueOf(str.charAt(6));
				}
				System.out.println("Recieved output from Player 3: ");
				p3.dg.convertString(d);
				p3.dg.pickDice(p3);
				p3.dg.scoreSetter(p3, choice);
				ss = new ScoreSheet(p1, p2, p3);
				rs.close();
			} catch (Exception e) {
				System.out.println(e);
			}
			ss.roundDone(round);
			System.out.println("");
			round++;
			if (p3.round==14) {
			    	 ss.winner();
			    	 if (args[0].equals("test")) {break;}
			    	 System.exit(1);
			}
		}
	}
}
