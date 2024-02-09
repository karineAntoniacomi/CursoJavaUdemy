package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		

		System.out.println("Digite a quantidade de produtos: ");
		int n = sc.nextInt();  // Usar o Length ao invéz da variável n
		
		// Criando um vetor do tipo referência de produtos com n elementos representados por uma classe
		Product[] vect = new Product[n];
		
		System.out.println("Digite o nome e preço dos produtos: ");
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();   // Para consumir a quebra de linha pendente do nextInt acima
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			// Instanciar um novo produto com name e price
			// posição i do vetor apontará para esse novo produto
			vect[i] = new Product(name, price);
		}
		// Soma dos preços
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			// Acessando vetor na posição i, e pegando somente o preço do objeto
			sum += vect[i].getPrice();
		}
		// Média
		double avg = sum / vect.length;
		
		System.out.printf("Average price = %.2f", avg);
		
		sc.close();
	}
}
