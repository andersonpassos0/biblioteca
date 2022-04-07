package com.example.anderson.biblioteca.aplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.anderson.biblioteca.aplication.repository.EmprestimoRepository;
import com.example.anderson.biblioteca.domain.Emprestimo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Service
public class EmprestimoServiceImplements implements EmprestimoService{

	EmprestimoRepository emprestimoRepository;
	
	@Override
	public void salva(Emprestimo emprestimo) {
		emprestimoRepository.save(emprestimo);
		
		System.out.println("- - - - - - - - - - - - - - - - - -");
		System.out.println("Id do Cliente: " + emprestimo.getIdCliente());
		System.out.println("Data Saida: " + emprestimo.getDataSaida());
		System.out.println("Data Retorno: " + emprestimo.getDataRetorno());
		System.out.println("ID livro: " + emprestimo.getIdLivro());
		System.out.println("- - - - - - - - - - - - - - - - - -");
		
	}

	@Override
	public List<Emprestimo> listaEmprestimos() {
		List<Emprestimo> listaEmprestimos = emprestimoRepository.findAll();
		return listaEmprestimos;
	}

}
