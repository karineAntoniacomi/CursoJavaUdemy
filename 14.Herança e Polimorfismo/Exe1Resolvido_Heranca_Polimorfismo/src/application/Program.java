package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of the Employees: ");
		int n = sc.nextInt();
		
		// ler a qntd n de func e armazenar em lista
		for(int i = 1; i<=n; i++) {
			System.out.println("Employee  #" + i + " data: ");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			// verifica se é funcionario terceirizado
			if(ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				// Instancia novo func terceirizado
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				// Adiciona na lista de funcionarios
				list.add(emp);
			}
			else {
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		// p/ cada funcionario emp na lista list
		for(Employee emp : list) {
			System.out.println(emp.getName() + " -  $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}
}
