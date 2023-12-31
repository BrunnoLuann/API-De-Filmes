package com.webweb.gerenciadorfilmes.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webweb.gerenciadorfilmes.entities.Diretor;

@Repository
public interface DiretorRepositorio extends JpaRepository<Diretor, Long> {
	public List<Diretor> findByOrderByNomeAsc();

	public Diretor getReferenceByNome(String nome);
}
