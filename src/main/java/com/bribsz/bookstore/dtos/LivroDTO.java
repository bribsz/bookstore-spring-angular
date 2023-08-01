package com.bribsz.bookstore.dtos;

import java.io.Serializable;

import com.bribsz.bookstore.entities.Livro;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class LivroDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String titulo;
	
	public LivroDTO(Livro obj) {
		super();
		this.id = obj.getId();
		this.titulo = obj.getTitulo();
	}

}
