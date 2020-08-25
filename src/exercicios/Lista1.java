package exercicios;

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
