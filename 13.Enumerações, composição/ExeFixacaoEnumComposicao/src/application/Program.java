package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.enums.OrderStatus;

// Ler os dados de um pedido com N itens (N fornecido 
// pelo usuário). Depois, mostrar um sumário do pedido 
// conforme exemplo. Nota: o instante do pedido deve 
// ser o instante do sistema: new Date()

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		// Client Data
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf1.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
				
		// Order Data
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus os1 = OrderStatus.valueOf(sc.next());
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		Order order = new Order();
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter #"+ i +" item data:");
			System.out.print("Product name: ");
			String pName = sc.next();
			
			System.out.print("Product price: ");
			Double pPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			Integer pQuantity = sc.nextInt();
		
			order = new Order(new Date(), os1);
			
			OrderItem orderItem = new OrderItem(pQuantity, pPrice);
		}

		System.out.println(order);
		
		System.out.println(client);
		
		sc.close();
	}
}
