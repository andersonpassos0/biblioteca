package com.example.anderson.biblioteca.aplication.service;

import java.util.List;

import com.example.anderson.biblioteca.domain.Emprestimo;

public interface EmprestimoService {
	
	void salva (Emprestimo emprestimo);

	List<Emprestimo> listaEmprestimos();

}
