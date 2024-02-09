package application;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler os valores da largura e altura de um ret�ngulo.
 * Em seguida, mostrar na tela o valor de sua �rea, per�metro e diagonal.
 * Usar uma classe como mostrado no projeto ao lado.*/

public class Program {
	public static void main(String[] args) {
        
		Locale.setDefault(Locale.US);
		
        Scanner sc = new Scanner(System.in);
	        
        // Instanciando novo objeto do tipo Rectangle
        Rectangle rect = new Rectangle();
        
        System.out.println("Digite a largura e altura do ret�ngulo: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();
        
        System.out.printf("�REA = %.2f%n", rect.area());
        System.out.printf("PER�METERO = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
        sc.close();
	}
}
		
