package com.example.anderson.biblioteca.aplication.api;

import javax.validation.constraints.NotEmpty;

import com.example.anderson.biblioteca.domain.Livro;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroAtualizadoForm {

	@NotEmpty(message = "Este campo nao pode estar vazio")
	private String titulo;
	private String autor;
	private int paginas;
	
	public Livro toEntity() {
		return Livro.builder()
				.titulo(titulo)
				.autor(autor)
				.paginas(paginas)
				.build();
	}
}