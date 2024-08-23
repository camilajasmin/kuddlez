package br.com.kuddlez.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.kuddlez.dao.DaoVenda;
import br.com.kuddlez.dominio.Venda;

public class testVenda {
	@Test
	public void testCadastrar(){
		Venda ven = new Venda();
		
		ven.setIdProduto(2);
		ven.setVendedorVenda(4);
		ven.setCompradorVenda(2);
		ven.setDataHoraVenda(new java.sql.Date(System.currentTimeMillis()));
		ven.setFormaPagamentoVenda("Dinheiro");
		ven.setValorTotalVenda(100.0);
		ven.setStatusVenda("Comprar");
		
		DaoVenda daoven = new DaoVenda();
		assertEquals("Cadastro realizado",daoven.Cadastrar(ven));
		
	}
	

}
