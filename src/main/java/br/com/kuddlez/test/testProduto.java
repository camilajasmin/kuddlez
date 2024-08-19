package br.com.kuddlez.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.kuddlez.dao.DaoProduto;
import br.com.kuddlez.dao.DaoUsuario;
import br.com.kuddlez.dominio.Produto;

public class testProduto {
	private DaoUsuario daousuario;
	private DaoProduto daouproduto;
	@Test
	public void testCadastrar() {
		Produto prod = new Produto();
		prod.setIdUsuario(1);
		prod.setNomeProd("Produto teste");
		prod.setPrecoProd(10.9);
		prod.setDescProd("Descrição");
		prod.setQtdProd(2);
		prod.setDataCadastroProd(new java.sql.Date(System.currentTimeMillis()));
		prod.setCategoriaProd("Categoria");
		prod.setPossiTrocaProd(true);
		
		DaoProduto daopr = new DaoProduto();
		assertEquals("Produto cadastrado", daopr.Cadastrar(prod));
	}
}
