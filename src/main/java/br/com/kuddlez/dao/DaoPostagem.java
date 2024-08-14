package br.com.kuddlez.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.kuddlez.dominio.Postagem;

public class DaoPostagem extends CONEXAO implements CRUDKuddlez<Postagem>{

	@Override
	public String Cadastrar(Postagem dados) {
		  String msg = "";
	        try{
	            if(abrirConexao()){
	                    String sql = "insert into postagem(dataHoraPost,txtPost,imgPost,videoPost,qtdLikePost,qtdSalvosPost,qtdComentPost,ifComentarioPost)values(?,?,?,?,?,?,?,?)"
	                    pst = con.prepareStatement(sql);
	                   
	                    pst.setInt(1, dados.getIdUsuario());
	                    pst.setDate(2, dados.getDataHoraPost());
	                    pst.setString(3, dados.getTxtPost());
	                    pst.setBytes(5, dados.getImgPost());
	                    pst.setString(6, dados.getVideoPost());
	                    pst.setString(7,dados.getVideoPost());
	                    pst.setString(8,dados.getQtdLikePost());
	                    pst.setString(9,dados.getQtdComentsPost());
	                    pst.setString(10,dados.getQtdSalvosPost());
	                    pst.setBoolean(11, dados.getIfComentarioPost());
	 
	                    if(pst.executeUpdate() > 0) {
	                        msg = "Cadastro realizado";
	                    }
	                    else {
	                        msg = "Não foi possível cadastrar";
	                    }
	                }
	                else {
	                    msg = "Não foi possível estabelecer a conexão com o banco";
	                }
	            }
	            catch(SQLException se) {
	                msg = "Erro ao tentar cadastrar. "+se.getMessage();
	                }
	            catch(Exception e) {
	                msg = "Erro inesperado. "+e.getMessage();
	            }
	            finally {
	                fecharConexao();
	            }
	       
	            return msg;
	}
	 
	 
	
	@Override
	public List<Postagem> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Postagem pesquisar(Postagem dados) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String atualizar(Postagem dados) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String apagar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}