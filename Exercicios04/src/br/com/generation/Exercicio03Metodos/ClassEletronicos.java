package br.com.generation.Exercicio03Metodos;

	//3) Crie uma classe produto eletrônico e apresente os atributos e métodos
	//referentes esta classe, em seguida crie um objeto produto eletrônico,
	//defina as instancias deste objeto e apresente as informações deste objeto no console.

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