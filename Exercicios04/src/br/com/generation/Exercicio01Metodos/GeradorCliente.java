package br.com.generation.Exercicio01Metodos;

public class GeradorCliente {

	public static void main(String[] args) { //main: � so no que vai executar as classes
		
		ClassCliente pessoa = new ClassCliente();
		
		pessoa.setNome("Kenai");
		pessoa.setSobrenome("Macario");
		pessoa.setIdade(20);
		
		pessoa.cadastrado();
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getSobrenome());
		System.out.println(pessoa.getIdade());
		
		//set : aqui eu coloco o valor na minha vari�vel
		
		//get : aqui eu trago a informa��o que coloquei anteriormente
;
		
	}

}
