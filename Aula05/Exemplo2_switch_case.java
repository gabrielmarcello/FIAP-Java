package Aula05;

import java.util.Scanner;

public class Exemplo2_switch_case {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Final da Placa: ");
		byte finalPlaca = input.nextByte();
		
		if(finalPlaca == 1 || finalPlaca == 2) {
			System.out.println("Rodízio SEGUNDA-FEIRA");
		}else if(finalPlaca == 3 || finalPlaca == 4) {
			System.out.println("Rodízio TERÇA-FEIRA");
		}else if(finalPlaca == 5 || finalPlaca == 6) {
			System.out.println("Rodízio QUARTA-FEIRA");
		}else if(finalPlaca == 7 || finalPlaca == 8) {
			System.out.println("Rodízio QUINTA-FEIRA");
		}else if(finalPlaca == 9 || finalPlaca == 0) {
			System.out.println("Rodízio SEXTA-FEIRA");
		}else {
			System.out.println("Número inválido!");
		}
		
		switch(finalPlaca) {
		case 1:
		case 2:
			System.out.println("Rodízio SEGUNDA-FEIRA");
			break;
		case 3:
		case 4:
			System.out.println("Rodízio TERÇA-FEIRA");
			break;
		case 5:
		case 6:
			System.out.println("Rodízio QUARTA-FEIRA");
			break;
		case 7:
		case 8:
			System.out.println("Rodízio QUINTA-FEIRA");
			break;
		case 9:
		case 0:
			System.out.println("Rodízio SEXTA-FEIRA");
			break;
		default:
			System.out.println("Número inválido!");

		}
	}
}