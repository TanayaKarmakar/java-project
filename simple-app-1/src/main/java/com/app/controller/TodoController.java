package com.app.controller;

import com.app.domain.Todo;
import com.app.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/")
    public List<Todo> showTodos() {
        return todoRepository.findAll();
    }

    @PostMapping("/")
    public void createTodo(@RequestBody Todo todo) {
        todoRepository.save(todo);
    }
}
