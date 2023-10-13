package controle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.BancoContato;
import modelo.Contato;

import java.io.IOException;


public class cadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Contato contato = new Contato();
		 String nome = request.getParameter("nome");
		 String telefoneCelular = request.getParameter("telefoneCelular");
		 String telefoneResid = request.getParameter("telefoneResidencial");
		 String dataNascimento = request.getParameter("dataNascimento");
		 String email = request.getParameter("email");
		 
		 contato.setNome(nome);
		 contato.setDataNascimento(dataNascimento);
		 contato.setEmail(email);
		 contato.setTelefoneCelular(telefoneCelular);
		 contato.setTelefoneResid(telefoneResid);
		 
		 
		 BancoContato bancoContato = BancoContato.getInstancia();
		 bancoContato.adicionarContato(contato);
		 response.sendRedirect("telaMenu.jsp");
		 
	}

}
