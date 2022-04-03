package com.example.anderson.biblioteca.aplication.api;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.example.anderson.biblioteca.domain.Cliente;

import lombok.Getter;

@Getter
public class ClienteDTO {
	
	private Long id;
	private String nome;
	private Date nascimento;
	private String endereco;
	private String telefone;
	
	public ClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.nascimento = cliente.getNascimento();
		this.endereco = cliente.getEndereco();
		this.telefone = cliente.getTelefone();
	}
	
	public static List<ClienteDTO> parseListDTO(List<Cliente> clientes) {
		return clientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
	}

}
