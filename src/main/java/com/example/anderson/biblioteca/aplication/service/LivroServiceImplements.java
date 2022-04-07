package com.example.anderson.biblioteca.aplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.anderson.biblioteca.aplication.repository.LivroRepository;
import com.example.anderson.biblioteca.domain.Cliente;
import com.example.anderson.biblioteca.domain.Livro;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Getter
@Setter
@AllArgsConstructor
@Service
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

	@Override
	public List<Livro> listaLivros() {
		List<Livro> listaLivros = livroRepository.findAll();
		return listaLivros;
	}

}
