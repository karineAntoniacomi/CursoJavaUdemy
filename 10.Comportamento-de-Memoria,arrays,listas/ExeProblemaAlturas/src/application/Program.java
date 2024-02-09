package application;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
// Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem 
// de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0; 
		double soma = 0.0;
		int count = 0;
		double porcentagem = 0.0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();

		// 3 vetores para guardar os 3 dados 
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n]; 
		
		for(int i = 0; i < n; i++) {
			// System.out.printf("Dados da %da pessoa: \n", i+1);		
			System.out.println("\nDados da " + (i+1)+ "a pessoa: ");	
			System.out.print("Nome: ");
			// pega vetor de nomes na posição i
			nomes[i] = sc.next();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		// Soma de alturas - acumula na variavel soma todas as alturas
		for(int i = 0; i < n; i++) {
			soma += alturas[i];
		}
		
		double mediaAlturas = soma / n;
		
		System.out.printf("\nAltura média: %.2f%n", mediaAlturas);
		
		// Porcentagem de pessoas com menos de 16 
		// soma pessoas com essa idade e aplica regra de 3
		for(int i = 0; i < n; i++) {
			if(idades[i] < 16) {
				// count = count + 1;
				count++;
			}
		}
		
		// 100.0 garante que o resultado será double, pois n é int
		 porcentagem = count * 100.0 / n;
		
		// %% garante que o % irá aparecer após o número
		System.out.printf("\nPessoas com menos de 16 anos: %.1f%%%n", porcentagem);
		
		// Imprime nome das pessos com menos de 16
		for(int i = 0; i < n; i++) {
			if(idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}
}
