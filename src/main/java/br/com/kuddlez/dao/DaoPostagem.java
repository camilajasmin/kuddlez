package br.com.kuddlez.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.kuddlez.dominio.Postagem;

public class DaoPostagem extends CONEXAO implements CRUDKuddlez<Postagem>{

	@Override
	public String Cadastrar(Postagem dados) {
		  String msg = "";
	        try{
	            if(abrirConexao()){
	                    String sql = "insert into postagem(idUsuario,dataHoraPost,txtPost,imgPost,videoPost,qtdLikePost,qtdSalvosPost,qtdComentPost,ifComentarioPost)values(?,?,?,?,?,?,?,?)";
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
		  List<Postagem> lista = new ArrayList<Postagem>();
		    try {
		        if (abrirConexao()) {
		            String sql = "Select * from postagem order by idPostagem desc";
		            pst = con.prepareStatement(sql);
		            rs = pst.executeQuery();
		            while (rs.next()) {
		                Postagem post = new Postagem();
		                post.setIdUsuario(rs.getInt(1));
		                post.setIdPostagem(rs.getInt(2));
		                post.setDataHoraPost(rs.getDate(3));
		                post.setTxtPost(rs.getString(4));
		                post.setImgPost(rs.getBytes(5));;
		                post.setVideoPost(rs.getString(6));
		                post.setQtdLikePost(rs.getString(7));
		                post.setQtdSalvosPost(rs.getString(8));
		                post.setQtdComentsPost(rs.getString(9));
		                post.setIfComentarioPost(rs.getBoolean(10));
		               
		                lista.add(post);
		 
		            }
		        }
		        
		        else{
		            new Exception ("Não foi possível estabelecer conexão com o banco");
		 
		        }
		    }
		    catch(SQLException se) {
		        new Exception("Erro inesperado"+se.getMessage());
		    }
		    catch(Exception e) {
		        new Exception("Erro inesperado"+e.getMessage());
		    }
		    finally{
		        fecharConexao();
		    }
		   return lista;
		}
	
	
	@Override
	public Postagem pesquisar(Postagem dados) {
		Postagem post = null;
	    try {
	        if(abrirConexao()){
	            String sql = "Select * from postagem where idPostagem=? or txtPost=?";
	            pst = con.prepareStatement(sql);
	 
	            pst.setInt(1, dados.getIdPostagem());
	            pst.setString(2, dados.getTxtPost());
	             
	            rs = pst.executeQuery();
	 
	            if(rs.next()) {
	                post = new Postagem();
	                post.setIdPostagem(rs.getInt(1));
	                post.setIdUsuario(rs.getInt(2));
	                post.setDataHoraPost(rs.getDate(3));
	                post.setTxtPost(rs.getString(4));
	                post.setImgPost(rs.getBytes(5));
	                post.setVideoPost(rs.getString(6));
	                post.setQtdLikePost(rs.getString(7));
	                post.setQtdSalvosPost(rs.getString(7));
	                post.setQtdComentsPost(rs.getString(8));
	                post.setIfComentarioPost(rs.getBoolean(10));
	            }
	        }
	        else {
	            new Exception ("Não foi possível estabelecer a conexão com o banco");
	        }
	    }
	 
	    catch(SQLException se) {
	        new Exception("Erro inesperado. "+se.getMessage());
	    }
	    catch(Exception e) {
	        new Exception("Erro inesperado. "+e.getMessage());
	    }
	    finally {
	        fecharConexao();
	    }
	    return post;
	}
	
	@Override
	public String atualizar(Postagem dados) {
		String msg = "";
	    try{
	        if(abrirConexao()) {
	            String sql = "update postagem set txtPost=? where idPostagem=?";
	            
	            pst = con.prepareStatement(sql);
	            
	            pst.setString(1,dados.getTxtPost());
	            
	            if(pst.executeUpdate() > 0) {
	            	msg = "Edição realizada";
	            }
	            else {
	            	msg = "Não foi possível editar";
	            }
	        }
	        else {
				msg= "Não foi possível estabelecer conexão com o banco";
			 }
	    }
	    catch(SQLException se){
			msg = "Erro ao tentar atualizar"+se.getMessage();
	    }
		catch(Exception e) {
			msg = "Erro inesperado"+e.getMessage();
		
	}
		finally {
			fecharConexao();
	}
	return msg;

}
	
	@Override
	public String apagar(Integer id) {
		String msg = "";
		try {
			if(abrirConexao()) {
				String sql = "delete from postagem where idPostagem=?";
				
				pst= con.prepareStatement(sql);
		
				pst.setInt(1,id);
				
				
				if(pst.executeUpdate() > 0) {
					msg = "Apagado com sucesso!";
				}
				else {
					msg = "Não foi possível apagar";
				}
				
			}
			else {
				msg= "Não foi possível estabelecer conexão com o banco";
			}
			
			}
			catch(SQLException se){
				msg = "Erro ao tentar apagar"+se.getMessage();
		}
			catch(Exception e) {
				msg = "Erro inesperado"+e.getMessage();
			
		}
			finally {
				fecharConexao();
		}
		return msg;
	}
}