package com.rojatech.ramanujan;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.rojatech.ramanujan.ch09.others.StringHelper;

@RunWith(Parameterized.class)
public class StringHelperTest {

	
	StringHelper sh = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	
	public StringHelperTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = {
				{"AACD", "CD"},
				{"ACAD", "CAD"},
				{"CDAB", "CDAB"},
				{"CDAA", "CDAA"}
		};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateAInFirstTwoCharacters() { 
		assertEquals(expectedOutput, sh.truncateAInFirstTwoCharacters(input));
	}
	
	@Test
	public void testTruncateFirstTwoCharacters() {
		assertEquals("CD", sh.truncateFirstTwoCharacters("AACD"));
		assertEquals("AD", sh.truncateFirstTwoCharacters("ACAD"));
		assertEquals("AB", sh.truncateFirstTwoCharacters("CDAB"));
		assertEquals("AA", sh.truncateFirstTwoCharacters("CDAA"));
		assertEquals("", sh.truncateFirstTwoCharacters("AA"));
	}

	@Test
	public void testareFirstTwoAndLastTwoCharactersTheSame() {
		assertEquals(false, sh.areFirstTwoAndLastTwoCharactersTheSame("AACD"));
		assertEquals(true, sh.areFirstTwoAndLastTwoCharactersTheSame("ABAB"));
		assertEquals(true, sh.areFirstTwoAndLastTwoCharactersTheSame("CD"));
		assertEquals(false, sh.areFirstTwoAndLastTwoCharactersTheSame("C"));
		assertEquals(false, sh.areFirstTwoAndLastTwoCharactersTheSame(""));
	}
}
