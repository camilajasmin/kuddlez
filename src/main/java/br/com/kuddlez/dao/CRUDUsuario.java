package br.com.kuddlez.dao;

public interface CRUDUsuario <T> extends CRUDKuddlez<T> {
	T login(T dados);
	String alterarsenha(T dados);
}
