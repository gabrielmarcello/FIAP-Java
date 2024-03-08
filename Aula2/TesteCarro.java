package Aula2;

public class TesteCarro {

	public static void main(String[] args) {
		
		//criando um objeto Carro
		Carro camaro = new Carro("Chevrolet", "Camaro", 2023);
		
		System.out.println("Marca: " + camaro.getMarca());
		System.out.println("Modelo: " + camaro.getModelo());
		System.out.println("Ano: " + camaro.getAno());
		System.out.println("Status: " + camaro.getStatus());
	}
}
