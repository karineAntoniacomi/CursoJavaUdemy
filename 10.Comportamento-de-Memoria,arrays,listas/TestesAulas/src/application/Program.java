package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		

//		int p;
//		//variáveis de tipos primitivos não pode m receber valor null
//		//apenas variaveis do tipo referencia (classe) podem receber valor null
//		p = 0;
//		
//		System.out.println(p);

		// -------------- VETORES ------------------- //
		System.out.println("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += vect[i]; //percorre o vetor e acumula a soma de todos na variavel sum
		}
		double avg = sum / n; //variavel que guarda a media
		
		System.out.printf("Average height: %.2f", avg);
		
		sc.close();
	}
}
