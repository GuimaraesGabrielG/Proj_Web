package Controller;

public class User {
	String nome;
	String email;
	String senha;
	String cpf;
	
	public User(String nome, String email, String senha, String cpf ) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return this.nome +"-"+ this.email + "-" + this.senha + "-" + this.cpf + "*";
	}

}
