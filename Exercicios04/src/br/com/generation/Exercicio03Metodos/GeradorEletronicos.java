package br.com.generation.Exercicio03Metodos;

public class GeradorEletronicos {

	public static void main(String[] args) { //main: é so no que vai executar as classes
		
		ClassEletronicos eletronicos = new ClassEletronicos();
		
		eletronicos.setNome("Televisão");
		eletronicos.setMarca("Samsung");
		eletronicos.setAno(2022);
		
		eletronicos.cadastrado();
		System.out.println(eletronicos.getNome());
		System.out.println(eletronicos.getMarca());
		System.out.println(eletronicos.getAno());
	}

}
