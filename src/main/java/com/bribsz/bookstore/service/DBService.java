package com.bribsz.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bribsz.bookstore.entities.Categoria;
import com.bribsz.bookstore.entities.Livro;
import com.bribsz.bookstore.repositories.CategoriaRepository;
import com.bribsz.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaDB() {
		
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria cat2 = new Categoria(null, "Ficção Científica", "Livros de Sci-FI");
		Categoria cat3 = new Categoria(null, "Futebol", "Livros sobre Futebol");
		
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Texto Teste Lorem Ipsum", cat1);
		Livro l2 = new Livro(null, "Java", "Java Author", "Livro sobre Java", cat1);
		Livro l3 = new Livro(null, "De Volta para o Futuro", "Caseen Gaines", "Volta no tempo", cat2);
		Livro l4 = new Livro(null, "Star Wars", "George Lucas", "Guerra nas estrelas", cat2);
		Livro l5 = new Livro(null, "Flamengo", "Torcida do Flamengo", "Clube de Regatas do Flamengo", cat3);
		
		cat1.getLivros().addAll(Arrays.asList(l1,l2));
		cat2.getLivros().addAll(Arrays.asList(l3,l4));
		cat3.getLivros().addAll(Arrays.asList(l5));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAllAndFlush(Arrays.asList(l1, l2, l3, l4, l5));
	}
}
