package controle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class telaLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeUsuario = request.getParameter("usuario");
        String senhaUsuario = request.getParameter("senha");

        PrintWriter out = response.getWriter();

        if (nomeUsuario != null && senhaUsuario != null && nomeUsuario.equals("admin") && senhaUsuario.equals("admin")) {
            out.println("<h1>Entrou</h1>");
            HttpSession session = request.getSession(true);
            session.setMaxInactiveInterval(60);
            response.sendRedirect("telaMenu.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}
