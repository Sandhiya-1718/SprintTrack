package com.example.ToDoList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/todos")
public class ToDoListApplication {

	private List<Todo> todoList = new ArrayList<>();
	private long currentId = 1;

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

	static class Todo {
		public long id;
		public String title;
		public boolean completed;

		public Todo(long id, String title, boolean completed)
		{
			this.id = id;
			this.title = title;
			this.completed = completed;
		}
	}

	@GetMapping
	public List<Todo> getTodos()
	{
		return todoList;
	}

	@PostMapping
	public Todo addTodo(@RequestBody Todo todo)
	{
		todo.id = currentId++;
		todoList.add(todo);
		return todo;
	}

	@PutMapping("/{id}")
	public Todo updateTodo(@PathVariable long id, @RequestBody Todo updatedTodo)
	{
		for(Todo todo : todoList)
		{
			if(todo.id ==id)
			{
				todo.title = updatedTodo.title;
				todo.completed = updatedTodo.completed;
				return todo;
			}
		}
		return null;
	}

	@DeleteMapping("/{id}")
	public void deleteTodo(@PathVariable long id)
	{
		todoList.removeIf(todo -> todo.id ==id);
	}
}
