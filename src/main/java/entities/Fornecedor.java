package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fornecedor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String telefone;
	private String endereco;
	private String tipoFornecedor;
	
	public Fornecedor() {
		
	}

	public Fornecedor(String nome, String telefone, String endereco, String tipoFornecedor) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.tipoFornecedor = tipoFornecedor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTipoFornecedor() {
		return tipoFornecedor;
	}

	public void setTipoFornecedor(String tipoFornecedor) {
		this.tipoFornecedor = tipoFornecedor;
	}
	
	
	

}
