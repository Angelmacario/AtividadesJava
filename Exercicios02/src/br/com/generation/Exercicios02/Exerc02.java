package br.com.generation.Exercicios02;

import java.util.Scanner;

public class Exerc02 {
	
	// Exerc�cio 02
	/* Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR) */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero = 0, contador, contadorPar = 0, contadorImpar = 0;
		
		for(contador = 0; contador < 10; contador++) {
			System.out.println("Digite um n�mero inteiro: ");
			numero = input.nextInt();
			
			if(numero % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}
		}
		
		System.out.println("Voc� digitou " + contadorPar + " n�meros pares e " + contadorImpar + " n�meros �mpares.");
		
		input.close();
	}
}