package com.example.anderson.biblioteca.aplication.api;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import com.example.anderson.biblioteca.domain.Emprestimo;

import lombok.Getter;

@Getter
public class EmprestimoDTO {
	
	private Long id;
	private Date dataSaida;
	private Date dataRetorno;
	private Long idCliente;
	private Long idLivro;
	
	public EmprestimoDTO(Emprestimo emprestimo) {
		this.id = emprestimo.getId();
		this.dataSaida = emprestimo.getDataSaida();
		this.dataRetorno = emprestimo.getDataRetorno();
		this.idCliente = emprestimo.getIdCliente();
		this.idLivro = emprestimo.getIdLivro();
	}
	
	public static List<EmprestimoDTO> parseListDTO(List<Emprestimo> emprestimos) {
		return emprestimos.stream().map(EmprestimoDTO::new).collect(Collectors.toList());
	}
	
}
