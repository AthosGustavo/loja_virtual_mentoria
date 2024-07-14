package jdev.mentorial.lojavirtual.model;

import java.io.Serializable;

import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_endereco", sequenceName = "seq_endereco", allocationSize = 1, initialValue = 1)
public class Endereco implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_endereco")
	private Long id;
	private String ruaLogra;
	private String cep;
	private String numero;
	private String complemento;
	private String bairro;
	private String uf;
	private String cidade;
	
	@ManyToOne(targetEntity = Pessoa.class)
    @JoinColumn(name = "pessoa_id", nullable = false)
    private Pessoa pessoa;
	
	//Ler-se: Vários endereços podem estar associado a apenas uma pessoa.
	//A anotação @JoinColumn é usada para especificar detalhes sobre a coluna que será usada como chave estrangeira em uma relação de entidade.
	//name define o nome da chave estrangeira
	//Dica:O mapeamento é realizado no lado muitos.
	
	//private ENUM tipoEndereco;
	
	
	
	public Endereco() {
		// TODO Auto-generated constructor stub
	}

}
