package br.com.kuddlez.dominio;

import java.sql.Date;

public class Produto {
	private Integer idProduto;
	private Integer idUsuario;
	private String nomeProd;
	private Double precoProd;
	private String descProd;
	private Integer qtdProd;
	private Date dataCadastroProd;
	private String categoriaProd;
	private Boolean possiTrocaProd;
	private String imgProd;
	
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomeProd() {
		return nomeProd;
	}
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public Double getPrecoProd() {
		return precoProd;
	}
	public void setPrecoProd(Double precoProd) {
		this.precoProd = precoProd;
	}
	public String getDescProd() {
		return descProd;
	}
	public void setDescProd(String descProd) {
		this.descProd = descProd;
	}
	public Integer getQtdProd() {
		return qtdProd;
	}
	public void setQtdProd(Integer qtdProd) {
		this.qtdProd = qtdProd;
	}
	public Date getDataCadastroProd() {
		return dataCadastroProd;
	}
	public void setDataCadastroProd(Date dataCadastroProd) {
		this.dataCadastroProd = dataCadastroProd;
	}
	public String getCategoriaProd() {
		return categoriaProd;
	}
	public void setCategoriaProd(String categoriaProd) {
		this.categoriaProd = categoriaProd;
	}
	public Boolean getPossiTrocaProd() {
		return possiTrocaProd;
	}
	public void setPossiTrocaProd(Boolean possiTrocaProd) {
		this.possiTrocaProd = possiTrocaProd;
	}
	public String getImgProd() {
		return imgProd;
	}
	public void setImgProd(String imgProd) {
		this.imgProd = imgProd;
	}

}
