package jdev.mentorial.lojavirtual.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@SequenceGenerator(name = "seq_pessoa", sequenceName="seq_pessoa",allocationSize = 1,initialValue = 1)
public abstract class Pessoa implements Serializable{
	// TABLE_PER_CLASS indica que cada entidade que herda de uma classe abstrata será mapeada com todos os atributos para a sua entidade/tabela de origem,
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pessoa")
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	
	@OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Endereco> enderecos = new ArrayList<Endereco>();
	
	//Ler-se: Uma pessoa pode estar associada a vários endereços.
	//Atributo mapeado pelo atributo pessoa
	//orphanRemoval: Se uma entidade filha não estiver mais referenciada na entidade pai, ela será removida
	//CascadeType.ALL : Toda e qualquer tipo de operação, realizada na entidade pai, será refletida na entidade filho
	//FetchType: pesquisar depois
	
	public Pessoa() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
}
