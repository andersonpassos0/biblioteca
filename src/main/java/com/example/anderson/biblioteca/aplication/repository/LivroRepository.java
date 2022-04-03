package com.example.anderson.biblioteca.aplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.anderson.biblioteca.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
