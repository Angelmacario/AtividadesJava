package br.com.generation.Exercicios02;

import java.util.Scanner;

public class Exerc03 {

		// Exerc�cio 03 Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de
		// 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		// idade for =99. (WHILE)

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			int idade = 0, idadeMenos21 = 0, idadeMais50 = 0;
			
			while(idade < 99) {
				
				System.out.println("Insira uma idade: ");
				idade = input.nextInt();
				
				if (idade < 21) {
					idadeMenos21++;
				} else if (idade > 50) {
					idadeMais50++;
				}
			}
			
			System.out.println("Programa finalizado.");
			System.out.println("O total de pessoas com menos de 21 anos �: " + idadeMenos21);
			System.out.println("O total de pessoas com mais de 50 anos �: " + idadeMais50);
			
			input.close();

		}

	}