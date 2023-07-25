package com.bribsz.bookstore.entity;

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
public class Livro {
	
	private Integer id;
	private String titulo;
	private String nome_autor;
	private String texo;
	
	private Categoria categoria;
}
