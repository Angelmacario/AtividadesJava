package br.com.generation.Exercicio03Metodos;

	//3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	//referentes esta classe, em seguida crie um objeto produto eletr�nico,
	//defina as instancias deste objeto e apresente as informa��es deste objeto no console.

public class ClassEletronicos {
	
	private String nome;
	private String marca;
	private int ano;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;

	}
	public static void cadastrado() {
		System.out.println("Eletronicos cadastrados: ");

	}
}