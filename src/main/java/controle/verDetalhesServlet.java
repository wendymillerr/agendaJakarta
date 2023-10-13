package controle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.BancoContato;
import modelo.Contato;

import java.io.IOException;
import java.io.PrintWriter;

public class verDetalhesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Verificar a sessão
        HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        String nomeContato = request.getParameter("nomeContato");

        BancoContato bancoContatos = BancoContato.getInstancia();

        Contato contato = bancoContatos.buscarContatoPorNome(nomeContato);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Detalhes do Contato</title></head><body>");
        out.println("<h1>Detalhes do Contato</h1>");

        if (contato != null) {
            out.println("Nome: " + contato.getNome() + "<br>");
            out.println("Telefone Celular: " + contato.getTelefoneCelular() + "<br>");
            out.println("Telefone Residencial: " + contato.getTelefoneResid() + "<br>");
            out.println("Data de Nascimento: " + contato.getDataNascimento() + "<br>");
            out.println("Email: " + contato.getEmail() + "<br>");
        } else {
            out.println("Contato não encontrado.");
        }

        out.println("</body></html>");
    }
}
