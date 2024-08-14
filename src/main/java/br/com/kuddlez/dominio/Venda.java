package br.com.kuddlez.dominio;

import java.sql.Date;

public class Venda {
	private Integer idVenda;
	private Integer idProduto;
	private Integer vendedorVenda;
	private Integer compradorVenda;
	private Date dataHoraVenda;
	private String formaPagamentoVenda;
	private Double valorTotalVenda;
	private String statusVenda;
	
	public Integer getIdVenda() {
		return idVenda;
	}
	public void setIdVenda(Integer idVenda) {
		this.idVenda = idVenda;
	}
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public Integer getVendedorVenda() {
		return vendedorVenda;
	}
	public void setVendedorVenda(Integer vendedorVenda) {
		this.vendedorVenda = vendedorVenda;
	}
	public Integer getCompradorVenda() {
		return compradorVenda;
	}
	public void setCompradorVenda(Integer compradorVenda) {
		this.compradorVenda = compradorVenda;
	}
	public Date getDataHoraVenda() {
		return dataHoraVenda;
	}
	public void setDataHoraVenda(Date dataHoraVenda) {
		this.dataHoraVenda = dataHoraVenda;
	}
	public String getFormaPagamentoVenda() {
		return formaPagamentoVenda;
	}
	public void setFormaPagamentoVenda(String formaPagamentoVenda) {
		this.formaPagamentoVenda = formaPagamentoVenda;
	}
	public Double getValorTotalVenda() {
		return valorTotalVenda;
	}
	public void setValorTotalVenda(Double valorTotalVenda) {
		this.valorTotalVenda = valorTotalVenda;
	}
	public String getStatusVenda() {
		return statusVenda;
	}
	public void setStatusVenda(String statusVenda) {
		this.statusVenda = statusVenda;
	}
}
