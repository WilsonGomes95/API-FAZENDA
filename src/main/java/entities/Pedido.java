package entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedido;
	private int idCarrinho;
	private Date dataPedido;
	private String statusPedido;
	
	
	public Pedido() {
		
	}


	public Pedido(int idCarrinho, Date dataPedido, String statusPedido) {
		super();
		this.idCarrinho = idCarrinho;
		this.dataPedido = dataPedido;
		this.statusPedido = statusPedido;
	}


	public int getIdPedido() {
		return idPedido;
	}


	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}


	public int getIdCarrinho() {
		return idCarrinho;
	}


	public void setIdCarrinho(int idCarrinho) {
		this.idCarrinho = idCarrinho;
	}


	public Date getDataPedido() {
		return dataPedido;
	}


	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}


	public String getStatusPedido() {
		return statusPedido;
	}


	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}
	
	
	

}
