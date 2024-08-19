package br.com.kuddlez.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.kuddlez.dominio.Usuario;
import br.com.kuddlez.dominio.Venda;

public class DaoVenda extends CONEXAO implements CRUDKuddlez<Venda> {

	@Override
	public String Cadastrar(Venda dados) {
		String msg = "";
		try {
			if(abrirConexao()) {
				String sql = "insert into venda(idProduto, vendedorVenda,compradorVenda,formaPagamentoVenda,valorTotalVenda,statusVenda) values (?,?,?,?,?,?)";
				
				pst = con.prepareStatement(sql);
				
				pst.setInt(1,dados.getIdProduto());
				pst.setInt(2,dados.getVendedorVenda());
				pst.setInt(3,dados.getCompradorVenda());
				pst.setString(4,dados.getFormaPagamentoVenda());
				pst.setDouble(5, dados.getValorTotalVenda());
				pst.setString(6,dados.getStatusVenda());
				
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
	public List<Venda> listar() {
		List<Venda> lista = new ArrayList<Venda>();
		try {
			if(abrirConexao()) {
				String sql = "select * from venda";
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				
				while(rs.next()) {
					Venda venda = new Venda();
					venda.setIdVenda(rs.getInt(1));
					venda.setIdProduto(rs.getInt(2));
					venda.setVendedorVenda(rs.getInt(3));
					venda.setCompradorVenda(rs.getInt(4));
					venda.setDataHoraVenda(rs.getDate(5));
					venda.setFormaPagamentoVenda(rs.getString(6));
					venda.setValorTotalVenda(rs.getDouble(7));
					venda.setStatusVenda(rs.getString(8));
					
					lista.add(venda);
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
	public Venda pesquisar(Venda dados) {
     Venda venda = new Venda();
		
		try {
			if(abrirConexao()) {
				String sql = "Select * from venda where idVenda=?";
				pst = con.prepareStatement(sql);
				
				pst.setInt(1,dados.getIdVenda());
				
				rs = pst.executeQuery();
				
				if(rs.next()) {
					venda.setIdVenda(rs.getInt(1));
					venda.setIdProduto(rs.getInt(2));
					venda.setVendedorVenda(rs.getInt(3));
					venda.setCompradorVenda(rs.getInt(4));
					venda.setDataHoraVenda(rs.getDate(5));
					venda.setFormaPagamentoVenda(rs.getString(6));
					venda.setValorTotalVenda(rs.getDouble(7));
					venda.setStatusVenda(rs.getString(8));
				}
				 else {
			            System.out.println("Venda não encontrado para ID: " + dados.getIdVenda());
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
		return venda;
	}

	@Override
	public String atualizar(Venda dados) {
String msg = "";
		
		try {
			if(abrirConexao()) {
				String sql = "Update venda set statusVenda where idVenda=?";
				pst = con.prepareStatement(sql);
				
				pst.setString(1,dados.getStatusVenda());
				pst.setInt(6,dados.getIdVenda());
				
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
		return null;
	}
	}
