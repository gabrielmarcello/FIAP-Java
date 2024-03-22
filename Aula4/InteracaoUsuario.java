package Aula4;

import java.util.Scanner;

public class InteracaoUsuario {
	
	private Scanner input;
	
	public int menu() {
		input = new Scanner(System.in);
		System.out.println("*-* MENU *-*");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("Operação: ");
		int op = input.nextInt();
		return op;
	}
	
	public float entradaDados() {
		System.out.println("*-* ENTRADA DE DADOS *-*");
		input = new Scanner(System.in);
		System.out.println("Número: ");
		float num = input.nextFloat();
		return num;
	}
	
	public void imprimir(float resultado) {
		System.out.println("*-* IMPRIMIR *-*");
		System.out.println("Resultado: " + resultado);
	}
}