package application;

import java.util.Locale;
import java.util.Scanner;

// Faça um programa que leia um número inteiro positivo N (máximo = 10) e 
// depois N números inteiros e armazene-os em um vetor. Em seguida, mostrar
// na tela todos os números negativos lidos.

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("Quantos numeros voce vai digitar? ");
			n = sc.nextInt(); 
		} while (n < 1 || n > 10);
		
		int[] vetor = new int[n];
		
		for( int i = 0; i < n; i++ ) {
			sc.nextLine();
			System.out.printf("\nDigite o %do número: ", i+1);
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nNúmeros inteiros negativos lidos: ");
		for( int i = 0; i < n; i++ ) {
			if(vetor[i] <= 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}
		
		sc.close();
	}
}
