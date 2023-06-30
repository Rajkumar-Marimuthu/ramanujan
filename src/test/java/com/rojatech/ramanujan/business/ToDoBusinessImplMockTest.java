package com.rojatech.ramanujan.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;

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
	public void testRetriveToDoRelatedToString_BDD() {
		//Given
		ToDoService toDoServiceMock = mock(ToDoService.class);
		given(toDoServiceMock.retrieveToDos("dummy")).willReturn(Arrays.asList("Learn Spring MVC","Learn Spring", "Learn Python"));
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceMock);
		
		// When
		List<String> filteredToDos = toDoBusinessImpl.retriveToDoRelatedToString("dummy"); 
		// Then
		
		assertThat(filteredToDos.size(),is(2));
	}
	
	@Test
	public void testdeleteToDoNotRelatedToStringBDD() {
		// Given
		ToDoService toDoServiceMock = mock(ToDoService.class);
		given(toDoServiceMock.retrieveToDos("dummy")).willReturn(Arrays.asList("Learn Spring MVC", "Learn Spring Boot", "Learn Python"));
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceMock);
		
		// When
		toDoBusinessImpl.deleteToDoNotRelatedToString("dummy");
		//List<String> filteredToDosList = toDoBusinessImpl.retriveToDoRelatedToString("dummy");
		// Then
		//assertThat(filteredToDosList.size(),is(2));
		verify(toDoServiceMock, times(1)).deleteToDo("Learn Python");
		verify(toDoServiceMock, never()).deleteToDo("Learn Spring MVC");
		verify(toDoServiceMock, never()).deleteToDo("Learn Spring Boot");
	}
	
	@Test
	public void testdeleteToDoNotRelatedToStringBDD_argumentCapture() {
		// Declare argument captor
		ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);
		
		// Define Argument captor on specific method call
		
		//
		
		// Given
		ToDoService toDoServiceMock = mock(ToDoService.class);
		given(toDoServiceMock.retrieveToDos("dummy")).willReturn(Arrays.asList("Learn Spring MVC", "Learn Angular", "Learn Python"));
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceMock);
		
		// When
		toDoBusinessImpl.deleteToDoNotRelatedToString("dummy");
		//List<String> filteredToDosList = toDoBusinessImpl.retriveToDoRelatedToString("dummy");
		// Then
		//assertThat(filteredToDosList.size(),is(2));
		then(toDoServiceMock).should(times(2)).deleteToDo(stringArgumentCaptor.capture());
		assertThat(stringArgumentCaptor.getAllValues().size(), is(2));
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
