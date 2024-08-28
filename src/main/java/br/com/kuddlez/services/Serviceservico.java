package br.com.kuddlez.services;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.kuddlez.dao.DaoServico;
import br.com.kuddlez.dominio.Servico;
import br.com.kuddlez.dominio.ServicoUsuario;

/**
 * Servlet implementation class Serviceservico
 */
public class Serviceservico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serviceservico() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pagina ="<!DOCTYPE html>\r\n"
				+ "<html lang=\"pt-br\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css\">\r\n"
				+ "    <link rel=\"stylesheet\" href=\"style.css\">\r\n"
				+ "    <title>Kuddlez - petchó e bem-estar</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <header>\r\n"
				+ "        <nav id=\"menuInicial\">\r\n"
				+ "            <ul class=\"menu\">\r\n"
				+ "                <li><a href=\"Home\" class=\"menuItem\">HOME</a></li>\r\n"
				+ "                <li><a href=\"Serviceservico\" class=\"menuItem\">SERVIÇOS</a></li>\r\n"
				+ "                <li><a href=\"ServicePetcho\" class=\"menuItem\">PETCHÓ</a></li>\r\n"
				+ "                <li><a href=\"quemSomos.html\" class=\"menuItem\">QUEM SOMOS</a></li>\r\n"
				+ "                <li><a href=\"#rodape\" class=\"menuItem\">CONTATO</a></li>\r\n"
				+ "            </ul>\r\n"
				+ "            <ul class=\"menu\">\r\n"
				+ "                <li><a href=\"login.html\" class=\"menuItem\">LOGIN</a></li>\r\n"
				+ "                <li><a href=\"cadastro.html\" class=\"menuItem\">CADASTRO</a></li>\r\n"
				+ "            </ul>\r\n"
				+ "        </nav>\r\n"
				+ "        <div class=\"bannerTopo\">\r\n"
				+ "            <h1><span style=\"text-shadow: 2px 3px black; font-family: nova;\">Serviços</span></h1>\r\n"
				+ "        </div>\r\n"
				+ "    </header>\r\n"
				+ "    <article class=\"introPage\">\r\n"
				+ "        <h2>\r\n"
				+ "            Bem-vindo à Área de Serviços da Kuddlez!\r\n"
				+ "        </h2>\r\n"
				+ "        <p>Encontre tudo o que seu pet precisa, desde banho e tosa até consultas veterinárias e cuidados estéticos, tudo no conforto da sua casa. Nossa plataforma conecta você a profissionais qualificados, oferecendo praticidade e qualidade para cuidar do seu amigo de estimação. Explore nossas opções e descubra como podemos ajudar a tornar a vida do seu pet mais feliz e saudável!</p>\r\n"
				+ "    </article>\r\n"
				+ "    <article>\r\n"
				+ "        <div class=\"areaAnuncio\">\r\n";
				
				String conteudo = "";
				DaoServico dServ = new DaoServico();
				List<ServicoUsuario> lst = dServ.listar();
				for(int i=0;i<lst.size();i++) {
					
				conteudo+=" <div class=\"anuncio\">\r\n"
				+ "                <div class=\"txtAnuncio\">\r\n"
				+ "                    <h2>"+lst.get(i).getNomeCompleto()+"</h2>\r\n"
				+ "                    <h3>"+lst.get(i).getFuncoesServ()+"</h3>\r\n"
				+ "                    <h4>"+lst.get(i).getContatoServ()+"</h4>\r\n"
				+ "                    <h5>"+lst.get(i).getDispoServ()+"</h5>\r\n"
				+ "                    <h5>"+lst.get(i).getValorServ()+"</h5>\r\n"
				+ "                    <p>"+lst.get(i).getDescServ()+"</p>\r\n"
				+ "                </div>\r\n"
				+ "            </div>"
				;
				}
				pagina+=conteudo;
				pagina+="</div>\r\n"
				+ "    </article>\r\n"
				+ "\r\n"
				+ "    <!--Área de Contato-->\r\n"
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
		String idUsuario = request.getParameter("idUsuario");
		String funcoes = request.getParameter("funcoesServ");
		String desc = request.getParameter("descServ");
		String contato = request.getParameter("contatosServ");
		String dispo = request.getParameter("dispoServ");
		String valor = request.getParameter("valorServ");
		
		
		
		
		ServicoUsuario servu = new ServicoUsuario();
		DaoServico daos = new DaoServico();
		
		servu.setIdUsuario(Integer.parseInt(idUsuario));
		
		servu.setIdUsuario(null);
		servu.setFuncoesServ(funcoes);
		servu.setDescServ(desc);
		servu.setContatoServ(contato);
		servu.setDispoServ(dispo); 
		servu.setValorServ(valor);
		
	
		
		String msg = daos.Cadastrar(servu);
		if(msg.equals("Cadastro do serviço realizado")) {
			response.sendRedirect("confirmacao.html");
		}
		else {
		response.getWriter().append(msg);
		}
		
	}
		

}
