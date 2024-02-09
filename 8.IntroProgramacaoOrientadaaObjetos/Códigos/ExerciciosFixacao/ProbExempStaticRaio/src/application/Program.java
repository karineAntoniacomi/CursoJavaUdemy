package application;

/* Fazer um programa para ler um valor numérico qualquer, e 
 * mostrar quanto seria o valor de uma circunferência e do
 * volume de uma esfera para um raio daquele valor. Informar 
 * também o valor de PI com duas casas decimais. */

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		// Dentro de um método estático você não pode chamar 
		// membros de instância da mesma classe.

		sc.close();
	}
}
