package com.example.anderson.biblioteca.aplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.anderson.biblioteca.aplication.repository.ClienteRepository;
import com.example.anderson.biblioteca.domain.Cliente;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClienteServiceImplements implements ClienteService {
	
	private ClienteRepository clienteRepository;

	@Override
	public void salva(Cliente cliente) {
		clienteRepository.save(cliente);
		
		System.out.println("- - - - - - - - - - - - - - -");
		System.out.println("ID do Cliente: " + cliente.getId());
		System.out.println("Nome do Cliente: " + cliente.getNome());
		System.out.println("Dt Nascimento: " + cliente.getNascimento());
		System.out.println("Endereco: " + cliente.getEndereco());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("- - - - - - - - - - - - - - -");
		
	}

	@Override
	public List<Cliente> listaClientes() {
		List<Cliente> listaClientes = clienteRepository.findAll();
		return listaClientes;
	
	}
}
