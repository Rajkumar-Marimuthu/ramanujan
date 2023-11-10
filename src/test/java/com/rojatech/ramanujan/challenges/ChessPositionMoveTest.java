package com.rojatech.ramanujan.challenges;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChessPositionMoveTest {

	@Test
	public void test() {
		assertEquals("8a", ChessPositionMove.move("5h",11,25));
		assertEquals("5d", ChessPositionMove.move("2b",3,2));
	}

}
