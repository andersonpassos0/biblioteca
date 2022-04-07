package com.example.anderson.biblioteca.aplication.service;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.anderson.biblioteca.aplication.handler.APIException;
import com.example.anderson.biblioteca.aplication.repository.ClienteRepository;
import com.example.anderson.biblioteca.domain.Cliente;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Service
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

	@Override
	public void editaCliente(UUID idCliente, Cliente cliente) {
		Cliente clienteAtualizado = buscaClientePorId(idCliente);
		clienteAtualizado.atualiza(cliente);
		clienteRepository.save(clienteAtualizado);
		
	}

	private Cliente buscaClientePorId(UUID idCliente) {
		Cliente buscaCliente = clienteRepository.buscaClientePorId(idCliente)
			.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Cliente nao encontrado!"));
		return buscaCliente;
		
	}

}
