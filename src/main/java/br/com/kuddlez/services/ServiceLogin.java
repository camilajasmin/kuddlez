package br.com.kuddlez.services;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.kuddlez.dao.DaoUsuario;
import br.com.kuddlez.dominio.Usuario;

/**
 * Servlet implementation class ServiceLogin
 */
public class ServiceLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServiceLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Usuario = request.getParameter("usuario");
		String Senha = request.getParameter("senha");
		
		 Usuario us = new Usuario();
		 us.setLoginUsuario(Usuario);
		 us.setSenhaUsuario(Senha);
		 
		 DaoUsuario daous = new DaoUsuario();
		 Usuario usu = daous.login(us);
		 if(usu != null) {
			 response.sendRedirect("homelog.html?idUsuario="+usu.getIdUsuario()+"&login="+usu.getLoginUsuario());
		 }
		 else {
			 response.sendRedirect("erro.html");
		 }
		 
	}

}
