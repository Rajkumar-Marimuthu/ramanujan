package com.rojatech.ramanujan.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Test;

import com.rojatech.ramanujan.data.api.ToDoService;
import com.rojatech.ramanujan.data.api.ToDoServiceStub;

public class ToDoBusinessImplStubTest {

	@Test
	public void test() {
		ToDoService toDoServiceStub = new ToDoServiceStub();
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(toDoServiceStub);
		List<String> filteredToDos = toDoBusinessImpl.retriveToDoRelatedToString("dummy"); 
		assertEquals(2, filteredToDos.size());
	}

}
