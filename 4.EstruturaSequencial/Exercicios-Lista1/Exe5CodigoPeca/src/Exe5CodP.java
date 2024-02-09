import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 
2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

public class Exe5CodP {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//Peça 1
		System.out.println("Digite  código da peça 1: ");
		int cod1 = sc.nextInt();
		
		System.out.println("Digite o número de peças 1: ");
		Double numPeca1 = sc.nextDouble();

		System.out.println("Digite o valor de cada peça 1: ");
		Double valor1 = sc.nextDouble();

		//Peça 2
		System.out.println("\nDigite o código da peça 2: ");
		int cod2 = sc.nextInt();
		
		System.out.println("Digite o número de peças 2: ");
		Double numPeca2 = sc.nextDouble();

		System.out.println("Digite o valor de cada peça 2: ");
		Double valor2 = sc.nextDouble();

		// Cálculo de valor a ser pago		
		Double valorTotal = ((numPeca1 * valor1) + (numPeca2 * valor2));
		System.out.printf("\nO Valor a pagar: U$ %.2f", valorTotal);
		
		sc.close();
	}
}