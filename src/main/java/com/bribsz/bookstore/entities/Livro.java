package com.bribsz.bookstore.entities;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Livro implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message = "Campo TÍTULO é requerido")
	@Length(min = 3, max = 100, message = "O campo TÍTULO deve ter entre 3 e 50 caracteres")
	private String titulo;
	
	@NotEmpty(message = "Campo AUTOR é requerido")
	@Length(min = 3, max = 100, message = "O campo AUTOR deve ter entre 3 e 50 caracteres")
	private String nome_autor;
	
	@NotEmpty(message = "Campo TEXTO é requerido")
	@Length(min = 10, max = 2000000, message = "O campo TEXTO deve ter entre 3 e 2.000.000 caracteres")
	private String texto;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;
}
