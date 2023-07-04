package com.webweb.gerenciadorfilmes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.webweb.gerenciadorfilmes.repositorios.AtorRepositorio;

@SpringBootApplication
public class GerenciadorFilmesSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorFilmesSpringApplication.class, args);
	}

}
