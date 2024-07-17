package jdev.mentorial.lojavirtual.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ForeignKey;

import jdev.mentorial.lojavirtual.enums.StatusContaReceber;

@Entity
@SequenceGenerator(name = "seq_conta_receber", sequenceName = "seq_conta_receber", allocationSize = 1, initialValue = 1)
public class ContaReceber implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta_receber")
	private Long id;
	private String descricao;
	
	@Enumerated(EnumType.STRING)
	private StatusContaReceber status;
	
	@Temporal(TemporalType.DATE)
	private Date dtVencimento;
	
	@Temporal(TemporalType.DATE)
	private Date dtPagamento;
	private BigDecimal valorTotal;
	private BigDecimal valorDesconto;
	
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_fk"))
	private Pessoa pessoa;
	
	
	
	
	public ContaReceber() {
		// TODO Auto-generated constructor stub
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getDescricao() {
		return descricao;
	}




	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}




	public StatusContaReceber getStatus() {
		return status;
	}




	public void setStatus(StatusContaReceber status) {
		this.status = status;
	}




	public Date getDtVencimento() {
		return dtVencimento;
	}




	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}




	public Date getDtPagamento() {
		return dtPagamento;
	}




	public void setDtPagamento(Date dtPagamento) {
		this.dtPagamento = dtPagamento;
	}




	public BigDecimal getValorTotal() {
		return valorTotal;
	}




	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}




	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}




	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}




	public Pessoa getPessoa() {
		return pessoa;
	}




	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

}
