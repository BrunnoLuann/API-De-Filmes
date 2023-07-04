package com.webweb.gerenciadorfilmes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webweb.gerenciadorfilmes.entities.Ator;

@Repository
public interface AtorRepositorio extends JpaRepository<Ator, Long> {
	public List<Ator> findByOrderByNomeAsc();

	public Ator getReferenceByNome(String nome);
}
