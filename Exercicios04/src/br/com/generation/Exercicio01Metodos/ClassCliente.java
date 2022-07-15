package br.com.generation.Exercicio01Metodos;

// 1) Crie uma classe cliente e apresente os atributos e métodos referentes
// esta classe, em seguida crie um objeto cliente, defina as instancias deste
// objeto e apresente as informações deste objeto no console.

public class ClassCliente {

	private String nome;
	private String sobrenome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public static void cadastrado() {
	System.out.println("Clientes cadastrados: ");
	}
}
