package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

/* Programa para ler os dados de N figuras (N fornecido 
 * pelo usuário), e depois mostrar as áreas destas figuras 
 * na mesma ordem em que foram digitadas. */

public class Program {
	public static void main(String args[]) {		
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);		

		// Ao instanciar, sempre usa-se o tipo 		
		// genérico/superclasse, p/ a lista aceitar 	
		// dados todos os tipos das subclasses		
		List<Shape> list = new ArrayList<>(); // lista instanciada vazia
		
		System.out.print("Enter the number of shapes: ");			
		int n = sc.nextInt();					
		
		// for que lê as figuras conforme opção do usuário			
		for(int i = 1; i <= n; i++) {			
			System.out.println("Shape #" + i + " data:");		
			System.out.print("Rectangle or Circle (r/c)? ");		
			char ch = sc.next().charAt(0);					
			System.out.print("Color (BLACK/BLUE/RED): ");
			
			// A palavra lida no input é convertida
			// p/ o tipo enumerado Color					
			Color color = Color.valueOf(sc.next());			
			
			if(ch == 'r') {						
				System.out.print("Width: ");			
				double width = sc.nextDouble();		
				System.out.print("Height: ");		
				double height = sc.nextDouble();	
				
				list.add(new Rectangle(color, width, height));	
		
			} else {						
				System.out.print("Radius: ");		
				double radius = sc.nextDouble();		
				list.add(new Circle(color, radius));	
			}	
		}				
		System.out.println("\nSHAPE AREAS:");			
		for(Shape shape : list) {					
			System.out.println(String.format("%.2f", shape.area()));	
		}		
		sc.close();	
	}
}
