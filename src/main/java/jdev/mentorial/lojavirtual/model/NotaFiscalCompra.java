package jdev.mentorial.lojavirtual.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_nota_fiscal_compra", sequenceName = "seq_nota_fiscal_compra", allocationSize = 1, initialValue = 1)
public class NotaFiscalCompra implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nota_fiscal_compra")
	private Long id;
	private String numeroNota;
	private String serieNota;
	private String descricaoObs;
	private BigDecimal valorTotal;
	private BigDecimal valorDesconto;
	private BigDecimal valorIcms;
	private Date dataCompra;
	
	@ManyToOne(targetEntity = Produto.class)
	@JoinColumn(name = "produto_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_fk"))
	private Produto produto;
	
	@ManyToOne(targetEntity = ContaPagar.class)
	@JoinColumn(name = "conta_pagar_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "conta_pagar_fk"))
	private ContaPagar contaPagar;
	
	public NotaFiscalCompra() {
		// TODO Auto-generated constructor stub
	}


	public String getNumeroNota() {
		return numeroNota;
	}


	public void setNumeroNota(String numeroNota) {
		this.numeroNota = numeroNota;
	}


	public String getSerieNota() {
		return serieNota;
	}


	public void setSerieNota(String serieNota) {
		this.serieNota = serieNota;
	}


	public String getDescricaoObs() {
		return descricaoObs;
	}


	public void setDescricaoObs(String descricaoObs) {
		this.descricaoObs = descricaoObs;
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


	public BigDecimal getValorIcms() {
		return valorIcms;
	}


	public void setValorIcms(BigDecimal valorIcms) {
		this.valorIcms = valorIcms;
	}


	public Long getId() {
		return id;
	}
	
	

}
