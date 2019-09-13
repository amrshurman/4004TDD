package com.Junit4004TDD.TDD;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client1 {
	public static void main(String[] args) {
		try {
			Socket ssocket = new Socket("localhost", 6666); //sending socket
			DataOutputStream dout = new DataOutputStream(ssocket.getOutputStream());
			System.out.println("Enter your name and press enter to connect to the server:");
			Scanner s = new Scanner(System.in);
			String choice = s.nextLine();
			dout.writeUTF(choice);
			dout.flush();
			dout.close();
			ssocket.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			System.out.println("Waiting for turn...");
			ServerSocket rs = new ServerSocket(9999); //receiving socket
			Socket s = rs.accept();// establishes connection
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String str = (String) dis.readUTF();
			System.out.println("It's your turn Player 1: " + str);
			rs.close();	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}