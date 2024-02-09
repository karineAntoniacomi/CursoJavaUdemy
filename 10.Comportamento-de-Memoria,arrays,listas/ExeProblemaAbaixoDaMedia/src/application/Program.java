package application;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um n�mero inteiro N e depois um 
// vetor de N n�meros reais. Em seguida, mostrar na tela a m�dia 
// aritm�tica de todos elementos com tr�s casas decimais. Depois 
// mostrar todos os elementos do vetor que estejam abaixo da m�dia, 
// com uma casa decimal cada.

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		double soma, media;

		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = sc.nextDouble();
		}

		soma = 0.0;
		// m�dia aritm�tica dos elementos com 3 casas decimais
		for (int i = 0; i < n; i++) {
			if (vetor[i] >= 0.0) {
				soma += vetor[i];
			} 
		}
		
		media = soma / n;
		
		System.out.printf("\nM�DIA DO VETOR = %.3f%n", media);
		
		// Elementos do vetor abaixo da m�dia
		System.out.println("ELEMENTOS ABAIXO DA M�DIA: ");
		for (int i = 0; i < n; i++) {
			if(vetor[i] < media) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}

		sc.close();
	}
}
