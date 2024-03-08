package Aula2;

/* 
 * Atributos:
 * - marca
 * - modelo
 * - cor
 * - ano
 * - km
 * - placa
 * - status
 * - velocidade ?
 */


public class Carro {

	//Atributos
	private String marca;
	private String modelo;
	private int ano;
	private int km;
	private String cor;
	private String placa;
	private boolean status; //Lógico -> true ou false
	private int velocidade;
	
	//Construtores
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public Carro(String marca, String modelo, int ano, int km, String cor, String placa, boolean status) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.km = km;
		this.cor = cor;
		this.placa = placa;
		this.status = status;
	}
	
	//métodos getters e setters
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno() {
		this.ano = ano;
	}
	
	//continuar o código aqui...
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public int getKm() {
		return km;
	}
	
	public void setKm(int km) {
		this.km = km;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
}