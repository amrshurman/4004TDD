package com.Junit4004TDD.TDD;

import junit.framework.TestCase;

public class GameTest extends TestCase{
 public void testSoreSheet() {
	 ScoreSheet ss = new ScoreSheet();
	 System.out.println(ss.print());
	 assertEquals(0,0);
 }
}
