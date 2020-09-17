package exercicios;

import java.util.Scanner;

public class Avaliacao {
	
	public static int somatorio(int num) {
		
		if (num == 1) {
			return 1;
		}
		return num + somatorio(num - 1);
	}
	
	public static int[][] somaMatriz(int[][] vetorA, int[][] vetorB) {
		
		int[][] vetorC = new int[vetorA.length][vetorB[0].length];
		
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB[i].length; j++) {
				vetorC[i][j] = vetorA[i][j] + vetorB[i][j];
			}
		}
		
		return vetorC;
	}

	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("Escolha uma op��o: ");
			System.out.println("\n============== ");
			System.out.println(" 1 - Quest�o 1 - Alternativas: ");
			System.out.println(" 2 - Quest�o 2 - Soma de matriz: ");
			System.out.println(" 3 - Quest�o 3 - Jogo de tabuleiro: ");
			System.out.println(" 4 - Quest�o 4 - Retorne a import�n�ia da an�lise da complexibilidade de algoritmos: ");
			System.out.println(" 5 - Quest�o 5 - Menu com o Significado dos algoritimos que tem complexidade: ");
			System.out.println(" 0 - Sair");
			System.out.println("\n============== ");

			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				
				System.out.println(somatorio(5));

				break;

			case 2:

				int[][] vetorA = {{5,4}, {0,2}, {3,5}};
				int[][] vetorB = {{0,-4}, {7,6}, {7,5}};
				
				
				int[][] vetorC = somaMatriz(vetorA, vetorB);
				
				System.out.println("A soma dos vetores �: " + vetorC[0][0]);
				
				break;

			case 3:

				break;

			case 4:

				break;

			case 5:

				break;

			case 0:

				break;
			default:
				System.out.println("Op��o inv�lida!");
				break;
			}
		} while (opcao != 0);

	}

}
