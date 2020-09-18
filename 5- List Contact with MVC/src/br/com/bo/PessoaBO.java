package br.com.bo;

import java.util.ArrayList;

import br.com.bean.PessoaBean;
import br.com.dao.PessoaDAO;

public class PessoaBO {

	public ArrayList<PessoaBean> listarPessoas(){
		
		return new PessoaDAO().getListaPessoa();
	}
}
