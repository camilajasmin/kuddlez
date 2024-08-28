package br.com.kuddlez.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.kuddlez.dominio.ServicoUsuario;

public class DaoServico extends CONEXAO implements CRUDKuddlez<ServicoUsuario> {

	@Override
	public String Cadastrar(ServicoUsuario dados) {
		String msg = "";
		try {
			if (abrirConexao()) {
				String sql = "insert into servico(idUsuario, funcoesServ, descServ,contatoServ,dispoServ,valorServ,qtdRealizadosServ) values (?,?,?,?,?,?,?)";
				pst = con.prepareStatement(sql);
				
				pst.setInt(1, dados.getIdUsuario());
				pst.setString(2, dados.getFuncoesServ());
				pst.setString(3, dados.getDescServ());
				pst.setString(4, dados.getContatoServ());
				pst.setString(5, dados.getDispoServ());
				pst.setString(6, dados.getValorServ());
				pst.setInt(7, dados.getQtdRealizadosServ());
				
				if(pst.executeUpdate()>0) {
					msg = "Cadastro do serviço realizado";
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
	public List<ServicoUsuario> listar() {
		
		List<ServicoUsuario> lista = new ArrayList<ServicoUsuario>();
		try {
			if(abrirConexao()) {
				String sql = "select u.nomeCompleto, s.funcoesServ,s.descServ, s.contatoServ, s.dispoServ, s.valorServ from usuario u inner join servico s on u.idusuario = s.idusuario";
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				
				while(rs.next()) {
					ServicoUsuario serv = new ServicoUsuario();
					serv.setNomeCompleto(rs.getString(1));
					serv.setFuncoesServ(rs.getString(2));
					serv.setDescServ(rs.getString(3));
					serv.setContatoServ(rs.getString(4));
					serv.setDispoServ(rs.getString(5));
					serv.setValorServ(rs.getString(6));

					
					lista.add(serv);
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
	public ServicoUsuario pesquisar(ServicoUsuario dados) {
    ServicoUsuario serv = new ServicoUsuario();
  
		try {
			if(abrirConexao()) {
				String sql = "Select * from servico where idUsuario=?";
				pst = con.prepareStatement(sql);
				
				pst.setInt(1,dados.getIdUsuario());
				
				rs = pst.executeQuery();
				
				if(rs.next()) {
					serv.setIdServico(rs.getInt(1));
					serv.setIdUsuario(rs.getInt(2));
					serv.setFuncoesServ(rs.getString(3));
					serv.setDescServ(rs.getString(4));
					serv.setContatoServ(rs.getString(5));
					serv.setDispoServ(rs.getString(6));
					serv.setValorServ(rs.getString(7));
					serv.setQtdRealizadosServ(rs.getInt(8));
				}
				 else {
			            System.out.println("Serviço não encontrado para esta função: " + dados.getFuncoesServ());
			        }
				
			}
			
			else {
				throw new Exception("Não foi possível estabelecer a conexão com o banco");
				}
			}
		
			catch(SQLException se) {
				new Exception("Erro na consulta de servico"+se.getMessage());
			}
			catch(Exception e) {
				new Exception("Erro inesperado"+e.getMessage());
			}
			finally {
				fecharConexao();
			}		
		return serv;
		}

	@Override
	public String atualizar(ServicoUsuario dados) {
     String msg = "";
		
		try {
			if(abrirConexao()) {
				String sql = "Update usuario set funcoesServe=?, descServ=?, contatoServ=?, dispoServ=?, valorServ=? where idServico=?";
				pst = con.prepareStatement(sql);
				
				pst.setString(1,dados.getFuncoesServ());
				pst.setString(2,dados.getDescServ());
				pst.setString(3, dados.getContatoServ());
				pst.setString(4,dados.getDispoServ());
				pst.setString(5,dados.getValorServ());
				pst.setInt(6,dados.getIdServico());
				
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
				String sql = "delete from servico where idServico=?";
				pst = con.prepareStatement(sql);
				pst.setInt(1, id);
				
				if(pst.executeUpdate()>0) {
					msg = "Servico deletado";
				}
				else {
					msg = "Não foi possível deletar este serviço";
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


}
