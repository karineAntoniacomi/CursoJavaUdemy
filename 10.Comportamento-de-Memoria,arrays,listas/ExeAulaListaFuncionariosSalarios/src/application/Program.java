package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

/* Fazer um programa para ler um número inteiro N e depois os dados 
 * (id, nome e salario) de N funcionários. Não deve haver repetição de id.
 * Em seguida, efetuar o aumento de X por cento no salário de um 
 * determinado funcionário. Para isso, o programa deve ler um id e 
 * o valor X. Se o id informado não existir, mostrar uma mensagem e 
 * abortar a operação. Ao final, mostrar a listagem atualizada dos 
 * funcionários, conforme exemplos. 
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir
 * que o salário possa ser mudado livremente. Um salário só pode ser
 * aumentado com base em uma operação de aumento por porcentagem dada.*/
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, idSalary;
		Integer id;
		String name;
		double salary, percent;
		
		//instanciar lista de funcionarios - intanciar funcionario e 
		//armazena-lo na lista
		List<Employee> list = new ArrayList<>();
		
		// PART 1 - READING DATA:
		System.out.print("How many employees will be registered? ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("\nEmplyoee #" + i + ": ");
			System.out.print("Id: ");
			id = sc.nextInt();
			
			// Se o id informado já existir
			while(hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			name = sc.nextLine();
			
			System.out.print("Salary: ");
			salary = sc.nextDouble();
			
			// Instancia um Employee com os dados
			// obtidos e isere objeto na lista
			list.add(new Employee(id, name, salary));
		}
		
		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
		System.out.print("\nEnter the employee id that will have salary increase: ");
		idSalary = sc.nextInt();
		
		// OUTRA FORMA DE ENCONTRAR A POSIÇÃO DE EMP
		// list.stream() tipo esepcial do Java, trasnforma a lista em stream
		// a função filter filtra a lista para somente os elementos que 
		// atender o predicado x == id
		// findFirst pega o primeiro elemento encontrado 
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null); 
		
		// FORMA DE ENCONTRAR A POSIÇÃO DE EMP USANDO A FUNÇÃO position
		// procura posição do idSalary dentro da lista, se encontrar pos nao sera nulo
		// Integer pos = posisiton(list, idSalary);
		
		// trocando pos por e (pos para o formato usando a função position)
		if(emp == null) {
			System.out.println("This id does not exist!");			
		} else {
			// leitura da porcentagem
			System.out.print("Enter the percentage: ");
			percent = sc.nextDouble();
		
			// Acessar na lista o funcionario na posição pos e chamar a 
			// funcao para aumentar o salário deste
			// list.get(e).increaseSalary(percent);
			emp.increaseSalary(percent);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		System.out.println("\nList of employees: ");
		// for each para imprimir os empregados da lista
		// para cada Employee emp na lista list faça
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	// Deve ser static pois a main é, então para chamar função 
	// dentro de uma mesma classe, devem ser do mesmo tipo	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	// Função que retorna o integer que vai ser a posição do elemento emp na lista (não usada)
	public static Integer posisiton(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			// list.get pega o elemento na posição i
			if(list.get(i).getId() == id) {	//se o id do elemento na posição i for igual ao id fornecido = encontrou o id na lista
				return i;
			}
		}
		// se esgotar o for e nao retornar nada, entao o id nao foi encontrado na lista
		// retorna nulo para wrapper class Integer ou -1 caso use int primitivo
		return null;
	}
	
}