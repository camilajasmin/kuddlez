package br.com.kuddlez.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.kuddlez.dominio.Produto;

public class DaoProduto extends CONEXAO implements CRUDKuddlez<Produto> {

	@Override
	public String Cadastrar(Produto dados) {
		String msg = "";
		try {
			if(abrirConexao()) {
				String sql = "insert into produtos(idUsuario,nomeProd,precoProd,descProd,qtdProd,dataCadastroProd,categoriaProd,possiTrocaProd)values(?,?,?,?,?,?,?)";
				pst = con.prepareStatement(sql);
				
				pst.setInt(1,dados.getIdUsuario());
				pst.setString(2,dados.getNomeProd());
				pst.setDouble(3,dados.getPrecoProd());
				pst.setString(4,dados.getDescProd());
				pst.setInt(5,dados.getQtdProd());
				pst.setDate(6,dados.getDataCadastroProd());
				pst.setString(7,dados.getCategoriaProd());
				pst.setBoolean(8,dados.getPossiTrocaProd());
				
				if(pst.executeUpdate() > 0) {
					msg = "Produto cadastrado";
				}
				else {
					msg = "Não foi possível cadastrar o produto";
				}
			}
				else {
					msg = "Não foi possível estabelecer uma conexão com o bando de dados";
				}
			}
				catch(SQLException se) {
					msg = "Erroa ao tentar cadastrar"+se.getMessage();
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
	public List<Produto> listar() {
		List<Produto> lista = new ArrayList<Produto>();
		try {
			if(abrirConexao()) {
				String sql = "Select * from produtos order by idProduto desc";
				pst = con.prepareStatement(sql);
				rs = pst.executeQuery();
				while(rs.next()) {
					Produto prod = new Produto();
					prod.setIdProduto(rs.getInt(1));
					prod.setIdUsuario(rs.getInt(2));
					prod.setNomeProd(rs.getString(3));
					prod.setPrecoProd(rs.getDouble(4));
					prod.setDescProd(rs.getString(5));
					prod.setQtdProd(rs.getInt(6));
					prod.setDataCadastroProd(rs.getDate(7));
					prod.setCategoriaProd(rs.getString(8));
					prod.setPossiTrocaProd(rs.getBoolean(9));
					
					lista.add(prod);
				}
			}
				else {
					new Exception("Não foi possível estabelecer a conexão com o banco de dados");
				}
			}
				catch(SQLException se) {
					new Exception("Erro ao listar produtos"+se.getMessage());
				}
				catch(Exception e) {
					new Exception("Erro inesperado"+e.getMessage());
				}
				finally {
					fecharConexao();
				}
				return lista;
	}

	@Override
	public Produto pesquisar(Produto dados) {
		Produto prod = null;
		try {
			if(abrirConexao()) {
				String sql = "Select * from produtos where idProduto=? or idUsuario=? or nomeProduto=? ";
				pst = con.prepareStatement(sql);
				
				pst.setInt(1,dados.getIdProduto());
				pst.setInt(2,dados.getIdUsuario());
				pst.setString(3,dados.getNomeProd());
				
				rs = pst.executeQuery();
				
				if(rs.next()) {
					prod = new Produto();
					prod.setIdProduto(rs.getInt(1));
					prod.setIdUsuario(rs.getInt(2));
					prod.setNomeProd(rs.getString(3));
					prod.setPrecoProd(rs.getDouble(4));
					prod.setDescProd(rs.getString(5));
					prod.setQtdProd(rs.getInt(6));
					prod.setDataCadastroProd(rs.getDate(7));
					prod.setCategoriaProd(rs.getString(8));
					prod.setPossiTrocaProd(rs.getBoolean(9));
					
				}
			}
				else {
					new Exception("Não foi possível estabelecer a conexão com o banco de dados");
				}
			}
			catch(SQLException se) {
				new Exception("Erro inesperado."+se.getMessage());
			}
			catch(Exception e) {
				new Exception("Erro inesperado"+e.getMessage());
			}
			finally {
				fecharConexao();
			}
			return prod;
	}

	@Override
	public String atualizar(Produto dados) {
		String msg = "";
		try {
			if(abrirConexao()) {
				String sql = "update produtos set nomeProd=?,precoProd=?,descProd=?,qtdProd=?,possiTrocaProd=? where idProduto=?";
				
				pst = con.prepareStatement(sql);
				
				pst.setString(1,dados.getNomeProd());
				pst.setDouble(2,dados.getPrecoProd());
				pst.setString(3,dados.getDescProd());
				pst.setInt(4,dados.getQtdProd());
				pst.setBoolean(5,dados.getPossiTrocaProd());
				pst.setInt(6,dados.getIdProduto());
				
				if(pst.executeUpdate() > 0) {
					msg = "Atualização dos produtos realizada";
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
				String sql = "delete from produtos where idProduto=?";
				
				pst = con.prepareStatement(sql);
				
				pst.setInt(1,id);
				
				if(pst.executeUpdate() > 0) {
					msg = "Produto apagado com sucesso";
				}
			else {
					msg = "Não foi possível apagar o produto"; 
			}
		}
			else {
					msg = "Não foi possível estabelecer com o banco";
				}
			}
				catch(SQLException se) {
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
