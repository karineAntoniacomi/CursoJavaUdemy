package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//instancia de produtc com atributos vazios - iniciiados com null ou zero, opcional
		Product p = new Product(); 
		
		/*
		System.out.println(product.name);
		System.out.println(product.price);
		System.out.println(product.quantity);
		*/
		
		//solucao para nao iniciar vazio é utilizar construtor
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		//agora quhá o construtor sobrrecarregado que nao tem quantity 
		//como oatributo, esta parte é opicional
		//System.out.print("Quantity in stock: ");
		//int quantity = sc.nextInt();
		
		//so agora instancia product, para nao haver produto vazio		
		//agora na chamada do constutor, podem ter 2 arugmentos apenas
		Product product = new Product(name, price);
		//Product product = new Product(name, price, quantity);
		
		//agora, para fazer um acesso direto aos atributos privados, é necessário
		//acrescentar um método que permitiá esse aceso de alteração - get e set
		product.setName("Computer");
		
		
		//acessando o atributo name com metodo getName
		System.out.println("Upadated name: " + product.getName());
		
		
		//também nao é mais possivel acessar os atributos desta forma
		//System.out.println("Upadated name: " + product.name);
		
		//não é mais possível acessar os atributos desta forma
		//product.name = "Computador;"
		
		//alterando preço do produto
		product.setPrice(1200.00);
		//acessando preço do produto
		System.out.println("Update price: " + product.getPrice());
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		
		//e agora o quantity precisa ser declarado o tipo
		int quantity = sc.nextInt();
		//quantity = sc.nextInt();
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