package application;

import java.util.Locale;
import java.util.Scanner;


// Fa�a um programa que leia N n�meros inteiros e armazene-os em um vetor. Em seguida,
// mostre na tela todos os n�meros pares, e tamb�m a quantidade de n�meros pares.

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, cont;
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		n = sc.nextInt();
		
		// armazena os n�meros em um vetor
		int[] vetor = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nN�MEROS PARES:");
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
