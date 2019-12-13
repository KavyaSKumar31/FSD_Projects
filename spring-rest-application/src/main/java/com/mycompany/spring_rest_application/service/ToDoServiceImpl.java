package com.mycompany.spring_rest_application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.spring_rest_application.dao.ToDoDAO;
import com.mycompany.spring_rest_application.entity.Todo;
@Service
public class ToDoServiceImpl implements ToDoService {
@Autowired
	private ToDoDAO toDoDAO;
	@Override
	public List<Todo> getAllToDo() {
		// TODO Auto-generated method stub
		return toDoDAO.getAllToDo();
	}

}
