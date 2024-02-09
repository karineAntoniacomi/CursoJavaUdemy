package application;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um conjunto de N nomes de alunos, bem como 
// as notas que eles tiraram no 1� e 2� semestres. Cada uma dessas 
// informa��es deve ser armazenada em um vetor. Depois, imprimir os nomes 
// dos alunos aprovados, considerando aprovados aqueles cuja m�dia das 
// notas seja maior ou igual a 6.0 (seis).

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media = 0;
		
		System.out.print("Quantos alunos ser�o digitados? ");
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
				
		// m�dia de notas maior ou igual a 6.0 
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
