package controle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import modelo.BancoContato;
import modelo.Contato;

import java.io.IOException;

public class cadastroServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Verificar a sessão
        HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        String nome = request.getParameter("nome");
        String telefoneCelular = request.getParameter("telefoneCelular");
        String telefoneResid = request.getParameter("telefoneResidencial");
        String dataNascimento = request.getParameter("dataNascimento");
        String email = request.getParameter("email");

        // Verificar se algum campo está vazio
        if (nome == null || telefoneCelular == null || telefoneResid == null || dataNascimento == null || email == null ||
            nome.isEmpty() || telefoneCelular.isEmpty() || telefoneResid.isEmpty() || dataNascimento.isEmpty() || email.isEmpty()) {
            // Redirecionar de volta à página de cadastro com uma mensagem de erro
            request.setAttribute("errorMessage", "Todos os campos devem ser preenchidos.");
            request.getRequestDispatcher("paginaDeCadastro.jsp").forward(request, response);
            return;
        }

        Contato contato = new Contato();
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
