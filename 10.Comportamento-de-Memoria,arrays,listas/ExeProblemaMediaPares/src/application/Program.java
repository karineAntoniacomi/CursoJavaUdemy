package application;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar 
// na tela a média aritmética somente dos números pares lidos, com uma casa decimal. 
// Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);

		int n, soma = 0, count = 0;
		double media = 0.0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();	
		}
		
		// verifica números pares
		for(int i = 0; i < n; i++) {
			if(vetor[i] % 2 == 0) {
				soma += vetor[i];	
				count++;
			} 
		}
		
		if(soma != 0) {
			media = soma / count;
			System.out.printf("MÉDIA DOS PARES = %.1f", media);
		} else {
			System.out.print("NENHUM NÚMERO PAR");
		}
		
		sc.close();
	}
}
