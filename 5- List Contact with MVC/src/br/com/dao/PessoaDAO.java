package br.com.dao;

import java.util.ArrayList;

import br.com.bean.PessoaBean;

public class PessoaDAO {

	static public ArrayList<PessoaBean> listaPessoa = new ArrayList<PessoaBean>();

	public PessoaDAO() {
	}

	public ArrayList<PessoaBean> getListaPessoa() {
		return listaPessoa;
	}

	
	
	public void addListPessoa(PessoaBean pessoa) {
		PessoaDAO.listaPessoa.add(pessoa);
	}
	
	
	
}
