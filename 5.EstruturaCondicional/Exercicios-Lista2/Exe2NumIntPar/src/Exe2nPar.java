import java.util.Scanner;

/* Fazer um programa para ler um n�mero inteiro
 * e dizer se este n�mero � par ou �mpar. */

public class Exe2nPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		double numInt = 0;
		
		System.out.println("Digite um n�mero inteiro: ");
		double numInt = sc.nextInt();
		
//		if(numInt % 2 == 0) {
//			System.out.println("O n�mero " + numInt + " � par!");
//		}else{
//			System.out.println("O n�mero " + numInt + " � �mpar!");
//		}
		
		// Utilizando if tern�rio
		System.out.println("O n�mero " + (numInt % 2 == 0 ? numInt + 
				" � par!" : + numInt + " � �mpar!"));
		
		sc.close();	
	}
}
