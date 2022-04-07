package com.example.anderson.biblioteca.aplication.repository;

import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.anderson.biblioteca.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	Optional<Cliente> buscaClientePorId(@Valid UUID idCliente);
	
}
