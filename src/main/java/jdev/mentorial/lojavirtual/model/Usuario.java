package jdev.mentorial.lojavirtual.model;

import java.util.Date;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.ForeignKey;

@Entity
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
public class Usuario implements UserDetails {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
	private Long id;
	private String login;
	private String senha;
	
	@Temporal(TemporalType.DATE)
	private Date dataAtualSenha;
	
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name = "usuarios_acesso", 
		uniqueConstraints = @UniqueConstraint(columnNames = {"usuario_id", "acesso_id"},
		name = "unique_acesso_user"),
		joinColumns = 
			@JoinColumn(
				name = "usuario_id", 
				referencedColumnName = "id", 
				table = "usuario",
				unique = false, 
				foreignKey = @ForeignKey(name = "usuario_fk", value = ConstraintMode.CONSTRAINT)),
		inverseJoinColumns = 
			@JoinColumn(
				name = "acesso_id", 
				unique = false, 
				referencedColumnName = "id", 
				table = "acesso",
				foreignKey = @ForeignKey(name = "acesso_fk", value = ConstraintMode.CONSTRAINT)))
	private List<Acesso> acessos;
	
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Date getDataAtualSenha() {
		return dataAtualSenha;
	}


	public void setDataAtualSenha(Date dataAtualSenha) {
		this.dataAtualSenha = dataAtualSenha;
	}


	public List<Acesso> getAcessos() {
		return acessos;
	}


	public void setAcessos(List<Acesso> acessos) {
		this.acessos = acessos;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return this.acessos;
	}


	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.senha;
	}


	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.login;
	}


	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	

}
