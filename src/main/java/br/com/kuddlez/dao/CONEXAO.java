package br.com.kuddlez.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class CONEXAO {
	protected Connection con = null;
	protected PreparedStatement pst = null;
	protected ResultSet rs = null;
	
	public boolean abrirConexao() {
		boolean abrir =true;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:8082/kuddlezdb" , "root", "1234.abcd");
		}
	    catch(ClassNotFoundException | IllegalAccessException | InstantiationException e) {
	        abrir = false;
	        e.printStackTrace();
	    }	
		catch(SQLException se) {
			abrir = false;
			se.printStackTrace();
		}
		catch(Exception ex){
			abrir = false;
			System.out.println("Erro inesperado");
		}
		return abrir;
	}
	
	public boolean fecharConexao() {
		boolean fechar = true;
		
		try {
			con.close();
		}
		catch(SQLException se) {
			fechar = false;
			se.printStackTrace();
		}
		catch(Exception e) {
			fechar = false;
		}
		return fechar;
	}
}
