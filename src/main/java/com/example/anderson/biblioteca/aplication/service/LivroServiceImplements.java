package com.example.anderson.biblioteca.aplication.service;

import org.springframework.stereotype.Service;
import com.example.anderson.biblioteca.aplication.repository.LivroRepository;
import com.example.anderson.biblioteca.domain.Livro;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
@AllArgsConstructor
public class LivroServiceImplements implements LivroService {

	private LivroRepository livroRepository;
	
	@Override
	public void salva(Livro livro) {
		livroRepository.save(livro);
		System.out.println("- - - - - - - - - - - - - - - - - -");
		System.out.println(livro.getAutor());
		System.out.println(livro.getTitulo());
		System.out.println(livro.getPaginas());
		System.out.println("- - - - - - - - - - - - - - - - - -");
	}

}
