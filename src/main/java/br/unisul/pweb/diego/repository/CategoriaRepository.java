package br.unisul.pweb.diego.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unisul.pweb.diego.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

	
}
