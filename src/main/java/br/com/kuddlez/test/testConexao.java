package br.com.kuddlez.test;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.Test;

import br.com.kuddlez.dao.DaoUsuario;
import br.com.kuddlez.dominio.Usuario;

public class testConexao {
	
	@Test
	public void testCadastroUsuario() {
		Usuario us = new Usuario();
		us.setNomeCompleto("user");
		us.setLoginUsuario("user1");
		us.setSenhaUsuario("123");
		us.setEmailUsuario("user@gmail.com");
		us.setTelefoneUsuario("5956654656");
		us.setEnderecoUsuario("rua usuario do fulano");
		us.setCpfUsuario("445645456");
		us.setCnpjUsuario("null");
//		us.setDataNascimentoUsuario(Date.valueOf("2005-05-25"));
		us.setDataNascimentoUsuario("2005-05-25");
		
		
		DaoUsuario daous = new DaoUsuario();
		assertEquals("Cadastro realizado", daous.Cadastrar(us));
	}
}
