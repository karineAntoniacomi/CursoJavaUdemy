package application;

import java.util.Locale;
import java.util.Scanner;

//importa a classe do pacote entities 
import entities.Triangle;

public class Program {
	public static void main(String[] args) {	
		
		// PROGRAMA COM ORIENTA��O A OBJETOS PARA CALCULAR �REA DE MEDIDAS DE UM TRI�NGULO
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Criando as vari�veis do tipo Triangle
		Triangle x, y;
		
		// Para usar o objeto Triangle (para que exista) deve-se instanciar (criar) o objeto
		// vari�vel composta do tipo triangle para representar cada tri�ngulo
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		// Para ler um n�mero inteiro e guardar no atributo a do objeto x = x.a
		x.a = sc.nextDouble();  // x.a acessa o atributo a
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		// Calculo da �rea dos triangulos - acessando cada um dos atributos do objeto x
		// double p = (x.a + x.b + x.c) / 2.0;
		// double areaX = Math.sqrt(p *(p - x.a) * (p - x.b) * (p - x.c));
		
		// p = (y.a + y.b + y.c) / 2.0;
		// double areaY = Math.sqrt(p *(p - y.a) * (p - y.b) * (p - y.c));
		
		// TROCANDO A L�GICA ACIMA PELA CHAMADA DA FUN��O area DA CLASSE Triangle
		double areaX = x.area();		
		double areaY = y.area();
		
		System.out.printf("Triangle x area: %.4f%n", areaX);
		System.out.printf("Triangle y area: %.4f\n", areaY);
		
		// Verifica qual tri�ngulo tem maior �rea
		
		if(areaX > areaY) {
			System.out.printf("Larger area = X");
		}
		else {
			System.out.printf("Larger area = Y");
		}
		sc.close();
	}
}