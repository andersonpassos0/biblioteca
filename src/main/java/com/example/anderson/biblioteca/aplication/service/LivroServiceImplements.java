package com.example.anderson.biblioteca.aplication.service;

import org.springframework.stereotype.Service;

import com.example.anderson.biblioteca.aplication.repository.LivroRepository;
import com.example.anderson.biblioteca.domain.Livro;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Getter
@Setter
@AllArgsConstructor
@Log4j2
@Service
public class LivroServiceImplements implements LivroService {

	private LivroRepository livroRepository;

	@Override
	public void salva(Livro livro) {
		log.info("[start] LivroServiceImplements - salva");
		livroRepository.save(livro);
		log.info("[finish] LivroServiceImplements - salva");
		
		System.out.println("- - - - - - - - - - - - - - - - - -");
		System.out.println(livro.getAutor());
		System.out.println(livro.getTitulo());
		System.out.println(livro.getPaginas());
		System.out.println("- - - - - - - - - - - - - - - - - -");
	}

}
