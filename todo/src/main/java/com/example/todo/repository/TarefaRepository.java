package com.example.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo.domain.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
