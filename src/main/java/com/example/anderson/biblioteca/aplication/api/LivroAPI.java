package com.example.anderson.biblioteca.aplication.api;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
@RequestMapping("/v1/livro")
public interface LivroAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	void salva (LivroForm livroForm);
	
}
