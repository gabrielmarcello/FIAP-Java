package Aula2;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(); // criando um objeto do tipo Aluno
		
		System.out.println("Matrícula: " + a1.getMatricula());
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Média: " + a1.getMediaGeral());
		System.out.println("------------------------------------");
		
		//configurando as informações do objeto a1
		a1.setMatricula("rm123");
		a1.setNome("Rodrigo");
		a1.setMediaGeral(9);
		
		System.out.println("Matrícula: " + a1.getMatricula());
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Média: " + a1.getMediaGeral());
	}
	
}
