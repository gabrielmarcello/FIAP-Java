package Aula06;

public class Cliente {

	//atributos
	private String nome;
	private String cpf;
	
	//método construtor
	public Cliente(String nome, String cpf) {
		System.out.println("*-* Cliente foi criado *-*");
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
}
