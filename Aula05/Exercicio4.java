package Aula05;

import java.util.Scanner;

/**
 * 
 * Escreva um programa em Java que seja capaz de ler 3 notas de 
 * um aluno, calcule e imprima e média obtida, o seu status(aprovado
 * ou reprovado), bem como o conceito relativo à nota (vide tabela abaixo)
 * <teste>  <conceito>  <mensagem>
 * - 10>média>9 - A - ExCelente
 * - 9> média>8 - B - Ótimo
 * - 8> média>7 - C - Bom
 * - 7> média>6 - D - Regular
 * - 6> média>5 - E - Ruim
 * -    média<5 - F - Nos vemos no próximo ano...
 * 
 * 1) método para obter uma nota
 * 2) método para calcular a média
 * 3) método determinar o conceito e a mensagem
 * 4) método para imprimir (nome, média, conceito e a mensagem)
 * 5) Classe para testar o exercício
 * 
 */

public class Exercicio4 {
	
	private Scanner input;
	
	public float GetNota() {
		input = new Scanner(System.in);
		System.out.println("Digite a nota do aluno");
		float nota = input.nextInt();
		return nota;
	}
	
	public float CalcularMedia(float n1, float n2, float n3) {
		float media = n1 + n2 + n3 / 3;
		return media;
	}
	
	public String DefinirConceito(float media) {
		if(media <= 10 || media >= 9) {
			System.out.println("A - ExCelente");
		}
		else if (media< 9 && media >= 8)
			System.out.println("B - Ótimo");
		else if(media<8 && media >=7 )
			System.out.println("C - Bom");
		else if(media<7 && media >= 6) {
			System.out.println("D - Regular");
		}
		else if(media <6 && media >= 5) {
			System.out.println("E - Ruim");
		}
		else {
			System.out.println("F - Nos vemos no próximo ano...");
		}
	}

}
