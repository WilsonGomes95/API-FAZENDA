package entities;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cultivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCultivo;
	private String tipoCultivo;
	private Date dataPlantio;
	private String localizacao;
	@Column(precision = 10, scale = 2)
	private BigDecimal tamanhoArea;
	private int idProduto;
	private int quantidadeColhida;
	
	
	public Cultivo() {
		
	}


	public Cultivo(String tipoCultivo, Date dataPlantio, String localizacao, BigDecimal tamanhoArea, int idProduto,
			int quantidadeColhida) {
		super();
		this.tipoCultivo = tipoCultivo;
		this.dataPlantio = dataPlantio;
		this.localizacao = localizacao;
		this.tamanhoArea = tamanhoArea;
		this.idProduto = idProduto;
		this.quantidadeColhida = quantidadeColhida;
	}


	public int getIdCultivo() {
		return idCultivo;
	}


	public void setIdCultivo(int idCultivo) {
		this.idCultivo = idCultivo;
	}


	public String getTipoCultivo() {
		return tipoCultivo;
	}


	public void setTipoCultivo(String tipoCultivo) {
		this.tipoCultivo = tipoCultivo;
	}


	public Date getDataPlantio() {
		return dataPlantio;
	}


	public void setDataPlantio(Date dataPlantio) {
		this.dataPlantio = dataPlantio;
	}


	public String getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}


	public BigDecimal getTamanhoArea() {
		return tamanhoArea;
	}


	public void setTamanhoArea(BigDecimal tamanhoArea) {
		this.tamanhoArea = tamanhoArea;
	}


	public int getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}


	public int getQuantidadeColhida() {
		return quantidadeColhida;
	}


	public void setQuantidadeColhida(int quantidadeColhida) {
		this.quantidadeColhida = quantidadeColhida;
	}
	
	
	
	
}
