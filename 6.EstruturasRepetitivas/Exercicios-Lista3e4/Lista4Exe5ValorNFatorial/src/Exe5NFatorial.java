/* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1. */

import java.util.Scanner;

public class Exe5NFatorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int fatorial = 1;
		
		System.out.println("\nDigite um número: ");
		n = sc.nextInt();
		
		//fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		//fatorial de 4 = 4 * (4-1) * (4-2) * (4-3) * (4-4) = 4 * 3 * 2 * 1 = 24 
		
		for(int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}
		System.out.println("Fatorial = "+fatorial);
		
		sc.close();
	}
}
