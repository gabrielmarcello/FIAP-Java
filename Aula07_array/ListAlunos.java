package Aula07_array;

public class ListAlunos {
	
	//atributos
	private Aluno[] alunos; //array de objetos do tipo Aluno
	private int i = 0; //variável de controle do índice do array
	
	//construtor
	public ListAlunos(int qtde) {
		System.out.println("*-* Lista criada! *-*");
		//instanciando o array (alunos)
		alunos = new Aluno[qtde];
	}
	
	//inserir (um aluno na lista de alunos)
	public String inserir(Aluno aluno) {
		if(aluno != null) {
			//adicionar o aluno no array de alunos
			alunos[i] = aluno;
			i++;
			return "Aluno inserido na lista!";
		}
		else {
			return "Aluno NÃO inserido!";
		}
	}
	
	public void listar() {
		for(int i= 0; i<alunos.length; i++) {
			System.out.println(alunos[i].toString());
		}
	}
	
}
