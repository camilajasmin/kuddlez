package br.com.kuddlez.services;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import br.com.kuddlez.dao.DaoServico;
import br.com.kuddlez.dominio.ServicoUsuario;

/**
 * Servlet implementation class ServiceUsuario
 */
public class ServiceUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServiceUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pagina ="<!DOCTYPE html>\r\n"
				+ "<html lang=\"pt\">\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "    <title>Página Usuário</title>\r\n"
				+ "</head>\r\n"
				+ "<header>\r\n"
				+ "\r\n"
				+ "    <nav id=\"menuInicial\">\r\n"
				+ "<ul class=\"menu\">\r\n"
				+ "                <li><a href=\"Home\" class=\"menuItem\">HOME</a></li>\r\n"
				+ "                <li><a href=\"Serviceservico\" class=\"menuItem\">SERVIÇOS</a></li>\r\n"
				+ "                <li><a href=\"ServicePetcho\" class=\"menuItem\">PETCHÓ</a></li>\r\n"
				+ "                <li><a href=\"quemSomos.html\" class=\"menuItem\">QUEM SOMOS</a></li>\r\n"
				+ "                <li><a href=\"#rodape\" class=\"menuItem\">CONTATO</a></li>\r\n"
				+ "            </ul>\r\n"
				+ "        <ul id=\"menulogo\" >\r\n"
				+ "            <li><a href=\"homelog.html\" class=\"imglogo\">\r\n"
				+ "                    <img src=\"img/logo.png\" alt=\"Logo\">\r\n"
				+ "                </a></li>\r\n"
				+ "        </ul>\r\n"
				+ "        <div class=\"menubot\">\r\n"
				+ "            <button><a href=\"cadastroProduto.html\" class=\"menubtn\">Venda no Petcho</a></button>\r\n"
				+ "            <button><a href=\"cadastroServico.html\" class=\"menubtn\">Cadastre seu Serviço</a></button>\r\n"
				+ "        </div>\r\n"
				+ "    </nav>\r\n"
				+ "</header>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "    \r\n"
				+ "    <div class=\"perfiluser\">\r\n"
				+ "        <h1 id=\"titulodiv1\">Perfil do Usuário</h1>\r\n"
				+ "        <main class=\"conteudouser\">\r\n"
				+ "            <div id=\"nomeuser\">\r\n"
				+ "                <h2>Jude bel</h2>\r\n"
				+ "            </div>\r\n"
				+ "            <h2 id=\"titulodiv2\">Serviços Postados por você</h2>\r\n	"
				+ "				<div class=\"anuncio\">\r\n"
				+ "                <div class=\"txtAnuncio\">\r\n"
				;
						String iduser = request.getParameter("idusuario");
						String conteudo = "";
						DaoServico daos = new DaoServico();
						ServicoUsuario servu = new ServicoUsuario();
						
						servu.setIdUsuario(Integer.parseInt(iduser));
						servu = daos.pesquisar(servu);
						
				conteudo+=            
				 "                    <h3>"+servu.getFuncoesServ()+"</h3>\r\n"
				+ "                    <h4>"+servu.getContatoServ()+"</h4>\r\n"
				+ "                    <h5>"+servu.getDispoServ()+"</h5>\r\n"
				+ "                    <h5>"+servu.getValorServ()+"</h5>\r\n"
				+ "                    <p>"+servu.getDescServ()+"</p>\r\n"
				+ "                </div>\r\n"
				+ "            </div>";
				pagina+=conteudo;
				pagina+= "            <h2 id=\"titulodiv4\">Venda</h2>\r\n"
				+ "            <div class=\"produtouser\">\r\n"
				+ "                <p id=\"descricaopuser\">\r\n"
				+ "                    Estou trocando essa roupinha da minha querida Amora, que está super estilosa e em ótimo estado! A\r\n"
				+ "                    peça é colorida com tons azuis e amarelos.</br>Ela usou pouco e ainda está com cara de nova.\r\n"
				+ "                    Se você está procurando uma roupinha para o seu pet que seja confortável e fashion, essa é uma ótima\r\n"
				+ "                    oportunidade!\r\n"
				+ "                    Interessado(a)? Entre em contato para mais detalhes e para combinar a compra! </br>\r\n"
				+ "                <div class=\"imgprodutos\">\r\n"
				+ "                    <img src=\"img/amora.png\">\r\n"
				+ "                </div>\r\n"
				+ "\r\n"
				+ "                </p>\r\n"
				+ "            </div>\r\n"
				+ "        </main>\r\n"
				+ "    </div>\r\n"
				+ "    <div class=\"areaContato\">\r\n"
				+ "        <div class=\"tituloContato\">\r\n"
				+ "            <h1>Entre em contato conosco!</h1>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"subAreaCtt\">\r\n"
				+ "            <div class=\"colunaCtt\">\r\n"
				+ "                <h4>Como entrar em contato? Fácil, utilize qualquer um desses meios!</h3>\r\n"
				+ "                <ul>\r\n"
				+ "                    <li><img src=\"img/wppicon.png\" alt=\"\"><a href=\"https://wa.me/11982108134\">(11)98210-8134, Zona Norte.</a></li>\r\n"
				+ "                    <li><img src=\"img/wppicon.png\" alt=\"\"><a href=\"https://wa.me/11969169901\">(11)96916-9901, Zona Leste.</a></li>\r\n"
				+ "                    <li><img src=\"img/telefoneicon.png\" alt=\"\"><a href=\"https://wa.me/1197737203\">(11)9773-7203</a></li>\r\n"
				+ "                    <li><img src=\"img/emailicon.png\" alt=\"\"><a href=\"\"></a>kuddlez.pet@gmail.com</li>\r\n"
				+ "                </ul>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"colunaCtt\">\r\n"
				+ "                <div id=\"imgcoluna\"><a href=\"#menuInicial\"><img src=\"img/loguinhooooo.png\" alt=\"\"></a></div>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"colunaCtt\">\r\n"
				+ "                <h4>Um de nossos meios de comunicação também é nossa sede em São Paulo! Venha nos visitar!</h3> \r\n"
				+ "                <ul>\r\n"
				+ "                    <li>R. Cel. Luís Americano, 130 - Tatuapé, São Paulo - SP, 03308-020</li>\r\n"
				+ "                </ul>\r\n"
				+ "                <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d58541.54492870335!2d-46.61459811713633!3d-23.502035694394166!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94ce5ec26cfdcfed%3A0x49e7eb66fd4f1f2!2sSenac%20Tatuap%C3%A9%20-%20Cel.%20Lu%C3%ADs%20Americano!5e0!3m2!1spt-BR!2sbr!4v1724634755836!5m2!1spt-BR!2sbr\" width=\"100%\" height=\"200px\" style=\"border-radius:5px;\" allowfullscreen=\"\" loading=\"lazy\" referrerpolicy=\"no-referrer-when-downgrade\"></iframe> \r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "    </div>\r\n"
				+ "    \r\n"
				+ "</body>\r\n"
				+ "<footer id=\"rodape\">\r\n"
				+ "    <p>Copyright© 2024 Camila Jasmin, Chayanne Salazar e Rafaella Oliveira</p>\r\n"
				+ "</footer>\r\n"
				+ "</html>";
		
		response.getWriter().append(pagina);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
