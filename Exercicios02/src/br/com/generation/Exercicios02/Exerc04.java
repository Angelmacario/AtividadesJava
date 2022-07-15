package br.com.generation.Exercicios02;

import java.util.Scanner;

public class Exerc04 {

		// Exerc�cio 04
		/* Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
		psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		- o n�mero de pessoas calmas;
		- o n�mero de mulheres nervosas;
		- o n�mero de homens agressivos;
		- o n�mero de outros calmos;
		- o n�mero de pessoas nervosas com mais de 40 anos;
		- o n�mero de pessoas calmas com menos de 18 anos. */

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			int numeroPessoas = 0, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0;
			int outrosCalmos = 0, nervosoMais40 = 0, calmoMenos18 = 0;
			
			while(numeroPessoas <= 6) {
				System.out.println("Digite sua idade: ");
				int idade = input.nextInt();
				
				System.out.println("Digite o n�mero correspondente ao sexo: 1 - Feminino, 2 - Masculino, 3 - Outros");
				int sexo = input.nextInt();
				
				System.out.println("Digite o n�mero correspondente � emo��o: 1 - Calmo(a), 2 - Nervoso(a), 3 - Agressivo(a)");
				int emocao = input.nextInt();
				
				numeroPessoas++;
				
				if (emocao == 1) {
					pessoasCalmas++;
				} 
				
				if (sexo == 1 && emocao == 2) {
					mulheresNervosas++;
				} 
				
				if (sexo == 2 && emocao == 3) {
					homensAgressivos++;
				}
				
				if (sexo == 3 && emocao == 1) {
					outrosCalmos++;
				}
				
				if (emocao == 2 && idade > 40) {
					nervosoMais40++;
				} 
				
				if (emocao == 1 && idade < 18) {
					calmoMenos18++;
				}
			}
			
			System.out.println("Question�rio finalizado.");
			System.out.println("O n�mero de pessoas calmas �: " + pessoasCalmas);
			System.out.println("O n�mero de mulheres nervosas �: " + mulheresNervosas);
			System.out.println("O n�mero de homens agressivos �: " + homensAgressivos);
			System.out.println("O n�mero de outros calmos �: " + outrosCalmos);
			System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: " + nervosoMais40);
			System.out.println("O n�mero de pessoas calmas com menos de 18 �: " + calmoMenos18);
			
			input.close();

		}

	}