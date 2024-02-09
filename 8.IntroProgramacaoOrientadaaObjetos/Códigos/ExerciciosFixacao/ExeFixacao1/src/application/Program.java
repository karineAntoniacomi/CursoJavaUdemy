package application;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler os valores da largura e altura de um retângulo.
 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
 * Usar uma classe como mostrado no projeto ao lado.*/

public class Program {
	public static void main(String[] args) {
        
		Locale.setDefault(Locale.US);
		
        Scanner sc = new Scanner(System.in);
	        
        // Instanciando novo objeto do tipo Rectangle
        Rectangle rect = new Rectangle();
        
        System.out.println("Digite a largura e altura do retângulo: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();
        
        System.out.printf("ÁREA = %.2f%n", rect.area());
        System.out.printf("PERÍMETERO = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
        sc.close();
	}
}
		
