package entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CarrinhoCompras {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCarrinho;
	private int idUsuario;
	private LocalDateTime dataCriacao;
	
	
	public CarrinhoCompras() {
		
	}


	public CarrinhoCompras(int idUsuario, LocalDateTime dataCriacao) {
		super();
		this.idUsuario = idUsuario;
		this.dataCriacao = dataCriacao;
	}


	public int getIdCarrinho() {
		return idCarrinho;
	}


	public void setIdCarrinho(int idCarrinho) {
		this.idCarrinho = idCarrinho;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	
	
}
