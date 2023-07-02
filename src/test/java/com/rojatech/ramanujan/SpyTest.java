package com.rojatech.ramanujan;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.stub;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SpyTest {

	@Test
	public void test() {
		List mockArrayList = mock(ArrayList.class);
		assertEquals(0, mockArrayList.size());
		
		stub(mockArrayList.size()).toReturn(5);
		assertEquals(5, mockArrayList.size());
	}

}
