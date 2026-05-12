package com.example.Todo.service;

import com.example.Todo.models.Todo;
import com.example.Todo.repositary.Todorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private Todorepository todorepository;

    public Todo createTodo(Todo todo){
        return todorepository.save(todo);

    }
    public Todo getTodoById(Long id){
        return todorepository.findById(id).orElseThrow(() ->new RuntimeException("Todo not found"));
    }

    public List<Todo> getTodos(){
      return  todorepository.findAll();
    }

    public Page<Todo> getAllTodosPages(int page,int size){
        Pageable pageable = PageRequest.of(page,size);
        return todorepository.findAll(pageable);
    }

    public Todo updateTodo(Todo todo){
        return todorepository.save(todo);
    }

    public void deleteTodoById(Long id){
        todorepository.delete(getTodoById(id));
    }
    public void deleteTodo(Todo todo){
        todorepository.delete(todo);
    }
}
