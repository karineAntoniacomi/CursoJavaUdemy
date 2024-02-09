/* Fazer um programa para ler quatro valores inteiros A, B, C e D. 
 * A seguir, calcule e mostre a diferen�a do produto de A e B pelo 
 * produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D). */

import java.util.Scanner;

public class Exe3DifProd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//declarando as vari�veis antes de us�-las
		int A, B, C, D;
		
		System.out.println("Digite 4 valores inteiros: ");		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		//declarando a vari�vel diretamente
		int diferenca = A * B - C * D;
		
		System.out.println("A diferenca do produto de A e B "
				+ "pelo produto de C e D = " + diferenca);
	
		sc.close();
	}

}
