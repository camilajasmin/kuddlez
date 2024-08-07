package br.com.kuddlez.dao;

import java.sql.SQLException;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario pesquisar(Usuario dados) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String atualizar(Usuario dados) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String apagar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(Usuario dados) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String alterarsenha(Usuario dados) {
		// TODO Auto-generated method stub
		return null;
	}
	
}