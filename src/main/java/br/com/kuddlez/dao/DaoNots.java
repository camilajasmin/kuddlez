package br.com.kuddlez.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.kuddlez.dominio.Notificacao;

public class DaoNots extends CONEXAO implements CRUDKuddlez<Notificacao> {

	@Override
	public String Cadastrar(Notificacao dados) {
		String msg = "";
		try {
			if(abrirConexao()){
				String sql = "insert into notificacoes (idUsuario,dataHoraNot,tipoNot,lidaNot,conteudoNot)values(?,?,?,?,?)";
				pst = con.prepareStatement(sql);
				
				pst.setInt(1,dados.getIdUsuario());
				pst.setDate(2,dados.getDataHoraNot());
				pst.setString(3,dados.getTipoNot());
				pst.setBoolean(4,dados.getLidaNot());
				pst.setString(5,dados.getConteudoNot());
				
				if(pst.executeUpdate() > 0) {
					msg = "Pagamento realizado";
				}
				else {
					msg = "Não foi possível realizar o pagamento";
				}
			}
			else {
				msg = "Não foi possível estabelecer uma conexão com o bando de dados";
			}
		}
				catch(SQLException se) {
					msg = "Erro ao tentar notificar"+se.getMessage();
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
	public List<Notificacao> listar() {
		List<Notificacao> lista = new ArrayList<Notificacao>();
			try {
				if(abrirConexao()) {
					String sql = "select * from notificacoes order by idNotificacoes desc";
					
					pst = con.prepareStatement(sql);
					rs = pst.executeQuery();
					
					while(rs.next()) {
						Notificacao not = new Notificacao();
						
						not.setIdNotificacoes(rs.getInt(1));
						not.setIdUsuario(rs.getInt(2));
						not.setDataHoraNot(rs.getDate(3));
						not.setTipoNot(rs.getString(4));
						not.setLidaNot(rs.getBoolean(5));
						not.setConteudoNot(rs.getString(6));
						
						lista.add(not);
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
				return lista;
		}

	@Override
	public Notificacao pesquisar(Notificacao dados) {
		Notificacao not = null;
		try {
			if(abrirConexao()) {
				String sql = "Select * from notificacoes where idNotificacoes=? or idUsuario=?";
				pst = con.prepareStatement(sql);
				
				pst.setInt(1,dados.getIdNotificacoes());
				pst.setInt(2,dados.getIdUsuario());
				
				rs = pst.executeQuery();
				
				if(rs.next()) {
					not = new Notificacao();
					
					not.setIdNotificacoes(rs.getInt(1));
					not.setIdUsuario(rs.getInt(2));
					not.setDataHoraNot(rs.getDate(3));
					not.setTipoNot(rs.getString(4));
					not.setLidaNot(rs.getBoolean(5));
					not.setConteudoNot(rs.getString(6));
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
				return not;
		
	}

	@Override
	public String atualizar(Notificacao dados) {
	
		return null;
	}

	@Override
	public String apagar(Integer id) {
		String msg = "";
		try {
			if(abrirConexao()) {
				String sql = "delete from notificacoes where idNotificacoes";
				
				pst = con.prepareStatement(sql);
				
				pst.setInt(1, id);
				
				if(pst.executeUpdate()> 0) {
					msg = "Pagamento apagado";
				}
				else {
					msg = "Não foi possível apagar";
				}
			}
				else {
					msg = "Não foi possível estabelecer a conexão com o banco de dados";
				}
					
			}
				catch(SQLException se) {
					msg = "Erro ao apagar. "+se.getMessage();
				}
				catch(Exception e){
					msg = "Erro inesperado. "+e.getMessage();
				}
				finally {
					fecharConexao();
				}
				
				return msg;

		}
	}