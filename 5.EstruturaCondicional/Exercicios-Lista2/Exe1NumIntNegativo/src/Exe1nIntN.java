import java.util.Scanner;

/* Fazer um programa para ler um n�mero inteiro, 
 * e depois dizer se este n�mero � negativo ou n�o. */

public class Exe1nIntN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Digite um n�mero inteiro: ");
		num = sc.nextInt();
		
//		if(num < 0) {
//			System.out.println("O n�mero " + num + " � negativo!");
//		} else {
//			System.out.println("O n�mero " + num + " � positivo!");			
//		}
		
//    IF acima com condicional tern�rio
		System.out.println("O n�mero " + (num < 0 ? num + " � negativo!" 
				: num + " � positivo!"));
		sc.close();	
	}		
}

