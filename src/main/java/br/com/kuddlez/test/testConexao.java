
package br.com.kuddlez.test;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.kuddlez.dao.DaoUsuario;
import br.com.kuddlez.dominio.Usuario;

public class testConexao {
	
//	@Test
//	public void testCadastroUsuario() {
//		Usuario us = new Usuario();
//		us.setNomeCompleto("camila");
//		us.setLoginUsuario("camila.jechauca");
//		us.setSenhaUsuario("56789");
//		us.setEmailUsuario("camilajasmin@gmail.com");
//		us.setTelefoneUsuario("11978108234");
//		us.setEnderecoUsuario("tatuapé");
//		us.setCpfUsuario("56491908879");
//		us.setCnpjUsuario("");
//	//	us.setDataNascimentoUsuario(Date.valueOf("2005-05-25"));
//		us.setDataNascimentoUsuario("2005-05-15");
//		
//		
//		DaoUsuario daous = new DaoUsuario();
//		assertEquals("Cadastro realizado", daous.Cadastrar(us));
//	}

	
	@Test
	public void testListar() {
		DaoUsuario daous = new DaoUsuario();
		List<Usuario> resultado = new ArrayList<Usuario>();
	    assertEquals("avatarchen@uol.com", daous.listar().get(0).getLoginUsuario());
	}
}
	
	
//@Test	
//public void testPesquisa () {
//	DaoUsuario daous = new DaoUsuario();
//	Usuario idUsuario = new Usuario();
//	
//	idUsuario.setIdUsuario(1);
//	
//	assertEquals("user", daous.pesquisar(idUsuario).getNomeCompleto());
//}
//}
	
//	@Test public void testAtualizar() { 
//		Usuario us= new Usuario();
//
//	us.setIdUsuario(1); 
//	us.setNomeCompleto("Yangchen");
//	us.setLoginUsuario("avatarchen@uol.com"); 
//	us.setEmailUsuario("Yangchen Ouro");
//	us.setTelefoneUsuario("88-6958-7854");
//	us.setEnderecoUsuario("Rua nova");
//	
//	
//	DaoUsuario daous = new DaoUsuario();
//	
//	assertEquals("Atualização realizada", daous.atualizar(us)); 
//	
//}
//}
	
//	@Test
//	public void testApagar(){
//		DaoUsuario daous = new DaoUsuario();
//		Usuario us = new Usuario();
//		
//		}
//	}
	
//	@Test
//	public void testalterarSenha() {
//		Usuario us = new Usuario();
//		us.setSenhaUsuario("12345789");
//		us.setIdUsuario(2);
//		DaoUsuario daous = new DaoUsuario();
//		assertEquals("Atualização realizada", daous.alterarsenha(us));
//	}


