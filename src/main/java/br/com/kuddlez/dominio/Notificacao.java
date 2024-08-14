package br.com.kuddlez.dominio;

import java.sql.Date;

public class Notificacao {
	private Integer idNot;
	private Integer idUsuario;
	private Date dataHoraNot;
	private String conteudoNot;
	private String tipoNot;
	private Boolean lidaNot;
	
	public Integer getIdNot() {
		return idNot;
	}
	public void setIdNot(Integer idNot) {
		this.idNot = idNot;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Date getDataHoraNot() {
		return dataHoraNot;
	}
	public void setDataHoraNot(Date dataHoraNot) {
		this.dataHoraNot = dataHoraNot;
	}
	public String getConteudoNot() {
		return conteudoNot;
	}
	public void setConteudoNot(String conteudoNot) {
		this.conteudoNot = conteudoNot;
	}
	public String getTipoNot() {
		return tipoNot;
	}
	public void setTipoNot(String tipoNot) {
		this.tipoNot = tipoNot;
	}
	public Boolean getLidaNot() {
		return lidaNot;
	}
	public void setLidaNot(Boolean lidaNot) {
		this.lidaNot = lidaNot;
	}
	
}
