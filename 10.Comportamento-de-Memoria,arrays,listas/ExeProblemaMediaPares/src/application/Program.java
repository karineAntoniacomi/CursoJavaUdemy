package application;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um vetor de N n�meros inteiros. Em seguida, mostrar 
// na tela a m�dia aritm�tica somente dos n�meros pares lidos, com uma casa decimal. 
// Se nenhum n�mero par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"

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
			System.out.print("Digite um n�mero: ");
			vetor[i] = sc.nextInt();	
		}
		
		// verifica n�meros pares
		for(int i = 0; i < n; i++) {
			if(vetor[i] % 2 == 0) {
				soma += vetor[i];	
				count++;
			} 
		}
		
		if(soma != 0) {
			media = soma / count;
			System.out.printf("M�DIA DOS PARES = %.1f", media);
		} else {
			System.out.print("NENHUM N�MERO PAR");
		}
		
		sc.close();
	}
}
