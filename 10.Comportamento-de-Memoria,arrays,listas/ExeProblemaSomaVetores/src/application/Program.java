package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

//	Faça um programa para ler dois vetores A e B, contendo N 
//	elementos cada. Em seguida, gere um terceiro vetor C onde 
//	cada elemento de C é a soma dos elementos correspondentes 
//	de A e B. Imprima o vetor C gerado.
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];		

		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < n; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < n; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		// soma vetores
		System.out.println("VETOR RESULTANTE:");
		for(int i = 0; i < n; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.println(vetorC[i]);
		}

		sc.close();
	}
}
