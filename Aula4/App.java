package Aula4;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		CalculadoraSimples cs = new CalculadoraSimples();
		InteracaoUsuario iu = new InteracaoUsuario();
		
		int op = iu.menu();
		float n1 = iu.entradaDados();
		float n2 = iu.entradaDados();
		
//		System.out.println("N1: ");
//		float n1 = input.nextFloat();
//		System.out.println("N2: ");
//		float n2 = input.nextFloat();
		
		if(op == 1) {
			iu.imprimir(cs.somar(n1, n2));
//			float resultado = cs.somar(n1, n2);
//			System.out.println("Resultado: " + resultado);
		}
		else if(op == 2) {
			float resultado = cs.subtrair(n1, n2);
			iu.imprimir(resultado);
		}
		else if(op == 3) {
			iu.imprimir(cs.multiplicar(n1, n2));
//			float resultado = cs.multiplicar(n1, n2);
//			System.out.println("Resultado: " + resultado);
		}
		else if(op == 4) {
			iu.imprimir(cs.dividir(n1, n2));
//			float resultado = cs.multiplicar(n1, n2);
//			System.out.println("Resultado: " + resultado);
		}
		else {
			System.out.println("Operação inválida!");
		}
	}
}
