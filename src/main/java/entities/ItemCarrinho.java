package entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ItemCarrinho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idItemCarrinho;
	private int idCarrinho;
	private int idProduto;
	private int quantidade;
	@Column(precision = 10, scale = 2) 
	private BigDecimal preco;
	private BigDecimal valorUnitario;
	
	
	public ItemCarrinho() {
		
	}


	public ItemCarrinho(int idCarrinho, int idProduto, int quantidade, BigDecimal preco, BigDecimal valorUnitario) {
		super();
		this.idCarrinho = idCarrinho;
		this.idProduto = idProduto;
		this.quantidade = quantidade;
		this.preco = preco;
		this.valorUnitario = valorUnitario;
	}


	public int getIdItemCarrinho() {
		return idItemCarrinho;
	}


	public void setIdItemCarrinho(int idItemCarrinho) {
		this.idItemCarrinho = idItemCarrinho;
	}


	public int getIdCarrinho() {
		return idCarrinho;
	}


	public void setIdCarrinho(int idCarrinho) {
		this.idCarrinho = idCarrinho;
	}


	public int getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public BigDecimal getPreco() {
		return preco;
	}


	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}


	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}


	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	
	
	
}
