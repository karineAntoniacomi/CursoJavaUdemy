import java.util.Scanner;

/* Fazer um programa para ler um número inteiro, 
 * e depois dizer se este número é negativo ou não. */

public class Exe1nIntN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		
//		if(num < 0) {
//			System.out.println("O número " + num + " é negativo!");
//		} else {
//			System.out.println("O número " + num + " é positivo!");			
//		}
		
//    IF acima com condicional ternário
		System.out.println("O número " + (num < 0 ? num + " é negativo!" 
				: num + " é positivo!"));
		sc.close();	
	}		
}

