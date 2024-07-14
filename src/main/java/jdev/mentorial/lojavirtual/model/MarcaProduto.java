package jdev.mentorial.lojavirtual.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_marca_produto", sequenceName = "seq_marca_produto", allocationSize = 1, initialValue = 1)
// sequenceName		: Nome da sequência no banco de dados
// name		   		: Nome da sequência que será usada em GeneratedValue
// allocationSize	: Valor a ser incrementado
// initialValue		: Valor inicial da sequence
public class MarcaProduto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_produto")
	private Long id;
	private String nomeDescricao;
	
}
