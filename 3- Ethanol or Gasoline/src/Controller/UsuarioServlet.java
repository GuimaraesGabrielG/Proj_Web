package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/preco")
public class UsuarioServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String gasolina = req.getParameter("txtgasolina");
		String alcool = req.getParameter("txtalcool");
        String message = null;


	
		Double div = Double.parseDouble(gasolina)/Double.parseDouble(alcool);
		
		if(div < 0.7) {
			message = "melhor usar alcool";
			
		}else {
			message = "melhor usar gasolina";
		}
		req.setAttribute("message", message); 
        req.getRequestDispatcher("/resultado.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	}

}
