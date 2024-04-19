package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		BusinessAccount account = new BusinessAccount();
	
		// account.getBalance();
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
	
		// UPCASTING = Pegar um objeto do 
		// tipo BusinessAccount e atribuí-lo 
		// para uma variável do tipo Account
		Account	acc1 = bacc; 
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
	
		
		// DOWNCASTING = Converter objeto da SUPERCLASSE
		// para a SUBCLASSE, como não é algo natural, é preciso
		// forçar a conversão, colocando a subclasse entre parenteses
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// Exemplo de erro de conversão de tipos
		// BusinessAccount acc5 = (BusinessAccount)acc3; 
		
		// instanceof testa se é do tipo permitido para o casting
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		// testa se o objeto acc3 é instancia de SavingsAccount
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			// agora a acc5 é do tipo SavingsAccount e pode chamar suas operações
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		// Teste 
		Account acc10 = new Account(1001, "Alex", 1000.0);
		// saque de 200
		acc10.withdraw(200.0);
		System.out.println(acc10.getBalance()); // mostra saldo de 795 (incluindo a taxa de saque)
		
		// Teste SOBREPOSIÇÃO de método de saque na conta poupança / upcasting
		Account acc11 = new SavingsAccount(1002, "Maria", 1000.0, 0.1);
		acc11.withdraw(200.0);
		System.out.println(acc11.getBalance());
		
		
		// TESTE CHAMANDO A IMPLEMENTAÇÃO DA SUPERCLASSE COM A PALAVRA SUPER
		Account acc12 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc12.withdraw(200.0);
		System.out.println(acc12.getBalance()); // saldo será 793 pois além do desconto de 5 da superclasse, desconta mais 2
	}
}
