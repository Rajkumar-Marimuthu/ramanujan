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

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

import com.rojatech.ramanujan.data.api.ToDoService;

public class ToDoBusinessImplMockitoMockTest {
	
	@Rule
	public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	@Mock
	ToDoService toDoServiceMock;

	@InjectMocks
	ToDoBusinessImpl toDoBusinessImpl;
	
	@Captor
	ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);
			
			
	@Test
	public void testRetriveToDoRelatedToString_usingMock() {
		when(toDoServiceMock.retrieveToDos("dummy")).thenReturn(Arrays.asList("Learn Spring MVC","Learn Spring", "Learn Python"));
		List<String> filteredToDos = toDoBusinessImpl.retriveToDoRelatedToString("dummy"); 
		assertEquals(2, filteredToDos.size());
	}
	
	@Test
	public void testRetriveToDoRelatedToString_BDD() {
		//Given
		given(toDoServiceMock.retrieveToDos("dummy")).willReturn(Arrays.asList("Learn Spring MVC","Learn Spring", "Learn Python"));
		
		// When
		List<String> filteredToDos = toDoBusinessImpl.retriveToDoRelatedToString("dummy"); 
		// Then
		
		assertThat(filteredToDos.size(),is(2));
	}
	
	@Test
	public void testdeleteToDoNotRelatedToStringBDD() {
		// Given
		given(toDoServiceMock.retrieveToDos("dummy")).willReturn(Arrays.asList("Learn Spring MVC", "Learn Spring Boot", "Learn Python"));
		
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
		
		// Given
		given(toDoServiceMock.retrieveToDos("dummy")).willReturn(Arrays.asList("Learn Spring MVC", "Learn Angular", "Learn Python"));
		
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
		when(toDoServiceMock.retrieveToDos("dummy")).thenReturn(Arrays.asList("Learn MVC","Learn Python", "Learn Cloud"));
		List<String> filteredToDos = toDoBusinessImpl.retriveToDoRelatedToString("dummy"); 
		assertEquals(0, filteredToDos.size());
	}
}
