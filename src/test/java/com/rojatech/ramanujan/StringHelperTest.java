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
		
		assertEquals("CD", sh.truncateFirstTwoCharacters("AACD"));
		assertEquals("AD", sh.truncateFirstTwoCharacters("ACAD"));
		assertEquals("AB", sh.truncateFirstTwoCharacters("CDAB"));
		assertEquals("AA", sh.truncateFirstTwoCharacters("CDAA"));
		assertEquals("", sh.truncateFirstTwoCharacters("AA"));

		assertEquals(false, sh.areFirstTwoAndLastTwoCharactersTheSame("AACD"));
		assertEquals(true, sh.areFirstTwoAndLastTwoCharactersTheSame("ABAB"));
		assertEquals(true, sh.areFirstTwoAndLastTwoCharactersTheSame("CD"));
		assertEquals(false, sh.areFirstTwoAndLastTwoCharactersTheSame("C"));
		assertEquals(false, sh.areFirstTwoAndLastTwoCharactersTheSame(""));
		
		
	}

}
