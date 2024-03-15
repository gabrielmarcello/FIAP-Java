package Aula3;

public class TestePessoa {
	public static void main(String[] args) {
		//criando um objeto de Classe Pessoa
		Pessoa p1 = new Pessoa();
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Altura: " + p1.getAltura());
		
		//configurando os atributos do obj p1
		p1.setNome("Alan");
		p1.setIdade(58);
		p1.setAltura(1.98f);
		
		System.out.println("===========================================");
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Altura: " + p1.getAltura());
		
		System.out.println("===========================================");
		
		//criando um objeto da Classe Pessoa - construtor parametrizado
		Pessoa p2 = new Pessoa("Joziwaldo");
		
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Idade: " + p2.getIdade());
		System.out.println("Altura: " + p2.getAltura());
		
		p2.setIdade(70);
		p2.setAltura(1.73f);
		
		System.out.println("===========================================");
		
		System.out.println("Nome: " + p2.getNome());
		System.out.println("Idade: " + p2.getIdade());
		System.out.println("Altura: " + p2.getAltura());
		
		System.out.println("===========================================");
		
		Pessoa p3 = new Pessoa("Bruno", 13, 1.71f);
		
		System.out.println("Nome: " + p3.getNome());
		System.out.println("Idade: " + p3.getIdade());
		System.out.println("Altura: " + p3.getAltura());
	}
}