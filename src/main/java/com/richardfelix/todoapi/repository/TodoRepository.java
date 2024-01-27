package com.richardfelix.todoapi.repository;

import com.richardfelix.todoapi.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TodoRepository extends JpaRepository<Todo, Long> {
}
