package controle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.BancoContato;
import modelo.Contato;
import java.io.IOException;
import java.util.ArrayList;


public class listarContatosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Você pode realizar algumas ações do doGet aqui, se necessário

        // Em seguida, chame o método doPost
        doPost(request, response);
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BancoContato bancoContato = BancoContato.getInstancia();

        // Obtém a lista de contatos do banco de dados
        ArrayList<Contato> contatos = bancoContato.listarContatos();

        // Define o tipo de conteúdo da resposta como HTML
        response.setContentType("text/html");

        // Escreve a lista de contatos na resposta HTML
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Contatos Salvos</h1>");
        
        for (Contato contato : contatos) {
            response.getWriter().println("<p>Nome: " + contato.getNome() + "</p>");
            response.getWriter().println("<p>Telefone Celular: " + contato.getTelefoneCelular() + "</p>");
            response.getWriter().println("<p>Telefone Residencial: " + contato.getTelefoneResid() + "</p>");
            response.getWriter().println("<p>E-mail: " + contato.getEmail() + "</p>");
            response.getWriter().println("<p>Data de Nascimento: " + contato.getDataNascimento() + "</p>");
            response.getWriter().println("<hr>");
        }
        
        response.getWriter().println("</body></html>");
    }
		
		
	}


