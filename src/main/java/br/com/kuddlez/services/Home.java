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
 * Servlet implementation class Home
 */
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
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
				+ "            <h1><span style=\"text-shadow: 2px 3px black;\">Kuddlez</span></h1>\r\n"
				+ "            <img src=\"img/cachorro.png\" alt=\"\">\r\n"
				+ "        </div>\r\n"
				+ "    </header>\r\n"
				+ "    <main>\r\n"
				+ "        <h1 class=\"tituloMain\">Seja Bem-Vindo!</h1>\r\n"
				+ "        \r\n"
				+ "        <!--sections-->\r\n"
				+ "        <section id=\"servico_petcho\">\r\n"
				+ "            <h3 id=\"tituloSection\">Serviços na Kuddlez!</h3>\r\n"
				+ "            <p id=\"sec1\">Na Kuddlez, entendemos que cada pet é único e merece o melhor cuidado. Por isso, criamos um espaço especial onde você pode facilmente cadastrar e encontrar serviços dedicados ao bem-estar e qualidade de vida dos seus melhores amigos. Estamos comprometidos em conectar você com os melhores profissionais para garantir que seu pet receba o carinho e a atenção que merece. Navegue pela nossa área de serviços e descubra o que há de melhor para o seu companheiro!</p>\r\n"
				+ "        </section>\r\n"
				+ " \r\n"
				+ "        <div id=\"sectionSec\">\r\n"
				+ "            <section id=\"servico_petcho2\">\r\n"
				+ "                <h3 id=\"tituloSection2\">O PetChó da Kuddlez!</h3>\r\n"
				+ "                <p id=\"sec2\">Na Kuddlez, acreditamos que o amor pelos pets pode ser expressado de várias formas, e uma delas é através do nosso Petcho, o brechó especializado em produtos para animais de estimação.  O Petcho é a nossa área dedicada a oferecer uma seleção exclusiva de produtos para pets, que vão desde brinquedos e acessórios até itens de cuidado e conforto, tudo em excelente estado e com preços acessíveis de forma sustentável! Visite o Petcho da Kuddlez e faça parte dessa comunidade que cuida do seu pet e do planeta! </p>\r\n"
				+ "             </section>\r\n"
				+ "        </div>\r\n"
				+ "\r\n"
				+ "            <!--Galeria-->\r\n"
				+ "      <h1 class=\"tituloMain\">Galeria</h1>\r\n"
				+ "      <p class=\"textoMain\">Veja alguns dos nossos amigos que aprovaram a Kuddlez!</p>\r\n"
				+ "      <div class=\"wrapper\">\r\n"
				+ "        <div class=\"image\">\r\n"
				+ "            <img src=\"img/2.jpg\" alt=\"\">\r\n"
				+ "            <div class=\"contentio\">\r\n"
				+ "                <h3>Graças a Kuddlez descobri o serviço de tosa aqui na minha cidade! Encontrei essas profissionais maravilhosas. Obrigada Natália e Bruna, irmãs da tosa!</h3>\r\n"
				+ "                <p>-por Ana Pimenta, julho de 2024</p>\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"image\">\r\n"
				+ "            <img src=\"img/3.jpg\" alt=\"\">\r\n"
				+ "            <div class=\"contentio\">\r\n"
				+ "                <h3>Kuddlez sempre me proporcionando os melhores pacientes!</h3>\r\n"
				+ "                <p>-por Doutora Amanda, agosto de 2024</p>\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"image\">\r\n"
				+ "            <img src=\"img/5.png\" alt=\"\">\r\n"
				+ "            <div class=\"contentio\">\r\n"
				+ "                <h3>Graças a Doutora que encontrei aqui na plataforma resolvi o que tanto extressava meus queridos João e Zezé!</h3>\r\n"
				+ "                <p>-por Rafaela, junho de 2024</p>\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "        <div class=\"image\">\r\n"
				+ "            <img src=\"img/6.png\" alt=\"\">\r\n"
				+ "            <div class=\"contentio\">\r\n"
				+ "                <h3>Lembrança de quando eu e minhas colegas fomos chamados pra atender esses queridos.</h3>\r\n"
				+ "                <p>-por Doutor Márcio Silva, julho de 2024</p>\r\n"
				+ "            </div>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "      <p class=\"textoMain\">Entre em contato conosco pela área de contato e nos mande seu Feedback!</p>\r\n"
				+ "    </main> \r\n"
				+ "\r\n"
				+ "    <!--Contato-->\r\n"
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

}
