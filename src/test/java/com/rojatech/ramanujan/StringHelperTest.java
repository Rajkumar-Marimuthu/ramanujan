package com.rojatech.ramanujan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringHelperTest {

	@Test
	void test() {
		StringHelper sh = new StringHelper();
		assertEquals("CD", sh.truncateAInFirstTwoCharacters("AACD"));
		assertEquals("CAD", sh.truncateAInFirstTwoCharacters("ACAD"));
		assertEquals("CDAB", sh.truncateAInFirstTwoCharacters("CDAB"));
		assertEquals("CDAA", sh.truncateAInFirstTwoCharacters("CDAA"));
	}

}
