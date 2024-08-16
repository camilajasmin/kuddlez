package br.com.kuddlez.dao;

import java.sql.SQLException;
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
				)
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pagamento pesquisar(Pagamento dados) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String atualizar(Pagamento dados) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apagar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
