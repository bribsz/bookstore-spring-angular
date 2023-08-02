package com.bribsz.bookstore.dtos;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import com.bribsz.bookstore.entities.Categoria;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CategoriaDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message = "Campo NOME é requerido")
	@Length(min = 3, max = 100, message = "O campo NOME deve ter entre 3 e 100 caracteres")
	private String nome;
	
	@NotEmpty(message = "Campo Descrição é requerido")
	@Length(min = 3, max = 100, message = "O campo Descrição deve ter entre 3 e 200 caracteres")
	private String descricao;
	
	public CategoriaDTO(Categoria obj) {
		super();
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.descricao = obj.getDescricao();
	}
	
}
