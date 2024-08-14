package br.com.kuddlez.dominio;

import java.sql.Date;

public class Postagem {
    private Integer idPostagem;
    private Integer idUsuario;
    private Date dataHoraPost;
    private String txtPost;
    private byte[] imgPost; 
    private String videoPost;
    private String qtdLikePost;
    private String qtdSalvosPost;
    private String qtdComentsPost;
    private Boolean ifComentarioPost;
    
	public Integer getIdPostagem() {
		return idPostagem;
	}
	public void setIdPostagem(Integer idPostagem) {
		this.idPostagem = idPostagem;
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public Date getDataHoraPost() {
		return dataHoraPost;
	}
	public void setDataHoraPost(Date dataHoraPost) {
		this.dataHoraPost = dataHoraPost;
	}
	public String getTxtPost() {
		return txtPost;
	}
	public void setTxtPost(String txtPost) {
		this.txtPost = txtPost;
	}
	public byte[] getImgPost() {
		return imgPost;
	}
	public void setImgPost(byte[] imgPost) {
		this.imgPost = imgPost;
	}
	public String getVideoPost() {
		return videoPost;
	}
	public void setVideoPost(String videoPost) {
		this.videoPost = videoPost;
	}
	public String getQtdLikePost() {
		return qtdLikePost;
	}
	public void setQtdLikePost(String qtdLikePost) {
		this.qtdLikePost = qtdLikePost;
	}
	public String getQtdSalvosPost() {
		return qtdSalvosPost;
	}
	public void setQtdSalvosPost(String qtdSalvosPost) {
		this.qtdSalvosPost = qtdSalvosPost;
	}
	public String getQtdComentsPost() {
		return qtdComentsPost;
	}
	public void setQtdComentsPost(String qtdComentsPost) {
		this.qtdComentsPost = qtdComentsPost;
	}
	public Boolean getIfComentarioPost() {
		return ifComentarioPost;
	}
	public void setIfComentarioPost(Boolean ifComentarioPost) {
		this.ifComentarioPost = ifComentarioPost;
	}
}
