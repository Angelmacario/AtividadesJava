package br.com.generation.Exercicio02Metodos;

public class GeradorAviao {

	public static void main(String[] args) {
		
		ClassAviao destino = new ClassAviao(); // aqui eu coloco a class que eu criei, vai ser tipo o scanner, para ler as informa��es que eu coloquei
		
		destino.setPiloto("Rafael");
		destino.setIda("S�o Paulo");
		destino.setVolta("Maranh�o");
		
		destino.cadastrado();
		System.out.println(destino.getPiloto());
		System.out.println(destino.getIda());
		System.out.println(destino.getVolta());
		
		//set : aqui eu coloco o valor na minha vari�vel
		
		//get : aqui eu trago a informa��o que coloquei anteriormente
		
		

	}

}
