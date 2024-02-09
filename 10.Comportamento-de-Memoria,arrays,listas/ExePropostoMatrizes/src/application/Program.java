package application;

import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler dois números inteiros M e N, 
 * e depois ler uma matriz de M linhas por N colunas contendo
 * números inteiros, podendo haver repetições. Em seguida, ler 
 * um número inteiro X que pertence à matriz. Para cada 
 * ocorrência de X, mostrar os valores à esquerda, acima, à 
 * direita e abaixo de X, quando houver, conforme exemplo.*/
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o número de linhas e colunas da matriz:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		// elementos da matriz - instância matriz na memória
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// Lê número que pertence a matriz
		System.out.println("Digite um número da matriz:");
		int x = sc.nextInt();
		
		// Posição do elemento x na matriz
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + ","+ j + ":");	
					// Para cada ocorrência de X, mostrar os valores à 
					// esquerda, acima, à direita e abaixo de X
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);						
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}		
		sc.close();
	}
}
