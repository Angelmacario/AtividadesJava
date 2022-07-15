package br.com.generation.Exercicio02Metodos;

// 1) Crie uma classe cliente e apresente os atributos e métodos referentes
// esta classe, em seguida crie um objeto cliente, defina as instancias deste
// objeto e apresente as informações deste objeto no console.

public class ClassAviao {
	
	private String piloto;
	private String ida;
	private String volta;
	
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public String getIda() {
		return ida;
	}
	public void setIda(String ida) {
		this.ida = ida;
	}
	public String getVolta() {
		return volta;
	}
	public void setVolta(String volta) {
		this.volta = volta;
	}
	
	public static void cadastrado() {
		System.out.println("Voos cadastrados: ");
	}

}
