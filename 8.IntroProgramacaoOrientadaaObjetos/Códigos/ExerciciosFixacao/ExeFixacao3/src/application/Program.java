package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

/* Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três 
 * trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). 
 * Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está
 * aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o 
 * aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe
 * Student para resolver este problema. */

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student estudante = new Student();
		
		System.out.println("Name of the Student: ");
		estudante.name = sc.nextLine();
		System.out.println("Grade 1 (max 30 points): ");
		estudante.grade1 = sc.nextDouble();
		System.out.println("Grade 2 (max 35 points): ");
		estudante.grade2 = sc.nextDouble();
		System.out.println("Grade 3 (max 35 points): ");
		estudante.grade3 = sc.nextDouble();
		
		System.out.printf("\nFinal grade of the student: %.2f", estudante.finalGrade());
		
		if(estudante.finalGrade() < 60.0) {
			System.out.println("\nFAILED");
			System.out.printf("\nMISSING %.2f POINTS%n", estudante.missingPoints());
		}
		else {
			System.out.println("\nPASS");
		}
		
		sc.close();
	} 
}
