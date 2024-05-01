package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/* Suponha que em um negócio relacionado a banco, apenas contas 
 * poupança e contas para empresas são permitidas.Não existe 
 * conta comum. Para garantir que contas comuns não possam ser
 *  instanciadas, basta acrescentarmos a palavra "abstract" na
 *   declaração da classe. */

public class Program {
	public static void main(String args[]) {	
		
		Locale.setDefault(Locale.US);			
		Scanner sc = new Scanner(System.in);
		
		// Tipo da lista é genérico, assim dentro da lista		
		// usando upcasting, pode-se inserir objetos de 		
		// outros tipos (poupança ou empresarial)		
		List<Account> list = new ArrayList<>();	
		
		// Classe Account não pode ser instancia pois é abstrata, as
		// demais podem pois são subclasses não abstratas de Account.	
		// Account acc1 = new Account(1001, "Alex", 1000.0);
		// Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);		
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));	
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.00));	
		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));	
		list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));	
		
		// Totalizar o saldo das contas independente 		
		// do tipo de conta de cada elemento da lista		
		double sum = 0.0;		
		for (Account acc : list) {	
			sum += acc.getBalance();				
		}		
		
		System.out.printf("Total balance: %.2f%n", sum);	
		
		// Deposita 10 em cada conta		
		for (Account acc : list) {			
			acc.deposit(10);		
		}
		
		// Mostra o saldo atualizado de cada conta
		for(Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	sc.close();
	}
}
