package com.Junit4004TDD.TDD;

import junit.framework.TestCase;

public class GameTest extends TestCase{ //should print score sheet properly
 public void testSoreSheet() {
	 Player p1 = new Player("p1");
	 Player p2 = new Player("p2");
	 Player p3 = new Player("p3");
	 ScoreSheet ss = new ScoreSheet(p1,p2,p3);
	 ss.print();
	 assertEquals(0,0);
 }
}
