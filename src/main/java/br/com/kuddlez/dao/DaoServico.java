package br.com.kuddlez.dao;

import java.util.List;

import br.com.kuddlez.dominio.Servico;

public class DaoServico extends CONEXAO implements CRUDKuddlez<Servico> {

	@Override
	public String Cadastrar(Servico dados) {
		String msg = "";
		try {
			if (abrirConexao()) {
				String sql = "insert into servico(idUsuario, nomeProd, precoProd";
				
			} 
			else {

			}
			
		} 
		finally {
			
		}
		return msg;
	}

	@Override
	public List<Servico> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Servico pesquisar(Servico dados) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String atualizar(Servico dados) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apagar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
