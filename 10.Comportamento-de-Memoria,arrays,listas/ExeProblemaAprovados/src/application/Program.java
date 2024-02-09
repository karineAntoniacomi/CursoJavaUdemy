package application;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um conjunto de N nomes de alunos, bem como 
// as notas que eles tiraram no 1º e 2º semestres. Cada uma dessas 
// informações deve ser armazenada em um vetor. Depois, imprimir os nomes 
// dos alunos aprovados, considerando aprovados aqueles cuja média das 
// notas seja maior ou igual a 6.0 (seis).

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media = 0;
		
		System.out.print("Quantos alunos serão digitados? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n];
		double[] semestre1 = new double[n];
		double[] semestre2 = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i+1);
			sc.nextLine();
			nomes[i] = sc.nextLine();
			semestre1[i] = sc.nextDouble();
			semestre2[i] = sc.nextDouble();
		}
				
		// média de notas maior ou igual a 6.0 
		System.out.println("Alunos aprovados:");

		for(int i = 0; i < n; i++) {
			media = (semestre1[i] + semestre2[i]) / 2;
			if(media >= 6.0) {
				System.out.printf("%s\n", nomes[i]);
			}
		}
		
		sc.close();
	}
}
