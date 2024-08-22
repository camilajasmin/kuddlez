package br.com.kuddlez.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.kuddlez.dao.DaoPagamento;
import br.com.kuddlez.dao.DaoVenda;
import br.com.kuddlez.dominio.Pagamento;
import br.com.kuddlez.dominio.Venda;

public class testPagamento {
//	@Test
//	public void testCadastrar() {
//		Pagamento pag = new Pagamento();
//		
//		pag.setIdVenda(1);
//		pag.setDataHoraPag(new java.sql.Date(System.currentTimeMillis()));
//		pag.setFormaPagamentoPag("Dinheiro");
//		pag.setParcelaPag(2);
//		pag.setValorParcelas(20.0);
//		pag.setStatusPag("Em andamento");
//		
//		DaoPagamento daopag = new DaoPagamento();
//		assertEquals("Pagamento realizado",daopag.Cadastrar(pag));
//	}
//	@Test
//	public void testListar() {
//		DaoPagamento daopag = new DaoPagamento();
//		List<Pagamento> resultado = new ArrayList<Pagamento>();
//		assertEquals(resultado, daopag.listar());
//	}
//	@Test
//	public void testPesquisa() {
//		DaoPagamento daopag = new DaoPagamento();
//		Pagamento pag = new Pagamento();
//		
//		pag.setIdPagamento(1);
//	
//		Pagamento resultado = daopag.pesquisar(pag);
//		assertNotNull("Pagamento não encontrado para ID:", resultado.getIdPagamento());
//	}
	@Test 
	public void testAatualizar() {
		Pagamento pag = new Pagamento();
		
		pag.setIdPagamento(1);
		pag.setFormaPagamentoPag("Cartão");
	
		DaoPagamento daopag = new DaoPagamento();
		assertEquals("Atualização feita", daopag.atualizar(pag));
	
	}
}
