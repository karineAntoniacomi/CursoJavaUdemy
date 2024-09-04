package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

// Ler os dados de um trabalhador com N contratos 
// (N fornecido pelo usuário). Depois, solicitar
// do usuário um mês e mostrar qual foi o salário 
// do funcionário nesse mês.

public class Program {
	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		// Dados do trabalhador
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.next();
		
		System.out.print("Level: ");
		String workerLevel = sc.next();
		
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		// Neste momento, o trabalhador já pode ser instanciado
		// pois todos seus dados foram lidos
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		// Contrato - for se repete ate instanciar e associar todos os contratos aos trabalhadores
		for(int i =1; i<=n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
		
			System.out.print("Duration (hours):");
			int hours = sc.nextInt();
			
			// Após receber os dados pode instanciar o contrato
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			
			// Associa o Contrato ao Trabalhador
			worker.addContract(contract);
		}
	
		// Calculo de valor
		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		// recorta string, pega os 2 1os caractres, converte p/ interiro e guarda em variavel
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3)); // posição 3 em diante
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department:: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
	}
}
