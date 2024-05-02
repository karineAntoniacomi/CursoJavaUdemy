package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

/* Fazer um programa para ler os dados de N contribuintes 
 * (N�fornecido pelo usu�rio), os quais podem ser pessoa 
 * f�sica ou�pessoa jur�dica, e depois mostrar o valor do 
 * imposto pago por�cada um, bem como o total de imposto 
 * arrecadado. Os dados de�pessoa f�sica s�o: nome, renda 
 * anual e gastos com sa�de. Os�dados de pessoa jur�dica s�o 
 * nome, renda anual e n�mero de�funcion�rios. As regras para
 * c�lculo de imposto s�o as seguintes:Pessoa f�sica: pessoas
 * cuja renda foi abaixo de 20000.00 pagam�15% de imposto. 
 * Pessoas com renda de 20000.00 em diante pagam�25% de 
 * imposto. Se a pessoa teve gastos com sa�de, 50% destes�
 * gastos s�o abatidos no imposto.�Exemplo: uma pessoa cuja 
 * renda foi 50000.00 e teve 2000.00 em�gastos com sa�de, o 
 * imposto fica: (50000 * 25%) - (2000 * 50%)= 11500.00�
 * Pessoa jur�dica: pessoas jur�dicas pagam 16% de imposto. 
 * Por�m,�se a empresa possuir mais de 10 ,funcion�rios, ela 
 * paga 14% de�imposto.Exemplo: uma empresa cuja renda foi 
 * 400000.00 e possui 25�funcion�rios, o imposto fica: 
 * 400000 * 14% = 56000.00��*/
 
public class Program {
	public static void main(String args[]) {	
		
		Locale.setDefault(Locale.US);			
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();	
		
		for(int i = 1; i <=n; i++) {			
			System.out.println("Tax payer #" + i + " data:");
			
			// Verifica se o contribuinte � Pessoa F�sica ou Jur�dica
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);	
			
			System.out.print("Name: ");			
			String name = sc.next();
			
			System.out.print("Anual income: ");	
			double anualIncome = sc.nextDouble();	
			
			// Pessoa F�sica de renda < 20000.00 paga 15% de imposto. 
			// Renda > 20000.00, paga 25% de imposto. Se houve gastos 
			// com sa�de, 50% destes gastos s�o abatidos no imposto.
			if(ch == 'i') {							
				System.out.print("Health expenditures: ");	
				double healthExpediture = sc.nextDouble();	
				list.add(new Individual(name, anualIncome, healthExpediture));		
			} else {	
				// Pessoa jur�dica paga 16% de imposto. Se a empresa 
				// possuir > 10 funcion�rios, paga 14% de imposto.
				System.out.print("Number of employees: ");	
				Integer numberOfEmployees = sc.nextInt();	
				list.add(new Company(name, anualIncome, numberOfEmployees));			
			}	
		}
			
		System.out.println("\nTAXES PAID:");
		
		Double total = 0.0;
		for(TaxPayer taxPayer : list) {	
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
			total += taxPayer.tax();
		}	
		
		System.out.printf("\nTOTAL TAXES: $ %.2f%n", total);

		sc.close();
	}
}