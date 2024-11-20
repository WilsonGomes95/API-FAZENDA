package entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduto;
	private String nomeProduto;
	private String descricao;
	@Column(precision = 10, scale = 2)
	private BigDecimal preco;
	private String unidadeMedida;
	private int quantidadeEmEstoque;
	
	
	public Produto() {
		
	}


	public Produto(String nomeProduto, String descricao, BigDecimal preco, String unidadeMedida,
			int quantidadeEmEstoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		this.preco = preco;
		this.unidadeMedida = unidadeMedida;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}


	public int getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public BigDecimal getPreco() {
		return preco;
	}


	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}


	public String getUnidadeMedida() {
		return unidadeMedida;
	}


	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}


	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}


	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	

}
