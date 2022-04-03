package com.example.anderson.biblioteca.aplication.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


@RequestMapping("/v1/cliente")
public interface ClienteAPI {
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void salva (@RequestBody ClienteForm clienteForm);
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ClienteDTO> listaTodos();
	

}
