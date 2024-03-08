package Aula2;

public class Aluno {
		
	//Atributos
	private String matricula;
	private String nome;
	private String cpf;
	private String curso;
	private float mediaGeral;
	
	//getters e setters
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String numMatricula) {
		matricula = numMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nomeAluno) {
		nome = nomeAluno;
	}
	
	public float getMediaGeral() {
		return mediaGeral;
	}
	
	public void setMediaGeral(float mediaGeral) {
		this.mediaGeral = mediaGeral;
	}
	
}
