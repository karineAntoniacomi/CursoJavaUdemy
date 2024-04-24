package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String args[]){
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.println("Product #" + i +" data: ");	
			System.out.print("Common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(type == 'i'){
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				// Instancia novo Produto importado
				Product prod = new ImportedProduct(name, price, customsFee);
				// Adiciona na lista de Produtos
				list.add(prod);
			} else if(type == 'u'){
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), fmt1);
				Product prod = new UsedProduct(name, price, date);
				list.add(prod);
			} else {
				list.add(new Product(name, price));
			}	
		}
			
		System.out.println("\nPRICE TAGS:");
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}
}
