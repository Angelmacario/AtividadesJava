package br.com.generation.Exercicios02;

public class Exerc01 {

	//Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
	//obtemos resto = 5. (FOR)
	
	public static void main(String[] args) {
	
		for(int i=1000; i < 2000; i++) { //O for � para atender aos "n�meros 1000 e 1999"
			
			if (i%11==5) { //a condi��o � para imprimir apenas os valores que, ao serem divididos por 11, deem 5 de resto
	                       //ent�o nesse caso eu j� coloco % dizendo "se 1006 for dividido e SOBRA 5" eu escrevo no console	
						   //if (se)
				
				System.out.println(i); // aqui leu apenas os n�meros que d�o sobras 5.
			}
		}

	}

}
