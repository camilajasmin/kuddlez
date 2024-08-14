package br.com.kuddlez.dominio;

import java.sql.Date;

public class Troca {
	private Integer idTroca;
	private Integer userOfertanteTroca;
	private Integer userReceptorTroca;
	private Integer prodOferecidoTroca;
	private Integer prodReceberTroca;
	private Date datehoraTroca;
	private String statusTroca;
	
	public Integer getIdTroca() {
		return idTroca;
	}
	public void setIdTroca(Integer idTroca) {
		this.idTroca = idTroca;
	}
	public Integer getUserOfertanteTroca() {
		return userOfertanteTroca;
	}
	public void setUserOfertanteTroca(Integer userOfertanteTroca) {
		this.userOfertanteTroca = userOfertanteTroca;
	}
	public Integer getUserReceptorTroca() {
		return userReceptorTroca;
	}
	public void setUserReceptorTroca(Integer userReceptorTroca) {
		this.userReceptorTroca = userReceptorTroca;
	}
	public Integer getProdOferecidoTroca() {
		return prodOferecidoTroca;
	}
	public void setProdOferecidoTroca(Integer prodOferecidoTroca) {
		this.prodOferecidoTroca = prodOferecidoTroca;
	}
	public Integer getProdReceberTroca() {
		return prodReceberTroca;
	}
	public void setProdReceberTroca(Integer prodReceberTroca) {
		this.prodReceberTroca = prodReceberTroca;
	}
	public Date getDatehoraTroca() {
		return datehoraTroca;
	}
	public void setDatehoraTroca(Date datehoraTroca) {
		this.datehoraTroca = datehoraTroca;
	}
	public String getStatusTroca() {
		return statusTroca;
	}
	public void setStatusTroca(String statusTroca) {
		this.statusTroca = statusTroca;
	}
}
