package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

// Ler os dados de um pedido com N itens (N fornecido 
// pelo usuário). Depois, mostrar um sumário do pedido 
// conforme exemplo. Nota: o instante do pedido deve 
// ser o instante do sistema: new Date()

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		// Client Data
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();	
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
				
		// Order Data
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		// Função valueOf converte o string lido para o valor correspondente do Enum
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		// Instância Order associado ao cliente
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #"+ i +" item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String pName = sc.nextLine();			
			System.out.print("Product price: ");
			double pPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int pQuantity = sc.nextInt();
		
			Product product = new Product(pName, pPrice);
			
			// Intancia do Item de pedido associado ao produto
			OrderItem it = new OrderItem(pQuantity, pPrice, product);
			
			// Adiciona o OrderItem dentro da lista de items do Pedido
			order.addItem(it);
		}

		System.out.println(order);
		
		sc.close();
	}
}
