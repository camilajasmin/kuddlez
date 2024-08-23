package br.com.kuddlez.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.kuddlez.dao.DaoServico;
import br.com.kuddlez.dao.DaoUsuario;
import br.com.kuddlez.dominio.Servico;

public class testServico {
//	@Test
//	public void testCadastroServico() {
//		DaoServico daoserv = new DaoServico();
//		Servico serv = new Servico();
//		serv.setIdUsuario(1);
//		serv.setFuncoesServ("tosa");
//		serv.setDescServ("Serviço a domicilio de tosa de caes de porte médio");
//		serv.setContatoServ("Entrar em contato via e-mail");
//		serv.setDispoServ("De segunda a quinta período da tarde. Entrar em contato");
//		serv.setValorServ("valores a ajustar dependendo da raça do cão");
//		serv.setQtdRealizadosServ(0);
//		assertEquals("Cadastro do serviço realizado", daoserv.Cadastrar(serv));
//	}
//
//	@Test	
//	public void testPesquisa () {
//		DaoServico daous = new DaoServico();
//		Servico serv = new Servico();
//		
//		serv.setFuncoesServ("tosa");
//		
//		assertEquals("tosa", daous.pesquisar(serv).getFuncoesServ());
//	}
//	}
	
	
	@Test public void testAtualizar() { 
	Usuario us= new Usuario();

 us.setIdUsuario(2); 
 us.setNomeCompleto("Yangchenyy");
 us.setLoginUsuario("avatarchenio@uol.com"); 
 us.setEmailUsuario("Yangchen Prata");
 us.setTelefoneUsuario("09-6958-7854");
 us.setEnderecoUsuario("Rua velha");


DaoUsuario daous = new DaoUsuario();

assertEquals("Atualização realizada", daous.atualizar(us)); 

}
}

//@Test
//public void testApagar(){
//	DaoUsuario daous = new DaoUsuario();
//	assertEquals("Usuario deletado",daous.apagar(2));
//	
//	}
//}

//@Test
//public void testalterarSenha() {
//	Usuario us = new Usuario();
//	us.setSenhaUsuario("12345789");
//	us.setIdUsuario(2);
//	DaoUsuario daous = new DaoUsuario();
//	assertEquals("Atualização realizada", daous.alterarsenha(us));
//}
	
