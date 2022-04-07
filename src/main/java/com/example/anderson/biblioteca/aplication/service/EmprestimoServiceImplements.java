package com.example.anderson.biblioteca.aplication.service;

import org.springframework.stereotype.Service;

import com.example.anderson.biblioteca.aplication.repository.EmprestimoRepository;
import com.example.anderson.biblioteca.domain.Emprestimo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Getter
@AllArgsConstructor
@Log4j2
@Service
public class EmprestimoServiceImplements implements EmprestimoService{

	EmprestimoRepository emprestimoRepository;
	
	@Override
	public void salva(Emprestimo emprestimo) {
		log.info("[start] EmprestimoServiceImplements - salva");
		emprestimoRepository.save(emprestimo);
		log.info("[finish] EmprestimoServiceImplements - salva");
		
		System.out.println("- - - - - - - - - - - - - - - - - -");
		System.out.println("Id do Cliente: " + emprestimo.getIdCliente());
		System.out.println("Data Saida: " + emprestimo.getDataSaida());
		System.out.println("Data Retorno: " + emprestimo.getDataRetorno());
		System.out.println("ID livro: " + emprestimo.getIdLivro());
		System.out.println("- - - - - - - - - - - - - - - - - -");
		
	}

}
