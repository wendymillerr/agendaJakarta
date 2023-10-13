package controle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.BancoContato;

import java.io.IOException;
import java.io.PrintWriter;


public class excluirUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeContato = request.getParameter("nomeContato");

        
        BancoContato bancoContato = BancoContato.getInstancia(); 

        boolean exclusaoBemSucedida = bancoContato.excluirContatoPorNome(nomeContato);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Excluir Contato</title></head><body>");
        out.println("<h1>Excluir Contato</h1>");

        if (exclusaoBemSucedida) {
            out.println("O usuário foi excluído com sucesso.");
        } else {
            out.println("Não foi possível excluir o usuário. Verifique o nome do contato.");
        }

        out.println("</body></html>");
    }
	

}
