package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//instanciar lista de funcionarios - intanciar funcionario e 
		//armazena-lo na lista
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
						
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			
			//instanciar um Employee - funcionario com os dados digitados
			Employee emp = new Employee(id, name, salary);
			
			//inserir o onjeto emp do tipo Employee na lista
			list.add(emp);
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		//OUTRA FORMA DE ENCONTRAR A POSIÇÃO DE EMP
		//list.stream() tipo esepcial do Java, tranforma a lsita em strem
		//a função filter filtra a lista para somente os elementos que 
		//atender o predicado x == id
		// findFirst pega o primeiro elemento encontrado 
		Employee e = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		//FORMA DE ENCONTRAR A POSIÇÃO DE EMP USANDO A FUNÇÃO position
		//procura posição do idSalary dentro da lista, se encontrar pos nao sera nulo
		//Integer pos = posisiton(list, idSalary);
		
		//trocando pos por e (pos para o formato usando a função position)
		if(e == null) {
			System.out.println("This id does not exist!");
		} else {
			//leitura da porcentagem
			System.out.print("Enter the percentage: ");
			Double percent = sc.nextDouble();
			
			//acessar na lista o funcionaria na posicao pos e chamar a 
			//funcao para aumentar o salario deste
			//list.get(e).increaseSalary(percent);
			e.increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of Employees:");
		//for each para imprimir os empregados da lista
		for(Employee emp : list) { //para cada Emplyoee emp na lista list faça
			System.out.println(emp);;
		}		
		
		sc.close();
	}
	//funçao que retorna o integer que vai ser a posição do elemento emp na lista
	
	//deve ser static pois a main é, entao para chamar função dentro de 
	//uma mesma classe, devem ser do mesmo tipo
	public static Integer posisiton(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			// list.get pega o elemento na posição i
			if(list.get(i).getId() == id) {	//se o id do elemento na posição i for igual ao id fornecido = encontrou o id na lista
				return i;
			}
		}
		//se esgotar o for e nao retornar nada, entao o id nao foi encontrado na lista
		//retorna nulo para wrapper class Integer ou -1 caso use int primitivo
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
