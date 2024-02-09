package application;

import java.util.Locale;
import java.util.Scanner;

// Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 10) e 
// depois N n�meros inteiros e armazene-os em um vetor. Em seguida, mostrar
// na tela todos os n�meros negativos lidos.

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
			System.out.printf("\nDigite o %do n�mero: ", i+1);
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nN�meros inteiros negativos lidos: ");
		for( int i = 0; i < n; i++ ) {
			if(vetor[i] <= 0) {
				System.out.printf("%d\n", vetor[i]);
			}
		}
		
		sc.close();
	}
}
