import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
		String lsTecno = "";		
		for (String t : tec) {
			lsTecno += t + " - ";
			}
		saida.println("<td>"+lsTecno+"</td>");		
		saida.println("</tr>");
		saida.println("<tr>");
		saida.println("<td>Grau de Escolaridade</td>");
		saida.println("<td>"+escola+"</td>");
		saida.println("</tr>");
		saida.println("</table>");
		saida.println("<a href=\"/form-web/formCadastro.jsp\"><input type=\"submit\" class=\"bt_voltar\" id=\"espacamento\" value=\"Voltar\"></a>");
		saida.println("</body>");
		
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://chunee.db.elephantsql.com:5432/ebjmmhdn";
			String usuarioDb = "ebjmmhdn";
			String senhaDb = "Q_lQBrTw3n5KYMr1FTCsDHp09OO4jpXR";
		   Connection cont = DriverManager.getConnection(url, usuarioDb, senhaDb);
		   saida.println("Ok para a conexão");
		   
		   String sql = "insert into pessoa (nome_completo, telefone, dat_nascimento, email, sexo, tecnologia, escolaridade)"
		   		+ "values('"+nome+"', '"+telefone+"','"+dtNasc+"', '"+email+"','"+sexo+"','"+lsTecno+"','"+escola+"');";
		 
		   PreparedStatement pst = cont.prepareStatement(sql);
		   pst.execute();
		   pst.close();
		   cont.close();
		   
		   saida.println("Registro gravado no banco!");
		} catch (Exception e ) {
			saida.println("Erro de conexão");
		}
		
		saida.println("</html>");
	}

}
