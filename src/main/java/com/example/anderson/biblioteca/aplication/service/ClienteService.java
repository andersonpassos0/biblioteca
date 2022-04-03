package com.example.anderson.biblioteca.aplication.service;

import java.util.List;

import com.example.anderson.biblioteca.domain.Cliente;

public interface ClienteService {
	
	void salva (Cliente cliente);

	List<Cliente> listaClientes();
	
}
