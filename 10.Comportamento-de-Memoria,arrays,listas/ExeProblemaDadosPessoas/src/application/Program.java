package application;

import java.util.Locale;
import java.util.Scanner;

// Tem-se um conjunto de dados contendo a altura e o 
// gênero (M, F) de N pessoas. Fazer um programa que 
// calcule e escreva a maior e a menor altura do grupo,
// a média de altura das mulheres, e o número de homens.

public class Program {
	public static void main(String[] args) {		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, numMulheres = 0, numHomens = 0;
		double menorAltura, maiorAltura, mediaAlturas, somaAlturasFem = 0.0;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		double[] alturas = new double[n];
		char[] generos = new char[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			alturas[i] = sc.nextDouble();
			
			System.out.printf("Genero da %da pessoa: ", i+1);
			generos[i] = sc.next().charAt(0);
		}
		
		menorAltura = alturas[0];
		maiorAltura = alturas[0];
		
	    for (int i = 1; i < n; i++) {
	        if (alturas[i] > maiorAltura) {
	            maiorAltura = alturas[i];
	        }
	        if (alturas[i] < menorAltura) {
	            menorAltura = alturas[i];
	        }
	    }
		
		// média altura mulheres
		for(int i = 0; i < n; i++) {
			 
			 if(generos[i] == 'F') {
				 numMulheres++;
				 somaAlturasFem = somaAlturasFem + alturas[i];
			 } else {
				 numHomens++;
			 }
		}

		mediaAlturas = somaAlturasFem / numMulheres;	
			
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		
		System.out.printf("Média das alturas das mulheres = %.2f\n", mediaAlturas);
		
		System.out.printf("Número de homens = %d\n", numHomens);
		
		sc.close();

	}
}
