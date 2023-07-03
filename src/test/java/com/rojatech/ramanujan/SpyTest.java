package com.rojatech.ramanujan;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SpyTest {

	@Test
	public void test() {
		List spyArrayList = spy(ArrayList.class);
		assertEquals(0, spyArrayList.size());
		spyArrayList.add("dummy");
		verify(spyArrayList).add("dummy");
		verify(spyArrayList, never()).clear();
		stub(spyArrayList.size()).toReturn(5);
		assertEquals(5, spyArrayList.size());
	}

}
