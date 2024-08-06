package br.com.kuddlez.dao;

import java.util.List;

public interface CRUDKuddlez <T> {
	String Cadastrar (T dados);
	List<T> listar();
	T pesquisar (T dados);
	String atualizar (T dados);
	String apagar(Integer id);
}
