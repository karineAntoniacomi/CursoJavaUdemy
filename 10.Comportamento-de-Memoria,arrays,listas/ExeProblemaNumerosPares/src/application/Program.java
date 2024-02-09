package application;

import java.util.Locale;
import java.util.Scanner;


// Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida,
// mostre na tela todos os números pares, e também a quantidade de números pares.

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, cont;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		// armazena os números em um vetor
		int[] vetor = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nNÚMEROS PARES:");
		cont = 0;
		for(int i = 0; i < n; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
				cont++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d", cont);
		
		sc.close();
	}
}
