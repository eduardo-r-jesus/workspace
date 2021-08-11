import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String loginV = "eduardo.jesus@hotmail.com";
		String senhaV = "0123";
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		PrintWriter saida = res.getWriter();
		saida.println("<!DOCTYPE html>");
		if (loginV.equals(login) && senhaV.equals(senha)) {
			saida.println("<head>");
			saida.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
			saida.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
			saida.println("<title>Home</title>");
			saida.println("<link rel=\"stylesheet\" href=\"css/estilo.css\">");
			saida.println("</head>");
			saida.println("<body>");
			saida.println("<ul>");
			saida.println(" <li><a href=\"/form-web/formIndex.jsp\"><b>Home</b></a></li>");
			saida.println("<li><a href=\"/form-web/formCadastro.jsp\"><b>Cadastro</b></a></li>");
			saida.println("<li><a href=\"#Contato\"><b>Contato</b></a></li>");
			saida.println("<li><a href=\"#Sobre\"><b>Sobre</b></a></li>");
			saida.println(" </ul>");		
			saida.println("</body>");
		} else {
			saida.println("Acesso negado!");
		}		
		saida.println("</html>");
	}

}
