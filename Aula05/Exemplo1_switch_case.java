	/**
	 * 
	 * Estrutura mais elegante (se comparado com if-else) (menos código)
	 * Teste igualdade - Inteiros, Strings, Boolean e char
	 * - não se aplica para float/double
	 * - break
	 * - default <opcional> 
	 * 
	 * Sintaxe: 
	 * 
	 * switch(var_teste){
	 * 		case 1:
	 * 			bloco de código 1
	 * 			break;
	 * 		case 2:
	 * 			bloco de código 2
	 * 			break;
	 * 		case 3:
	 * 			bloco de código 3
	 * 			break;
	 * 		...
	 * 		default:
	 * 			bloco de código do default
	 * }	
	 * 
	 * if(var_teste == 1 or var_teste == 2 or var_teste ==3){
	 * 	  ...
	 * }
	 * 
	 * if(var_teste.equals("FIAP") || var_teste.equals("fiap") || var_teste...
	 * 
	 * 
	 */
package Aula05;

import java.util.Scanner;

public class Exemplo1_switch_case {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dia da semana: (1-7)");
		int dia = input.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			break; //abortar a estrutura
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default: //comando opcional
			System.out.println("Dia da semana inválido");
		}
		
	}
	
}
