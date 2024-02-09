package application;

import java.util.Locale;
import java.util.Scanner;

// Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
// - Imprimir todos os elementos do vetor
// - Mostrar na tela a soma e a média dos elementos do vetor

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voçê vai digitar? ");
		int n = sc.nextInt();
		int vet[] = new int[n];
		int soma = 0;
		double media = 0.0;
		
		for( int i = 0; i < n; i++ ) {
			sc.nextLine();
			System.out.printf("Digite o %do numero: ", i+1);
			vet[i] = sc.nextInt();
		}
		
		System.out.printf("\nVALORES = ");
		for( int i = 0; i < n; i++ ) {
			System.out.printf("%d ", vet[i]);
		}
		
		for( int i = 0; i < n; i++ ) {					
			soma += vet[i];
		}
							
		media = soma / n;
		
		System.out.printf("\nSOMA = %d ", soma);
		System.out.printf("\nMEDIA = %.2f ", media);
		
		sc.close();
	}
}
