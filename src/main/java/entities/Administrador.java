package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Administrador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAdministrador;
	private int idUsuario;
	private String cargo;
	private boolean acessoTotal;
	
	public Administrador() {
		
	}

	public Administrador(int idUsuario, String cargo, boolean acessoTotal) {
		super();
		this.idUsuario = idUsuario;
		this.cargo = cargo;
		this.acessoTotal = acessoTotal;
	}

	public int getIdAdministrador() {
		return idAdministrador;
	}

	public void setIdAdministrador(int idAdministrador) {
		this.idAdministrador = idAdministrador;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public boolean isAcessoTotal() {
		return acessoTotal;
	}

	public void setAcessoTotal(boolean acessoTotal) {
		this.acessoTotal = acessoTotal;
	}
	
	
	

}
