package com.example.anderson.biblioteca.aplication.api;

import com.example.anderson.biblioteca.domain.Livro;

import lombok.Getter;

@Getter

public class LivroForm {
	
	private String titulo;
	private String autor;
	private int paginas;

	public Livro toEntity() {
		
		return Livro.builder()
				.titulo(titulo)
				.autor(autor)
				.paginas(paginas).build();
	}

}
