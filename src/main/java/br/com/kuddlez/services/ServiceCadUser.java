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
 * Servlet implementation class ServiceCadUser
 */
public class ServiceCadUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServiceCadUser() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeCompleto = request.getParameter("Nome");
		String loginUser = request.getParameter("login");
		String senhaUser= request.getParameter("senha");
		String emailUser = request.getParameter("email");
		String telefoneUser = request.getParameter("telefone");
		String enderecoUser = request.getParameter("endereco");
		String cpfUser = request.getParameter("cpf");
		String cnpjUser = request.getParameter("cnpj");
		String datanascUser = request.getParameter("datadeNasc");
		
		Usuario us = new Usuario();
		DaoUsuario daous = new DaoUsuario();
		
		us.setNomeCompleto(nomeCompleto);
		us.setLoginUsuario(loginUser);
		us.setSenhaUsuario(senhaUser);
		us.setEmailUsuario(emailUser);
		us.setTelefoneUsuario(telefoneUser);
		us.setEnderecoUsuario(enderecoUser);
		us.setCpfUsuario(cpfUser);
		us.setCnpjUsuario(cnpjUser);
		us.setDataNascimentoUsuario(datanascUser);
		
		String msg = daous.Cadastrar(us);
		
		if(msg.equals("Cadastro realizado com sucesso, faça login.")) {
			response.sendRedirect("confirmacao.html");
		}
		else {
		response.getWriter().append(msg);
		}
	}
	}