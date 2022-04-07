package com.example.anderson.biblioteca.aplication.service;

import java.util.List;
import java.util.UUID;

import com.example.anderson.biblioteca.domain.Cliente;

public interface ClienteService {
	
	void salva (Cliente cliente);

	List<Cliente> listaClientes();

	void editaCliente(UUID idCliente, Cliente entity);
	
}
