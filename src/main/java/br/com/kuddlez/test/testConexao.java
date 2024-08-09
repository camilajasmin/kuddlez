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
//		us.setLoginUsuario("cami.je");
//		us.setSenhaUsuario("1234");
//		us.setEmailUsuario("camila@gmail.com");
//		us.setTelefoneUsuario("11982108234");
//		us.setEnderecoUsuario("rua sei lá");
//		us.setCpfUsuario("23456723400");
//		us.setCnpjUsuario("n tenho");
//	//	us.setDataNascimentoUsuario(Date.valueOf("2005-05-25"));
//		us.setDataNascimentoUsuario("2005-05-25");
//		
//		
//		DaoUsuario daous = new DaoUsuario();
//		assertEquals("Cadastro realizado", daous.Cadastrar(us));
//	}
//}
	
//	@Test
//	public void testListar() {
//		DaoUsuario daous = new DaoUsuario();
//		List<Usuario> resultado = new ArrayList<Usuario>();
//	    assertEquals(resultado, daous.listar());
//	}
//}
//	
	
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
	
	@Test
	public void testalterarSenha() {
		Usuario us = new Usuario();
		us.setSenhaUsuario("12345789");
		us.setIdUsuario(2);
		DaoUsuario daous = new DaoUsuario();
		assertEquals("Atualização realizada", daous.alterarsenha(us));
	}
}

	

	

