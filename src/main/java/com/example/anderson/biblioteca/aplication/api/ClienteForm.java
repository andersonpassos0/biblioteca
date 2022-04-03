package com.example.anderson.biblioteca.aplication.api;

import java.util.Date;

import com.example.anderson.biblioteca.domain.Cliente;

import lombok.Getter;

@Getter
public class ClienteForm {

	private String nome;
	private Date nascimento;
	private String endereco;
	private String telefone;
	
	public Cliente toEntity() {
		
		return Cliente.builder()
				.nome(nome)
				.nascimento(nascimento)
				.endereco(endereco)
				.telefone(telefone)
				.build();
	}
	
}
