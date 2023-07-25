package com.bribsz.bookstore.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Categoria {
	
	private Integer id;
	private String nome;
	private String descricao;
	
	private List<Livro> livros = new ArrayList<Livro>();
}
