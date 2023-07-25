package com.bribsz.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bribsz.bookstore.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
