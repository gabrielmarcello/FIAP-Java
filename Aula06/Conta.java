package Aula06;

public class Conta {
	
	//atributos da Classe
	private String numeroConta;
	private double saldo;
	private Cliente cliente; // atributo para associar a conta a um cliente
	
	
	//método construtor
	public Conta(String numeroConta, Cliente cliente) {
		System.out.println("*-* Conta Aberta *-*");
		this.numeroConta = numeroConta;
		this.saldo = 0;
		this.cliente = cliente;
	}
	
	//metodos operacionais
	public void depositar(double valor) {
		System.out.println("*-* Depositar *-*");
		if(valor > 0) {
			this.saldo += valor;
		}else {
			System.out.println("Erro: O deposito não pode ser negativo!!");
		}
	}
	
	public void sacar(double valor) {
		System.out.println("*-* Sacar *-*");
		if(valor > 0 && valor <= this.saldo) {
			this.saldo -= saldo;
		}
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		System.out.println("*-* Obter saldo *-*");
		return saldo;
	}
}
