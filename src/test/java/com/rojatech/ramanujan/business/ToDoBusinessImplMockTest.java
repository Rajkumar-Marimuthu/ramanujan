package com.rojatech.ramanujan.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.rojatech.ramanujan.data.api.ToDoService;

public class ToDoBusinessImplMockTest {

	@Test
	public void testRetriveToDoRelatedToString_usingMock() {
		ToDoService toDoServiceMock = mock(ToDoService.class);
		when(toDoServiceMock.retrieveToDos("dummy")).thenReturn(Arrays.asList("Learn Spring MVC","Learn Spring", "Learn Python"));
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceMock);
		List<String> filteredToDos = toDoBusinessImpl.retriveToDoRelatedToString("dummy"); 
		assertEquals(2, filteredToDos.size());
	}
	
	@Test
	public void testRetriveToDoRelatedToString_usingMockEmptyList() {
		ToDoService toDoServiceMock = mock(ToDoService.class);
		when(toDoServiceMock.retrieveToDos("dummy")).thenReturn(Arrays.asList("Learn MVC","Learn Python", "Learn Cloud"));
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceMock);
		List<String> filteredToDos = toDoBusinessImpl.retriveToDoRelatedToString("dummy"); 
		assertEquals(0, filteredToDos.size());
	}

}
