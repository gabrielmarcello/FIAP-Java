package Aula05;

import java.util.Scanner;

public class Exemplo3_switch_case {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("*-- Verifica NOME --*");
		System.out.print("Nome: ");
		String nome = input.next();
		
		//teste com if-else
		if(nome.equals("FIAP") || nome.equals("fiap") || nome.equals("Fiap")) {
			System.out.println("Nome válido!");
		}else {
			System.out.println("Nome inválido!");
		}
		
		
		//teste switch-case
		switch(nome) {
		case "FIAP":
		case "fiap":
		case "Fiap":
			System.out.println("Nome válido!");
			break;
		default:
			System.out.println("Nome inválido!");
		}
	}
}
