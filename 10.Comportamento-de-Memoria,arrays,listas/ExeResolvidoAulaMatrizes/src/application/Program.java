package application;

import java.util.Scanner;

/* Fazer um programa para ler um número inteiro N
 * e uma matriz de ordem N contendo números inteiros.
 * Em seguinda, mostrar a diagonal principal e a 
 * quantidade de valores negativos da matriz. */

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		// elementos da matriz - instância matriz na memória
		int[][] mat = new int[n][n];
		
		// for que percorre as linhas - leitura da matriz
		for(int i = 0; i < mat.length; i++) {
			// for que percorre as colunas
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// Mostra a diagonal principal pegando os 
		// elementos que estão na mesma linha e coluna
		System.out.println("Main diagonal:");
		for(int i = 0; i < n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		// Conta a quantidade de números negativos
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if (mat[i][j] < 0) {
					count ++;
				}
			}
		}
		System.out.println("\nNegative numbers = " + count);
		
		sc.close();
	}	
}
