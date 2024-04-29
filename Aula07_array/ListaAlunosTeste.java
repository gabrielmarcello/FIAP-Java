package Aula07_array;

public class ListaAlunosTeste {
	public static void main(String[] args) {
		
		//criando uma lista de Aluno
		ListAlunos lista = new ListAlunos(4);
		
		//criando um aluno
		Aluno aluno1 = new Aluno(1, "Eduardo", "1TDSB");
		
		System.out.println("Matrícula: " + aluno1.getMatricula());
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Turma: " + aluno1.getTurma());
		System.out.println("Média: " + aluno1.getMedia());
		aluno1.setMedia(9);
		System.out.println("===================================");
		System.out.println(aluno1.toString());
		
		Aluno aluno2 = new Aluno(2, "Lucas", "1TDSB");
		Aluno aluno3 = new Aluno(3, "Kaian", "1TDSB");
		Aluno aluno4 = new Aluno(); // chamada para o construtor vazio
		
		//inserindo os objetos aluno (1,2,3 e 4) na lista
		lista.inserir(aluno1);
		lista.inserir(aluno2);
		lista.inserir(aluno3);
		lista.inserir(aluno4);
		
		//listar os elementos da lista
		lista.listar();
	}
}
