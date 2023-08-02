package com.bribsz.bookstore.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
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
@Entity
public class Categoria implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Campo NOME é requerido")
	@Length(min = 3, max = 100, message = "O campo NOME deve ter entre 3 e 100 caracteres")
	private String nome;
	
	@NotEmpty(message = "Campo Descrição é requerido")
	@Length(min = 3, max = 100, message = "O campo Descrição deve ter entre 3 e 200 caracteres")
	private String descricao;
	
	@OneToMany(mappedBy = "categoria")
	private List<Livro> livros = new ArrayList<Livro>();
	
	public Categoria(Integer id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
}
