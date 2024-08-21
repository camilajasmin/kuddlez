package br.com.kuddlez.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.kuddlez.dominio.Troca;

public class DaoTroca extends CONEXAO implements CRUDKuddlez<Troca>{

	@Override
	public String Cadastrar(Troca dados) {
		String msg = "";
		try {
			if (abrirConexao()) {
				String sql = "insert into troca(userOfertanteTroca, userReceptorTroca,prodOferecidoTroca, prodRecebidoTroca,statusTroca) values (?,?,?,?,?)";
				pst = con.prepareStatement(sql);
				
				pst.setInt(1, dados.getUserOfertanteTroca());
				pst.setInt(2, dados.getUserReceptorTroca());
				pst.setInt(3, dados.getProdOferecidoTroca());
				pst.setInt(4, dados.getProdReceberTroca());
				pst.setString(5, dados.getStatusTroca());
				
				if(pst.executeUpdate()>0) {
					msg = "Cadastro da troca realizada";
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
	public List<Troca> listar() {
		List<Troca> lista = new ArrayList<Troca>();
		try {
			if(abrirConexao()) {
				String sql = "select * from troca order by idTroca desc";
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				
				while(rs.next()) {
					Troca troca = new Troca();
					troca.setIdTroca(rs.getInt(1));
					troca.setUserOfertanteTroca(rs.getInt(2));
					troca.setUserReceptorTroca(rs.getInt(3));
					troca.setProdOferecidoTroca(rs.getInt(4));
					troca.setProdReceberTroca(rs.getInt(5));
					troca.setStatusTroca(rs.getString(6));
					
					lista.add(troca);
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
	public Troca pesquisar(Troca dados) {
    Troca troca= new Troca();
		
		try {
			if(abrirConexao()) {
				String sql = "Select * from troca where idTroca=?";
				pst = con.prepareStatement(sql);
				
				pst.setInt(1,dados.getIdTroca());
				
				rs = pst.executeQuery();
				
				if(rs.next()) {
					troca.setIdTroca(rs.getInt(1));
					troca.setUserOfertanteTroca(rs.getInt(2));
					troca.setUserReceptorTroca(rs.getInt(3));
					troca.setProdOferecidoTroca(rs.getInt(4));
					troca.setProdReceberTroca(rs.getInt(5));
					troca.setDatehoraTroca(rs.getDate(6));
					troca.setStatusTroca(rs.getString(7));
												
				}
				 else {
			            System.out.println("Procedimnto de troca não encontrado para ID: " + dados.getIdTroca());
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
		return troca;
		}

	@Override
	public String atualizar(Troca dados) {
		String msg = "";
		try {
			if(abrirConexao()) {
				String sql = "update troca set where idTroca=?";
				
				pst = con.prepareStatement(sql);
				
				pst.setString(1,dados.getStatusTroca());

				
				if(pst.executeUpdate() > 0) {
					msg = "Atualização do status da troca realizada";
				}
				else {
					msg = "Não foi possível atualizar";
				}
			}
				else {
					msg = "Não foi possível estabelecer conexão com o banco";
				}
			}
				catch(SQLException se) {
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
				String sql = "delete from troca where idTroca=?";
				pst = con.prepareStatement(sql);
				pst.setInt(1, id);
				
				if(pst.executeUpdate()>0) {
					msg = "Troca cancelada";
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
