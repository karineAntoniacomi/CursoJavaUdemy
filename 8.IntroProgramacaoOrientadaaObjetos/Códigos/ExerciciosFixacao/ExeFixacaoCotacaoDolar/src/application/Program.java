package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

/* Fa�a um programa para ler a cota��o do d�lar, e depois um valor em 
 * d�lares a ser comprado por uma pessoa em reais. Informar quantos 
 * reais a pessoa vai pagar pelos d�lares, considerando ainda que a 
 * pessoa ter� que pagar 6% de IOF sobre o valor em d�lar. Criar uma 
 * classe CurrencyConverter para ser respons�vel pelos c�lculos. */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double cotacaoDolar;
		double valorCompra;
		
		System.out.println("Digite a cota��o atual do d�lar: ");
		cotacaoDolar = sc.nextDouble();
		
		System.out.println("Digite o valor em d�lares a ser comprado: ");
		valorCompra = sc.nextDouble();
		
		System.out.printf("Valor em reais a ser pago com IOF: %.2f", CurrencyConverter.dollarToReal(cotacaoDolar, valorCompra));
		
		sc.close();
	}
}
