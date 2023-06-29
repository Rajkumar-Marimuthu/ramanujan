package com.rojatech.ramanujan.business;

import java.util.ArrayList;
import java.util.List;

import com.rojatech.ramanujan.data.api.ToDoService;

public class ToDoBusinessImpl {
	private ToDoService toDoService;

	public ToDoBusinessImpl(ToDoService toDoService) {
		this.toDoService = toDoService;
	}
	
	public List<String> retriveToDoRelatedToString(String user) {
		List<String> filteredToDos = new ArrayList<String>();
		List<String> toDos = toDoService.retrieveToDos(user);
		
		for (String toDo: toDos) {
			if (toDo.contains("Spring")) {
				filteredToDos.add(toDo);
			}
		}
		
		return filteredToDos;
	}

}
