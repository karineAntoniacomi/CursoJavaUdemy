/* Fazer um programa para ler quatro valores inteiros A, B, C e D. 
 * A seguir, calcule e mostre a diferença do produto de A e B pelo 
 * produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

import java.util.Scanner;

public class Exe3DifProd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//declarando as variáveis antes de usá-las
		int A, B, C, D;
		
		System.out.println("Digite 4 valores inteiros: ");		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		//declarando a variável diretamente
		int diferenca = A * B - C * D;
		
		System.out.println("A diferenca do produto de A e B "
				+ "pelo produto de C e D = " + diferenca);
	
		sc.close();
	}

}
