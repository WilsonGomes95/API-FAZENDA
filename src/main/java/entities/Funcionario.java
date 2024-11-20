package entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomeCompleto;
	private String email;
	private String senha;
	private String genero;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	private String endereco;
	private String conjuge;
	private String cpf;
	private String rg;
	private String tipoUsuario;
	
	
	
	public Funcionario() {
		
	}
					
	public Funcionario(String nomeCompleto, String email, String senha, String genero, Date dataNascimento,
			String endereco, String conjuge, String cpf, String rg, String tipoUsuario) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.senha = senha;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.conjuge = conjuge;
		this.cpf = cpf;
		this.rg = rg;
		this.tipoUsuario = tipoUsuario;
	}
	
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getConjuge() {
		return conjuge;
	}
	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
	
	
	
}
