package application;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um conjunto de nomes de pessoas 
// e suas respectivas idades. Os nomes devem ser armazenados 
// em um vetor, e as idades em um outro vetor. Depois, mostrar 
// na tela o nome da pessoa mais velha.

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);

		int n, maiorIdade, posicaoMaior;
		
		System.out.print("Quantas pessoas você vai digitar? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:", i+1);
			System.out.print("\nNome: ");
			nomes[i] = sc.next();			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		// armazena array idades na posição 0 ou controle
		maiorIdade = idades[0];
		// armazena o número da posição do array
		posicaoMaior = 0;
		
		// procura pessoa mais velha começando pela posição 1 do array
		for(int i = 1; i < n; i++) {
			// compara a posição i do array com a de controle
			if(idades[i] > maiorIdade) { 
				// se for maior troca o valor
				maiorIdade = idades[i];
				// troca o número da posição do array
				posicaoMaior = i;
			}
		}

		System.out.printf("PESSOA MAIS VELHA: %s", nomes[posicaoMaior]);
		
		sc.close();
	}
}
