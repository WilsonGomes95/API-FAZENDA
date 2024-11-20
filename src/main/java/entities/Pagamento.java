package entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPagamento;
	private int idCarrinho;
	private String formaPagamento;
	
	@Column(precision = 10, scale = 2) private BigDecimal preco;
	private BigDecimal valorTotal;
	private LocalDateTime dataPagamento;
	private String statusPagamento;
	
	
	public Pagamento() {
		
	}
	
	
	public Pagamento(int idCarrinho, String formaPagamento, BigDecimal preco, BigDecimal valorTotal,
			LocalDateTime dataPagamento, String statusPagamento) {
		super();
		this.idCarrinho = idCarrinho;
		this.formaPagamento = formaPagamento;
		this.preco = preco;
		this.valorTotal = valorTotal;
		this.dataPagamento = dataPagamento;
		this.statusPagamento = statusPagamento;
	}


	public int getIdPagamento() {
		return idPagamento;
	}


	public void setIdPagamento(int idPagamento) {
		this.idPagamento = idPagamento;
	}


	public int getIdCarrinho() {
		return idCarrinho;
	}


	public void setIdCarrinho(int idCarrinho) {
		this.idCarrinho = idCarrinho;
	}


	public String getFormaPagamento() {
		return formaPagamento;
	}


	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}


	public BigDecimal getPreco() {
		return preco;
	}


	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}


	public BigDecimal getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}


	public LocalDateTime getDataPagamento() {
		return dataPagamento;
	}


	public void setDataPagamento(LocalDateTime dataPagamento) {
		this.dataPagamento = dataPagamento;
	}


	public String getStatusPagamento() {
		return statusPagamento;
	}


	public void setStatusPagamento(String statusPagamento) {
		this.statusPagamento = statusPagamento;
	}
	
	
	

}
