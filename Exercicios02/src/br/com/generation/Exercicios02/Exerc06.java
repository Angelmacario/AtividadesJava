package br.com.generation.Exercicios02;

import java.util.Scanner;

public class Exerc06 {

		// Exerc�cio 06
		// Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		//final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		//0(zero).(DO...WHILE) */

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			int numero, multiploDeTres = 0, contador = -1;
			
			do {
				
				System.out.println("Digite um n�mero inteiro ou digite 0 para sair: " );
				numero = input.nextInt();
				
				if(numero % 3 == 0) {
					multiploDeTres += numero;
					contador++;
				}		
			} while(numero != 0);
			
			System.out.println("A m�dia dos n�meros m�ltiplos de tr�s �: " + (multiploDeTres / contador));
			
			input.close();
		}

	}