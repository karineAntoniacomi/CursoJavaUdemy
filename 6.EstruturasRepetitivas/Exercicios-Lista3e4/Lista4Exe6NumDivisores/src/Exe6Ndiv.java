/* Ler um número inteiro N e calcular todos os seus divisores. */

import java.util.Scanner;

public class Exe6Ndiv {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		// 6 -> 6 = 1, 2 = 3, 3 = 2
		for (int i = n; i >= 1; i--) {
			if(n % i == 0){
				System.out.println("Divisores de "+n+" = "+i+ "  ("+n+"/"+i+" = "+n/i+")");			
			}
		}		
		sc.close();
	}
}
