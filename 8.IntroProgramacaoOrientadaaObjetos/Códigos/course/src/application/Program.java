package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

// Fazer um programa para ler os dados de um produto em estoque (nome, preço
// e quantidade no estoque). Em seguida:
// • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor 
// total no estoque)
// • Realizar uma entrada no estoque e mostrar novamente os dados do produto
// • Realizar uma saída no estoque e mostrar novamente os dados do produto
// Para resolver este problema, você deve criar uma CLASSE para a entidade Produto.

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine(); 
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("\nProduct data: " + product);
		
		System.out.println("\nEnter the number of products to be added in stock:");
		int quantityAdd = sc.nextInt();		
		product.addProducts(quantityAdd);
		
		System.out.println("Updated data: " + product);
		
		System.out.println("\nEnter the number of products to be removed from stock:");
		int quantityRemove = sc.nextInt();
		product.removeProducts(quantityRemove);

		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}
