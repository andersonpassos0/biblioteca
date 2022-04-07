package com.example.anderson.biblioteca.aplication.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.anderson.biblioteca.aplication.service.LivroService;
import com.example.anderson.biblioteca.domain.Livro;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class LivroRestController implements LivroAPI {

	private LivroService livroService;

	@Override
	public void salva(LivroForm livroForm) {
		log.info("[Start] LivroRestController - salva");
		livroService.salva(livroForm.toEntity());
		log.info("[Finish] - LivroRestController - salva");
	}

	@Override
	public List<LivroDTO> listaTodos() {
		log.info("[start] LivroRestController - Lista");
		List<Livro> listaLivro = livroService.listaLivros();
		log.info("[finish] LivroRestController - Lista");
		return LivroDTO.parseListDTO(listaLivro);
	}

}

