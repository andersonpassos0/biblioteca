package com.example.anderson.biblioteca.aplication.api;

import java.util.Date;

import com.example.anderson.biblioteca.domain.Emprestimo;

import lombok.Getter;

@Getter
public class EmprestimoForm {
	
	private Date dataSaida;
	private Date dataRetorno;
	private Long idCliente;
	private Long idLivro;
	
	public Emprestimo toEntity() {
		
		return Emprestimo.builder()
				.dataSaida(dataSaida)
				.dataRetorno(dataRetorno)
				.idCliente(idCliente)
				.idLivro(idLivro)
				.build();
	}

}
