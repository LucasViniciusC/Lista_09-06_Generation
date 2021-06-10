package br.com.exercicios;

public class Animal {

	private String Nome;
	private int Idade;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		this.Idade = idade;
	}

	public void emitirSom() {
		System.out.println("O animal tá fazendo som");
	}

	public void correr() {
		System.out.println("O animal está se locomovendo");
	}
}
