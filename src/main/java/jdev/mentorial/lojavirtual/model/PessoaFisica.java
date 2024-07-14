package jdev.mentorial.lojavirtual.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class PessoaFisica extends Pessoa implements Serializable{
	
	// @PrimaryKeyJoinColumn : Usado para apontar que a chave primária da tabela será o atributo id da classe pai
	// Usado como forma de redundância, pois a tabela filha herda todos os atributos da tabela pai
	
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String cpf;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	public PessoaFisica() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	

}
