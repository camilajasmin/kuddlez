package br.com.kuddlez.dominio;

import java.sql.Date;

public class Pagamento {
	private Integer idPagamento;
	private Integer idVenda;
	private Date dataHoraPag;
	private String formaPagamentoPag;
	private Integer parcelaPag;
	private Double valorParcelas;
	private String statusPag;
	
	public Integer getIdPagamento() {
		return idPagamento;
	}
	public void setIdPagamento(Integer idPagamento) {
		this.idPagamento = idPagamento;
	}
	public Integer getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}
	public Date getDataHoraPag() {
		return dataHoraPag;
	}
	public void setDataHoraPag(Date dataHoraPag) {
		this.dataHoraPag = dataHoraPag;
	}
	public String getFormaPagamentoPag() {
		return formaPagamentoPag;
	}
	public void setFormaPagamentoPag(String formaPagamentoPag) {
		this.formaPagamentoPag = formaPagamentoPag;
	}
	public Integer getParcelaPag() {
		return parcelaPag;
	}
	public void setParcelaPag(Integer parcelaPag) {
		this.parcelaPag = parcelaPag;
	}
	public Double getValorParcelas() {
		return valorParcelas;
	}
	public void setValorParcelas(Double valorParcelas) {
		this.valorParcelas = valorParcelas;
	}
	public String getStatusPag() {
		return statusPag;
	}
	public void setStatusPag(String statusPag) {
		this.statusPag = statusPag;
	}
}
