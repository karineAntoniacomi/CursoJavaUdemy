import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, 
o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 
2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago. */

public class Exe5CodP {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//Pe�a 1
		System.out.println("Digite �c�digo da pe�a 1: ");
		int cod1 = sc.nextInt();
		
		System.out.println("Digite o n�mero de pe�as 1: ");
		Double numPeca1 = sc.nextDouble();

		System.out.println("Digite o valor de cada pe�a 1: ");
		Double valor1 = sc.nextDouble();

		//Pe�a 2
		System.out.println("\nDigite o�c�digo da pe�a 2: ");
		int cod2 = sc.nextInt();
		
		System.out.println("Digite o n�mero de pe�as 2: ");
		Double numPeca2 = sc.nextDouble();

		System.out.println("Digite o valor de cada pe�a 2: ");
		Double valor2 = sc.nextDouble();

		// C�lculo de valor a ser pago		
		Double valorTotal = ((numPeca1 * valor1) + (numPeca2 * valor2));
		System.out.printf("\nO Valor a pagar: U$ %.2f", valorTotal);
		
		sc.close();
	}
}