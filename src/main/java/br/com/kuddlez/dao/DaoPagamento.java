package br.com.kuddlez.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.kuddlez.dominio.Pagamento;

public class DaoPagamento extends CONEXAO implements CRUDKuddlez<Pagamento> {

	@Override
	public String Cadastrar(Pagamento dados) {
		String msg = "";
		try {
			if(abrirConexao()) {
				String sql = "insert into pagamento(idVenda,dataHoraPag,formaPagamentoPag,parcelaPag,valorParcelasPag,statusPag)values(?,?,?,?,?,?)";
				pst = con.prepareStatement(sql);
				
				pst.setInt(1,dados.getIdVenda());
				pst.setDate(2,dados.getDataHoraPag());
				pst.setString(3,dados.getFormaPagamentoPag());
				pst.setInt(4,dados.getParcelaPag());
				pst.setDouble(5,dados.getValorParcelas());
				pst.setString(6,dados.getStatusPag());
				
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
					msg = "Erro ao tentar pagar"+se.getMessage();
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
	public List<Pagamento> listar() {
		List<Pagamento> lista = new ArrayList<Pagamento>(); 
		
			try {
				if(abrirConexao()) {
					String sql = "Select * from pagamento order by idPagamento desc";
					
					 pst = con.prepareStatement(sql);
			         rs = pst.executeQuery();
			            
					
					while(rs.next()) {
						Pagamento pag = new Pagamento();
						
						pag.setIdPagamento(rs.getInt(1));
						pag.setIdVenda(rs.getInt(2));
						pag.setDataHoraPag(rs.getDate(3));
						pag.setFormaPagamentoPag(rs.getString(4));
						pag.setParcelaPag(rs.getInt(5));
						pag.setValorParcelas(rs.getDouble(6));
						pag.setStatusPag(rs.getString(7));
						
						lista.add(pag);
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
	public Pagamento pesquisar(Pagamento dados) {
		Pagamento pag = new Pagamento();
		try {
			if(abrirConexao()) {
				String sql = "Select * from pagamento where idPagamento=? ";
				pst = con.prepareStatement(sql);
				
				pst.setInt(1,dados.getIdPagamento());
				
				rs = pst.executeQuery();
				
				if(rs.next()) {
					pag = new Pagamento();
					
					pag.setIdPagamento(rs.getInt(1));
					pag.setIdVenda(rs.getInt(2));
					pag.setDataHoraPag(rs.getDate(3));
					pag.setFormaPagamentoPag(rs.getString(4));
					pag.setParcelaPag(rs.getInt(5));
					pag.setValorParcelas(rs.getDouble(6));
					pag.setStatusPag(rs.getString(7));
				}
				 else {
			            System.out.println("Pagamento não encontrado para ID: " + dados.getIdPagamento());
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
			return pag;
	}

	@Override
	public String atualizar(Pagamento dados) {
		String msg = "";
		try {
			if(abrirConexao()) {
				String sql = "update pagamento set formaPagamentoPag=? where idPagamento=?";
				
				pst = con.prepareStatement(sql);
				pst.setString(1, dados.getFormaPagamentoPag());
				pst.setInt(2,dados.getIdPagamento());
				
				if(pst.executeUpdate()> 0) {
					msg = "Atualização feita";
				}
				else {
					msg = "Não foi possível atualização";
				}
			}
			else {
				msg = "Não foi possível estabelecer a conexão com o banco de dados";
			}
				
		}
			catch(SQLException se) {
				msg = "Erro na atualização. "+se.getMessage();
			}
			catch(Exception e){
				msg = "Erro inesperado. "+e.getMessage();
			}
			finally {
				fecharConexao();
			}
			
			return msg;
	}

	@Override
	public String apagar(Integer id) {
		return null;	
	}
}
