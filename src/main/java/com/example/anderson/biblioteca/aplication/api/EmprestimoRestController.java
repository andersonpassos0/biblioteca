package com.example.anderson.biblioteca.aplication.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.anderson.biblioteca.aplication.service.EmprestimoService;
import com.example.anderson.biblioteca.domain.Emprestimo;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@RestController
@Log4j2
public class EmprestimoRestController implements EmprestimoAPI{

	private EmprestimoService emprestimoService;
	
	@Override
	public void salva(EmprestimoForm emprestimoForm) {
		log.info("[start] EmprestimoRestController - salva");
		emprestimoService.salva(emprestimoForm.toEntity());
		log.info("[finish] EmprestimoRestController - salva");
		
	}

	@Override
	public List<EmprestimoDTO> listaTodos() {
		log.info("[start] EmprestimoRestController - busca");
		List<Emprestimo> listaEmprestimo = emprestimoService.listaEmprestimos();
		log.info("[finish] EmprestimoRestController - busca");
		return EmprestimoDTO.parseListDTO(listaEmprestimo);
	}

}
