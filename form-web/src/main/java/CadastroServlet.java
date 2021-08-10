import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastroservlet")
public class CadastroServlet extends HttpServlet {

	

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html;charset=UTF-8");
		
		String nome = req.getParameter("nome-completo");
		String telefone = req.getParameter("telefone");
		String dtNasc = req.getParameter("dt-Nascimento");
		String email = req.getParameter("e-mail");
		String sexo = req.getParameter("sexo");
		String[] tec = req.getParameterValues("tecnologia");
		String escola = req.getParameter("escolaridade");
		
		PrintWriter saida = res.getWriter();
		
		saida.println("<!DOCTYPE html>");		
		saida.println("<html lang=\"en\">");
		saida.println("<head>");
		saida.println("<meta charset=\"UTF-8\">");
		saida.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
		saida.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		saida.println("<title>Cadastro</title>");
		saida.println("<link rel=\"stylesheet\" href=\"css/estilo.css\">");
		saida.println("</head>");
		saida.println("<body>");
		saida.println("<H1>DADOS RECEBIDOS - FORMULÁRIO CADASTRO</H1>");
		saida.println("<table id=\"customers\">");
		saida.println("<tr>");
		saida.println("<th>Informações</th>");
		saida.println("<th>Dados Usuário</th>");
		saida.println("</tr>");
		saida.println("<tr>");
		saida.println("<td>Nome Completo</td>");
		saida.println("<td>"+nome+"</td>");
		saida.println("</tr>");
		saida.println("<tr>");
		saida.println("<td>Telefone</td>");
		saida.println("<td>"+telefone+"</td>");
		saida.println("</tr>");
		saida.println("<tr>");
		saida.println("<td>Data Nascimento</td>");
		saida.println("<td>"+dtNasc+"</td>");
		saida.println("</tr>");
		saida.println("<tr>");
		saida.println("<td>E-mail</td>");
		saida.println("<td>"+email+"</td>");
		saida.println("</tr>");
		if (sexo.equals("m")) {
			saida.println("<tr>");
			saida.println("<td>Sexo</td>");
			saida.println("<td>Masculino</td>");
			saida.println("</tr>");
		} else {
			saida.println("<tr>");
			saida.println("<td>Sexo</td>");
			saida.println("<td>Feminino</td>");
			saida.println("</tr>");
		}	
		saida.println("<tr>");
		saida.println("<td>Tecnologia</td>");
		saida.println("<td>"+tec[0]+" - "+tec[1]+" - "+tec[2]+" - "+tec[3]+"</td>");
		saida.println("</tr>");
		saida.println("<tr>");
		saida.println("<td>Grau de Escolaridade</td>");
		saida.println("<td>"+escola+"</td>");
		saida.println("</tr>");
		saida.println("</table>");
		saida.println("<a href=\"/form-web/formCadastro.jsp\"><input type=\"submit\" class=\"bt_voltar\" id=\"espacamento\" value=\"Voltar\"></a>");
		saida.println("</body>");
		saida.println("</html>");
	}

}
