package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

/* Faça um programa para ler a cotação do dólar, e depois um valor em 
 * dólares a ser comprado por uma pessoa em reais. Informar quantos 
 * reais a pessoa vai pagar pelos dólares, considerando ainda que a 
 * pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma 
 * classe CurrencyConverter para ser responsável pelos cálculos. */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double cotacaoDolar;
		double valorCompra;
		
		System.out.println("Digite a cotação atual do dólar: ");
		cotacaoDolar = sc.nextDouble();
		
		System.out.println("Digite o valor em dólares a ser comprado: ");
		valorCompra = sc.nextDouble();
		
		System.out.printf("Valor em reais a ser pago com IOF: %.2f", CurrencyConverter.dollarToReal(cotacaoDolar, valorCompra));
		
		sc.close();
	}
}
