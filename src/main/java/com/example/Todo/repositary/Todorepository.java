package com.example.Todo.repositary;

import com.example.Todo.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Todorepository extends JpaRepository<Todo,Long>{

}
