package application;

import java.util.Locale;
import java.util.Scanner;

// Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em seguida, mostrar na tela
// o maior n�mero do vetor (supor n�o haver empates). Mostrar tamb�m a posi��o do maior elemento,
// considerando a primeira posi��o como 0 (zero).

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posMaior;
		double maior;
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		n = sc.nextInt();
		
		// armazena os n�meros em um vetor
		double[] vetor = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = sc.nextDouble();
		}

		maior = vetor[0];
		posMaior = 0;
		
		for(int i = 0; i < n; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posMaior = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f\n", maior);
		
		System.out.printf("POSI��O DO MAIOR VALOR = %d\n", posMaior);
		
		sc.close();
	}
}
