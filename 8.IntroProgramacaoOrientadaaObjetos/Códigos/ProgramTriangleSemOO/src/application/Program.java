package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {	
		// PROGRAMA SEM ORIENTAÇÃO A OBJETOS	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB,  xC, yA, yB, yC;

		// PROGRAMA PARA CALCULAR ÁREA DE MEDIDAS DE UM TRIÂNGULO
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		// Cálculo da área dos triangulos
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p *(p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p *(p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle x area: %.4f%n", areaX);
		System.out.printf("Triangle y area: %.4f%n", areaY);
		
		// Verifica qual triangulo tem maior área		
		if(areaX > areaY) {
			System.out.println("Larger area Triangle X = "+areaX);
		}
		else {
			System.out.println("Larger area Triangle Y = "+areaY);
		}
		sc.close();
	}
}
