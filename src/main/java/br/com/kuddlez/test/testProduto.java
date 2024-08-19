package br.com.kuddlez.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.kuddlez.dao.DaoProduto;
import br.com.kuddlez.dominio.Produto;

public class testProduto {

	@Test
	public void testCadastrar() {
		Produto prod = new Produto();
		prod.setIdUsuario(1);
		prod.setNomeProd("Produto para cavalos");
		prod.setPrecoProd(100.9);
		prod.setDescProd("Para pelos brilhosos e sedosos");
		prod.setQtdProd(2);
		prod.setDataCadastroProd(new java.sql.Date(System.currentTimeMillis()));
		prod.setCategoriaProd("Banho e tosa");
		prod.setPossiTrocaProd(true);
		
		DaoProduto daopr = new DaoProduto();
		assertEquals("Produto cadastrado", daopr.Cadastrar(prod));
	}
//}
//	@Test 
//	public void testListar(){
//		
//		DaoProduto daopr = new DaoProduto();
//		List<Produto> resultado = new ArrayList<Produto>();
//		assertEquals(resultado, daopr.listar());
//		
//	}
//	@Test
//	public void testPesquisa() {
//		DaoProduto daopro = new DaoProduto();
//		Produto prod = new Produto();
//		
//		prod.setIdProduto(1);
//		prod.setIdUsuario(1);
//		prod.setNomeProd("Produto teste");
//		Produto resultado = daopro.pesquisar(prod);
//		assertNotNull("Produto não encontrado", resultado);
//		assertEquals("Produto teste", resultado.getNomeProd());
//	}
//	@Test 
//	public void testAatualizar() {
//		Produto prod = new Produto();
//		
//		prod.setIdProduto(1);
//		prod.setNomeProd("Produto para pelo cachorro");
//		prod.setPrecoProd(19.9);
//		prod.setDescProd("Para pelos lindos e brilhosos");
//		prod.setQtdProd(5);
//		prod.setPossiTrocaProd(false);
//		
//		DaoProduto daopro = new DaoProduto();
//		assertEquals("Atualização dos produtos realizada", daopro.atualizar(prod));
//	
//	}
//	@Test
//	public void testApagar() {
//		DaoProduto daopr = new DaoProduto();
//		assertEquals("Produto apagado com sucesso",daopr.apagar(1));
//	}

}