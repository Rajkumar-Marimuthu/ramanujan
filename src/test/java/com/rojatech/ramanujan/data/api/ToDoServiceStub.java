package com.rojatech.ramanujan.data.api;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService {

	@Override
	public List<String> retrieveToDos(String user) {
		return Arrays.asList("Learn Spring MVC","Learn Spring", "Learn Python");
	}

	@Override
	public void deleteToDo(String todo) {
		// TODO Auto-generated method stub
		
	}

}
