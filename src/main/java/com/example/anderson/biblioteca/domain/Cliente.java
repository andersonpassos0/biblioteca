package com.example.anderson.biblioteca.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String nome;
	@NotNull
	private Date nascimento;
	@NotNull
	private String endereco;
	@NotNull
	private String telefone;
	
	public void atualiza(Cliente cliente) {
		this.nome = cliente.getNome();
		this.nascimento = cliente.getNascimento();
		this.endereco = cliente.getEndereco();
		this.telefone = cliente.getTelefone();
	}

}
