package br.com.generation.Exercicios02;

import java.util.Scanner;

public class Exerc05 {
		// Exerc�cio 05
		/* Crie um programa que leia um n�mero do teclado at� que encontre um
		n�mero igual a zero. No final, mostre a soma dos n�meros
		digitados.(DO...WHILE) */

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			int numero, soma = 0;
			
			do {
				
				System.out.println("Digite um n�mero: ");
				numero = input.nextInt();
				soma += numero;
				
			} while(numero != 0);
			
			System.out.println("Programa finalizado.");
			System.out.println("A soma dos n�meros digitados �: " + soma);
			
			input.close();

		}

	}