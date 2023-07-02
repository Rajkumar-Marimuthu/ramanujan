package com.rojatech.ramanujan;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.stub;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SpyTest {

	@Test
	public void test() {
		List spyArrayList = spy(ArrayList.class);
		assertEquals(0, spyArrayList.size());
		spyArrayList.add("dummy");
		assertEquals(1, spyArrayList.size());
	}

}
