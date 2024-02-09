package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

/* Fazer um programa para ler um n�mero inteiro N e depois os dados 
 * (id, nome e salario) de N funcion�rios. N�o deve haver repeti��o de id.
 * Em seguida, efetuar o aumento de X por cento no sal�rio de um 
 * determinado funcion�rio. Para isso, o programa deve ler um id e 
 * o valor X. Se o id informado n�o existir, mostrar uma mensagem e 
 * abortar a opera��o. Ao final, mostrar a listagem atualizada dos 
 * funcion�rios, conforme exemplos. 
 * Lembre-se de aplicar a t�cnica de encapsulamento para n�o permitir
 * que o sal�rio possa ser mudado livremente. Um sal�rio s� pode ser
 * aumentado com base em uma opera��o de aumento por porcentagem dada.*/
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
			
			// Se o id informado j� existir
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
		
		// OUTRA FORMA DE ENCONTRAR A POSI��O DE EMP
		// list.stream() tipo esepcial do Java, trasnforma a lista em stream
		// a fun��o filter filtra a lista para somente os elementos que 
		// atender o predicado x == id
		// findFirst pega o primeiro elemento encontrado 
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null); 
		
		// FORMA DE ENCONTRAR A POSI��O DE EMP USANDO A FUN��O position
		// procura posi��o do idSalary dentro da lista, se encontrar pos nao sera nulo
		// Integer pos = posisiton(list, idSalary);
		
		// trocando pos por e (pos para o formato usando a fun��o position)
		if(emp == null) {
			System.out.println("This id does not exist!");			
		} else {
			// leitura da porcentagem
			System.out.print("Enter the percentage: ");
			percent = sc.nextDouble();
		
			// Acessar na lista o funcionario na posi��o pos e chamar a 
			// funcao para aumentar o sal�rio deste
			// list.get(e).increaseSalary(percent);
			emp.increaseSalary(percent);
		}
		
		// PART 3 - LISTING EMPLOYEES:
		System.out.println("\nList of employees: ");
		// for each para imprimir os empregados da lista
		// para cada Employee emp na lista list fa�a
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}
	
	// Deve ser static pois a main �, ent�o para chamar fun��o 
	// dentro de uma mesma classe, devem ser do mesmo tipo	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	// Fun��o que retorna o integer que vai ser a posi��o do elemento emp na lista (n�o usada)
	public static Integer posisiton(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			// list.get pega o elemento na posi��o i
			if(list.get(i).getId() == id) {	//se o id do elemento na posi��o i for igual ao id fornecido = encontrou o id na lista
				return i;
			}
		}
		// se esgotar o for e nao retornar nada, entao o id nao foi encontrado na lista
		// retorna nulo para wrapper class Integer ou -1 caso use int primitivo
		return null;
	}
	
}