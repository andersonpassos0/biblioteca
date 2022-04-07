package com.example.anderson.biblioteca.aplication.service;

import java.util.List;

import com.example.anderson.biblioteca.domain.Livro;

public interface LivroService {

	void salva(Livro livro);

	List<Livro> listaLivros();
	
}
