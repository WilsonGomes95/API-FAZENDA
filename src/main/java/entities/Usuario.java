package entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;



@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	private String nomeCompleto;
	private String email;
	private String senha;
	private String genero;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	private String endereco;
	private String conjuge;
	private String cpf;
	
	
	
	public Usuario() {
		
	}



	public Usuario(String nomeCompleto, String email, String senha, String genero, Date dataNascimento, String endereco,
			String conjuge, String cpf) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.senha = senha;
		this.genero = genero;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.conjuge = conjuge;
		this.cpf = cpf;
	}



	public int getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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
	
	

	
	
}
