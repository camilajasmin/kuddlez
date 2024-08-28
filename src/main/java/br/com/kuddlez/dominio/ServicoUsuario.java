package br.com.kuddlez.dominio;

public class ServicoUsuario {

	private Integer idUsuario;
	private String nomeCompleto;
	private Integer idServico;
	private String funcoesServ;
	private String descServ;
	private String contatoServ;
	private String dispoServ;
	private String valorServ;
	private Integer qtdRealizadosServ;
	public ServicoUsuario() {
	}
	public ServicoUsuario(Integer idUsuario, String nomeCompleto, Integer idServico, String funcoesServ,
			String descServ, String contatoServ, String dispoServ, String valorServ, Integer qtdRealizadosServ) {
		this.idUsuario = idUsuario;
		this.nomeCompleto = nomeCompleto;
		this.idServico = idServico;
		this.funcoesServ = funcoesServ;
		this.descServ = descServ;
		this.contatoServ = contatoServ;
		this.dispoServ = dispoServ;
		this.valorServ = valorServ;
		this.qtdRealizadosServ = qtdRealizadosServ;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Integer getIdServico() {
		return idServico;
	}
	public void setIdServico(Integer idServico) {
		this.idServico = idServico;
	}
	public String getFuncoesServ() {
		return funcoesServ;
	}
	public void setFuncoesServ(String funcoesServ) {
		this.funcoesServ = funcoesServ;
	}
	public String getDescServ() {
		return descServ;
	}
	public void setDescServ(String descServ) {
		this.descServ = descServ;
	}
	public String getContatoServ() {
		return contatoServ;
	}
	public void setContatoServ(String contatoServ) {
		this.contatoServ = contatoServ;
	}
	public String getDispoServ() {
		return dispoServ;
	}
	public void setDispoServ(String dispoServ) {
		this.dispoServ = dispoServ;
	}
	public String getValorServ() {
		return valorServ;
	}
	public void setValorServ(String valorServ) {
		this.valorServ = valorServ;
	}
	public Integer getQtdRealizadosServ() {
		return qtdRealizadosServ;
	}
	public void setQtdRealizadosServ(Integer qtdRealizadosServ) {
		this.qtdRealizadosServ = qtdRealizadosServ;
	}
}
