package com.example.todo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.todo.domain.model.Tarefa;
import com.example.todo.repository.TarefaRepository;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

	private final TarefaRepository tarefaRepository;
	
	public TarefaController(TarefaRepository tarefaRepository) {
		this.tarefaRepository = tarefaRepository;
	}
	
	@GetMapping
	public List<Tarefa> listar() {
		return tarefaRepository.findAll();
	}
	
	@PostMapping
	public Tarefa adicionar(@RequestBody Tarefa tarefa) {
		return tarefaRepository.save(tarefa);
	}
}
