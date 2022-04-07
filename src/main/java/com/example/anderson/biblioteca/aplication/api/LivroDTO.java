package com.example.anderson.biblioteca.aplication.api;

import java.util.List;
import java.util.stream.Collectors;

import com.example.anderson.biblioteca.domain.Livro;

import lombok.Getter;

@Getter
public class LivroDTO {
	
	private Long id;
	private String titulo;
	private String autor;
	private int paginas;
	
	public LivroDTO(Livro livro) {
		this.id = livro.getId();
		this.titulo = livro.getTitulo();
		this.autor = livro.getAutor();
		this.paginas = livro.getPaginas();
	}
	
	public static List<LivroDTO> parseListDTO(List<Livro> livros) {
		return livros.stream().map(LivroDTO::new).collect(Collectors.toList());
	}

}
