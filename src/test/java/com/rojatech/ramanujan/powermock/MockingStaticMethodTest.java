package com.rojatech.ramanujan.powermock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
//import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

//@RunWith(PowerMockRunner.class)
//@PrepareForTest(UtilityClass.class)
public class MockingStaticMethodTest {

	
	@Rule
	public MockitoRule mockitoRule = MockitoJUnit.rule();

	@Mock
	Dependency dependency;

	@InjectMocks
	SystemUnderTest systemUnderTest;

	@Test
	public void testRetriveToDoRelatedToString_usingMock() {
		when(dependency.retrieveAllStats()).thenReturn(Arrays.asList(1,2,3));
		////PowerMockito.mockStatic(UtilityClass.class);
		//when(UtilityClass.staticMethod(6)).thenReturn(150);
		//int res = systemUnderTest.methodCallingAStaticMethod();
		//assertEquals(150, res); 
	}
	
}
