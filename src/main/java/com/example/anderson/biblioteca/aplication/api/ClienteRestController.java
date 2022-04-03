package com.example.anderson.biblioteca.aplication.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.anderson.biblioteca.aplication.service.ClienteService;
import com.example.anderson.biblioteca.domain.Cliente;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@RestController
@Log4j2
public class ClienteRestController implements ClienteAPI {
	
	private ClienteService clienteService;

	@Override
	public void salva(ClienteForm clienteForm) {
		log.info("[Start] ClienteRestController - salva");
		clienteService.salva(clienteForm.toEntity());
		log.info("[Finish] ClienteRestController - salva");
	}
	
	@Override
	public List<ClienteDTO> listaTodos() {
		log.info("[Start] ClienteRestController - busca");
		List<Cliente> listaCliente = clienteService.listaClientes();
		log.info("[Finish] ClienteRestController - busca");
		return ClienteDTO.parseListDTO(listaCliente);
	}
	
}
