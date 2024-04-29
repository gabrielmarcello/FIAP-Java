package Aula07_array;

public class Aluno {
	//atributos
	private int matricula;
	private String nome;
	private String turma;
	private float media = 0;
	
	//construtor vazio
	public Aluno() {
		System.out.println("Construtor vazio - objeto Aluno criado!");
	}

	//construtor creio - parametrizado
	public Aluno(int matricula, String nome, String turma) {
		System.out.println("Construtor cheio - objeto Aluno criado!");
		this.matricula = matricula;
		this.nome = nome;
		this.turma = turma;
		this.media = media;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	// método toString (mostrar os dados do objeto Aluno)
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", turma=" + turma + ", media=" + media + "]";
	}
}
