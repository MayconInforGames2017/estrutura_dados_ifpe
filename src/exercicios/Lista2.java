package exercicios;

import java.util.Scanner;

public class Lista2 {

	protected static long fatorial(int n) {

		if (n == 1)
			return 1;
		return n * fatorial(n - 1);

	}

	public static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static int fibonacciMatriz(int linha, int col, int n) {

		return linha * n + col;

	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("\n============== ");
			System.out.println("1 - Faça um programa que construa e imprima a segunte matriz de inteiros: ");
			System.out.println(
					"2 - Faça um método que receba um inteiro e crie uma matriz NxN que contenha os números de 1 a n2 em ordem crescente: ");
			System.out.println(
					"3 - Faça um método que receba um inteiro N e crie uma matriz NxN que contenha os primeiros números n2 números da sequencia de Fibonacci : ");
			System.out.println("0 - Sair");
			System.out.println("\n============== ");

			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				break;
			case 2:

				break;

			case 3:
				int n = 3;
				int posFib;

				int[][] matrizFib = new int[n][n];

				for (int linha = 0; linha < matrizFib.length; linha++) {
					for (int col = 0; col < matrizFib.length; col++) {
						posFib = fibonacciMatriz(linha, col, n);
						int nfib = posFib = fib(posFib);
						matrizFib[linha][col] = nfib;
					}
				}

				for (int linha = 0; linha < matrizFib.length; linha++) {
					for (int col = 0; col < matrizFib.length; col++) {
						System.out.print(matrizFib[linha][col] + "\t");
					}
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
