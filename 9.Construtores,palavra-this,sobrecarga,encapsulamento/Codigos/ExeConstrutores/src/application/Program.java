package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Instancia de produtc com atributos vazios - iniciados com null ou zero, opcional
		Product p = new Product(); 
		
		/*
		System.out.println(product.name);
		System.out.println(product.price);
		System.out.println(product.quantity);
		*/
		
		// Solucao para nao iniciar vazio é utilizar construtor
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		// Agora que há o construtor sobrrecarregado que nao tem quantity como atributo, 
		// esta parte é opcional. 
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
		
		// So agora instancia product, para nao haver produto vazio		
		// agora na chamada do construtor, podem ter 2 arugmentos apenas
		Product product = new Product(name, price);
		// Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		
		// O quantity precisa ter declarado o tipo
		int quantity = sc.nextInt();
		// quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}
}