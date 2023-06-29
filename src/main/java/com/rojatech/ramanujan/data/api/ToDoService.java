package com.rojatech.ramanujan.data.api;

import java.util.List;

public interface ToDoService {
	public List<String> retrieveToDos(String user);
	public void deleteToDo(String todo);
}
