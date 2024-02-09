import java.util.Scanner;

/* Fazer um programa para ler um número inteiro
 * e dizer se este número é par ou ímpar. */

public class Exe2nPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		double numInt = 0;
		
		System.out.println("Digite um número inteiro: ");
		double numInt = sc.nextInt();
		
//		if(numInt % 2 == 0) {
//			System.out.println("O número " + numInt + " é par!");
//		}else{
//			System.out.println("O número " + numInt + " é ímpar!");
//		}
		
		// Utilizando if ternário
		System.out.println("O número " + (numInt % 2 == 0 ? numInt + 
				" é par!" : + numInt + " é ímpar!"));
		
		sc.close();	
	}
}
