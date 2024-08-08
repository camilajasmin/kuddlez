package br.com.kuddlez.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.kuddlez.dominio.Usuario;

public class DaoUsuario extends CONEXAO implements CRUDUsuario<Usuario>{

	@Override
	public String Cadastrar(Usuario dados) {
		String msg = "";
		try {
			if(abrirConexao()) {
				String sql = "insert into usuario(nomeCompleto,loginUsuario,senhaUsuario,emailUsuario,telefoneUsuario,enderecoUsuario,cpfUsuario,cnpjUsuario,dataNascimentoUsuario) values (?,?,?,?,?,?,?,?,?)";
				pst = con.prepareStatement(sql);
				
				pst.setString(1,dados.getNomeCompleto());
				pst.setString(2,dados.getLoginUsuario());
				pst.setString(3,dados.getSenhaUsuario());
				pst.setString(4,dados.getEmailUsuario());
				pst.setString(5,dados.getTelefoneUsuario());
				pst.setString(6, dados.getEnderecoUsuario());
				pst.setString(7,dados.getCpfUsuario());
				pst.setString(8,dados.getCnpjUsuario());
				pst.setString(9,dados.getDataNascimentoUsuario());
				
				if(pst.executeUpdate()>0) {
					msg = "Cadastro realizado";
				}
				else {
					msg = "Não foi possível estabelecer uma conexão com o banco de dados";
				}
				
			}
			else {
				msg = "Não foi possível estabelecer a conexão com o banco de dados";
			}
		}
			catch(SQLException se) {
				msg = "Erro no cadastro."+se.getMessage();
			}
			catch(Exception e) {
				msg = "Erro inesperado."+e.getMessage();
			}
			finally {
				fecharConexao();
			
		}
		return msg;
	}

	@Override
	public List<Usuario> listar() {
		List<Usuario> lista = new ArrayList<Usuario>();
		try {
			if(abrirConexao()) {
				String sql = "select * from usuario";
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				
				while(rs.next()) {
					Usuario us = new Usuario();
					us.setIdUsuario(rs.getInt(1));
					us.setNomeCompleto(rs.getString(2));
					us.setLoginUsuario(rs.getString(3));
					us.setSenhaUsuario(rs.getString(4));
					us.setEmailUsuario(rs.getString(5));
					us.setTelefoneUsuario(rs.getString(6));
					us.setEnderecoUsuario(rs.getString(7));
					us.setCpfUsuario(rs.getString(8));
					us.setCnpjUsuario(rs.getString(9));
					us.setDataNascimentoUsuario(rs.getString(10));
					us.setCriadoem(rs.getDate(11));
					
					lista.add(us);
				}
			}
			
			else {
				throw new Exception("Não foi possível estabelecer a conexão com o banco");
			}
		}
		catch (SQLException se) {
			new Exception("Erro na consulta da lista"+se.getMessage());
		}
		catch (Exception e) {
			new Exception("Erro inesperado"+e.getMessage());
		}
		finally {
			fecharConexao();
		}
		
		return lista;
	}

	
	@Override
	public Usuario pesquisar(Usuario dados) {
		Usuario us = new Usuario();
		
		try {
			if(abrirConexao()) {
				String sql = "Select * from usuario where idUsuario=?";
				pst = con.prepareStatement(sql);
				
				pst.setInt(1,dados.getIdUsuario());
				
				rs = pst.executeQuery();
				
				if(rs.next()) {
					us.setIdUsuario(rs.getInt(1));
					us.setNomeCompleto(rs.getString(2));
					us.setLoginUsuario(rs.getString(3));
					us.setSenhaUsuario(rs.getString(4));
					us.setEmailUsuario(rs.getString(5));
					us.setTelefoneUsuario(rs.getString(6));
					us.setEnderecoUsuario(rs.getString(7));
					us.setCpfUsuario(rs.getString(8));
					us.setCnpjUsuario(rs.getString(9));
					us.setDataNascimentoUsuario(rs.getString(10));
					us.setCriadoem(rs.getDate(11));
				}
				
			}
			
			else {
				throw new Exception("Não foi possível estabelecer a conexão com o banco");
				}
			}
		
			catch(SQLException se) {
				new Exception("Erro na pesquisa"+se.getMessage());
			}
			catch(Exception e) {
				new Exception("Erro inesperado"+e.getMessage());
			}
			finally {
				fecharConexao();
			}		
		return us;
		}

	@Override
	public String atualizar(Usuario dados) {
		String msg = "";
		
		try {
			if(abrirConexao()) {
				String sql = "Update usuario set nomeCompleto=?,loginUsuario=?,emailUsuario=?,telefoneUsuario=?,enderecoUsuario=? where idUsuario=?";
				pst = con.prepareStatement(sql);
				
				pst.setString(1,dados.getNomeCompleto());
				pst.setString(2,dados.getLoginUsuario());
				pst.setString(3, dados.getEmailUsuario());
				pst.setString(4,dados.getTelefoneUsuario());
				pst.setString(5,dados.getEnderecoUsuario());
				pst.setInt(6,dados.getIdUsuario());
				
				if(pst.executeUpdate()>0) {
					msg = "Atualização realizada";
				}
				else {
					msg = "Não foi possível atualizar";
				}
			}
			else {
				msg = "Não foi possível estabelecer a conexão com o banco de dados";
			}
			
		}
		catch(SQLException se) {
			msg = "Erro na atualização."+se.getMessage();
		}
		catch(Exception e) {
			msg = "Erro inesperado" +e.getMessage();
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
				String sql = "delete from usuario where idUsuario=?";
				pst = con.prepareStatement(sql);
				pst.setInt(1, id);
				
				if(pst.executeUpdate()>0) {
					msg = "Usuario deletado";
				}
				else {
					msg = "Não foi possível apagar o usuário";
				}
			}
			else {
				msg = "Não foi possível estabelecer a conexão com o banco";
			}
		}
		
		catch(SQLException se){
			msg = "Erro ao apagar" + se.getMessage();
		}
		catch(Exception e) {
			msg = "Erro inesperado" + e.getMessage();
		}
		finally {
			fecharConexao();
		}
		return msg;
	}

	@Override
	public boolean login(Usuario dados) {
		boolean auth = true;
		try {
			if(abrirConexao()) {
				String sql = "select loginUsuario, "
			}
		}
		return false;
	}

	@Override
	public String alterarsenha(Usuario dados) {
		
		return null;
	}
	
}