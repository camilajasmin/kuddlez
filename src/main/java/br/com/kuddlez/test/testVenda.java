package br.com.kuddlez.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.kuddlez.dao.DaoVenda;
import br.com.kuddlez.dominio.Venda;

public class testVenda {
//	@Test
//	public void testCadastrar(){
//		Venda ven = new Venda();
//		
//		ven.setIdProduto(2);
//		ven.setVendedorVenda(4);
//		ven.setCompradorVenda(2);
//		ven.setDataHoraVenda(new java.sql.Date(System.currentTimeMillis()));
//		ven.setFormaPagamentoVenda("Dinheiro");
//		ven.setValorTotalVenda(100.0);
//		ven.setStatusVenda("Comprar");
//		
//		DaoVenda daoven = new DaoVenda();
//		assertEquals("Cadastro realizado",daoven.Cadastrar(ven));
//		
//	}
//	@Test
//	public void testListar(){
//		DaoVenda daoven = new DaoVenda();
//		List<Venda> resultado = new ArrayList<Venda>();
//		assertEquals(resultado, daoven.listar());	
//	}
//		@Test
//		public void testPesquisa() {
//			DaoVenda daoven = new DaoVenda();
//			Venda ven = new Venda();
//			
//			ven.setIdVenda(1);
//			Venda resultado = daoven.pesquisar(ven);
//			assertNotNull("Venda não encontrado para ID:", resultado.getIdVenda());
//			
//		}

	@Test 
	public void testAatualizar() {
		Venda ven = new Venda();
		
		ven.setIdVenda(1);
		ven.setStatusVenda("Em fase de pagamento");
	
		
		DaoVenda daoven = new DaoVenda();
		assertEquals("Atualização realizada", daoven.atualizar(ven));
	
	}

//	@Test 
//	public void testAatualizar() {
//		Venda ven = new Venda();
//		
//		ven.setIdVenda(1);
//		ven.setStatusVenda("Em fase de pagamento");
//	
//		
//		DaoVenda daoven = new DaoVenda();
//		assertEquals("Atualização realizada", daoven.atualizar(ven));
//	
//	}

}
