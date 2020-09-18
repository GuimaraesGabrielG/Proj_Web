package br.com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.bean.PessoaBean;
import br.com.bo.PessoaBO;
import br.com.dao.PessoaDAO;

/**
 * Servlet implementation class PessoaController
 */
@WebServlet("/PessoaController")
public class PessoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PessoaController() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("txtNome");
		String email = request.getParameter("txtEmail");
		
        ArrayList<PessoaBean> lista = new ArrayList<PessoaBean>();
        PessoaBean pessoabean = new PessoaBean(nome, email);
        PessoaDAO.listaPessoa.add(pessoabean);
		
		PessoaBO pessoa = new PessoaBO();
		
		lista = pessoa.listarPessoas();

		request.setAttribute("lista", lista);
		
		request.getRequestDispatcher("lista.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
