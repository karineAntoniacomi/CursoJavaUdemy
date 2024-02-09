package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta;  // declarando a variavel fora do if para poder usar em outras partes do programa
		
		System.out.print("Digite o número da conta: ");
		int numConta = sc.nextInt();
		// int numConta = Integer.parseInt(sc.nextLine());
		System.out.print("Digite o  nome do titular da conta: ");
		// o sc.nextLine é necessário antes de ler a proxima linha para consumir a 
		// quebra de linha pendente no nextInt acima
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.print("Há depósito inicial? [S / N]");
		char resp = sc.next().charAt(0);
		
		if(resp == 's' || resp == 'S') {
			System.out.println("Digite o valor do depósito inicial: ");
			double depositoIni = sc.nextDouble();
			// se a resposta for sim, instancia a conta com construtor de 3 argumentos
		    conta = new ContaBancaria(numConta, nomeTitular, depositoIni);
		}else{
			// se a resposta for não, instancia a conta com construtor de 2 argumentos (sobrecarga do construtor)
			 conta = new ContaBancaria(numConta, nomeTitular);
		} 
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		
		System.out.println("Dados da conta atualizados:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		
		System.out.println("\nDados da conta atualizados:");
		System.out.println(conta);
		
		sc.close();		
	}
}
