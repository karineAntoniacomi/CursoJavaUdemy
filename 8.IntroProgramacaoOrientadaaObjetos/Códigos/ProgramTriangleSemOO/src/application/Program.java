package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {	
		// PROGRAMA SEM ORIENTA��O A OBJETOS	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB,  xC, yA, yB, yC;

		// PROGRAMA PARA CALCULAR �REA DE MEDIDAS DE UM TRI�NGULO
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		// C�lculo da �rea dos triangulos
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p *(p - xA) * (p - xB) * (p - xC));

		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p *(p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle x area: %.4f%n", areaX);
		System.out.printf("Triangle y area: %.4f%n", areaY);
		
		// Verifica qual triangulo tem maior �rea		
		if(areaX > areaY) {
			System.out.println("Larger area Triangle X = "+areaX);
		}
		else {
			System.out.println("Larger area Triangle Y = "+areaY);
		}
		sc.close();
	}
}
