package jdev.mentorial.lojavirtual.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
public class Produto implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
	private Long id;
	private String tipoUnidade;
	private String nome;
	
	@Column(columnDefinition = "text")
	private String descricao;
	
	private Double peso;
	private Double largura;
	private Double profundidade;
	private BigDecimal valorVenda;
	private Integer QtdEstoque;
	private Integer QtdAlertaEstoque;
	private String linkYoutube;
	private Boolean alertaQtdEstoque;
	private Integer QtdClique;
	private Boolean ativo = Boolean.TRUE;
	

	public Produto() {
		// TODO Auto-generated constructor stub
	}

}
