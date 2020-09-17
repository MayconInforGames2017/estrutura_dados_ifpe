package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Lista1 {

	protected static long fatorial(int n) {

		if (n == 1)
			return 1;
		return n * fatorial(n - 1);

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("\n============== ");
			System.out.println("1 - Imprima a soma de todos os números pares de 1 a 1000: ");
			System.out.println("2 - Imprima a soma de todos os números impares de 1 a 1000: ");
			System.out.println("3 - Calcule e imprima o fatorial de 20: ");
			System.out.println("4 - Crie um array de inteiros contendo os vinte primeiros primos: ");
			System.out.println(
					"5 - Crie um array de inteiros contendo os dez primeiros números da sequência de Fibonacci: ");
			System.out.println(
					"6 - Crie um método que receba um array de inteiros e imprima o menor, o maior e a média dos valores");
			System.out.println(" 7 - Concatenação de um array de inteiros; ");
			System.out.println("0 - Sair");
			System.out.println("\n============== ");

			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				int somaNumPares = 0;
				for (int i = 2; i <= 1000; i += 2) {
					somaNumPares += i;
				}
				System.out.println("A soma dos números pares é: " + somaNumPares);
				break;
			case 2:
				int somaNumPrimos = 0;
				for (int i = 1; i <= 1000; i += 2) {
					somaNumPrimos += i;
				}
				System.out.println("A soma dos números primos é de: " + somaNumPrimos);
				break;
			case 3:
				// fatorial(20);
				System.out.println(fatorial(5));
				break;
			case 4:
				int arrayInteiros[] = new int[40];

				for (int i = 1; i <= arrayInteiros.length; i += 2) {
					System.out.print(i + "\t");
				}
				break;
			case 5:
				int a = 1;
				int b = 0;
				int aux = 0;
				for (int i = 0; i < 10; i++) {
					System.out.println(a);
					aux = a;
					a = a + b;
					b = aux;
				}
				break;

			case 6:
				Scanner ent = new Scanner(System.in);
				
				int[] arrayInteiro = new int[10];
				
				for(int i = 0; i < arrayInteiro.length; i++) {
					System.out.println("Entre com um valor na posição: " + (i+1));
					arrayInteiro[i] = ent.nextInt();
				}
				
				int menor = Integer.MAX_VALUE; 
				int maior = Integer.MIN_VALUE;
				double media = 0;
				for(int i = 0; i < arrayInteiro.length; i++) {
					 if (arrayInteiro[i] > maior) {
						 maior = arrayInteiro[i];
					 }
					 if (arrayInteiro[i] < menor) {
						 menor = arrayInteiro[i];
						 
					 }
				
					 media = maior / menor;
				}
				
				System.out.println();
				System.out.println("O maior número: " + maior);
				System.out.println("O menor número: " + menor);
				System.out.println("A média é: " + media);
				break;
				
			case 7:
				Scanner e = new Scanner(System.in);
				
				int[]array1 = new int[5];
				int[]array2 = new int[array1.length];
				int[]novoArray = new int[array1.length + array2.length];
				
				for (int i = 0; i < array1.length; i++) {
					System.out.println("Entre com um valor na posição: " + (i+1));
					array1[i] = e.nextInt();
				}
				
				for (int i = 0; i < array2.length; i++) {
					System.out.println("Entre com um valor na posição: " + (i+1));
					array2[i] = e.nextInt();
				
					novoArray[i] = array1[i] + array2[i];
				}
				
				for (int i = 0; i < array1.length; i++) {
					novoArray[i] = array1[i];
				}
				
				for (int i = 0; i < array2.length; i++) {
					novoArray[i] = array2[i];
				}
				
				System.out.println();
				System.out.print("Array 1 = ");
				for (int i = 0; i < array1.length; i++) {
					System.out.print(array1[i] + " ");
				}
				
				System.out.println();
				System.out.print("Array 2 = ");
				for (int i = 0; i < array2.length; i++) {
					System.out.print(array2[i] + " ");
				}
				
				System.out.println();
				System.out.print("Novo Array = ");
				for (int i = 0; i < novoArray.length; i++) {
					System.out.print(Arrays.toString(novoArray) + " ");
				}
				
				System.out.println();
				
				break;
				
			case 0:
				System.out.println("Obrigado por usar o Menu de estrutura de Dados");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		} while (opcao != 0);

	}

}
