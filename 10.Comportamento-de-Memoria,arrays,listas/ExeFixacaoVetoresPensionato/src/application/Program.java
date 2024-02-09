package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

// A dona de um pensionato possui dez quartos para alugar para estudantes,
// sendo esses quartos identificados pelos n�meros 0 a 9.
// Fazer um programa que inicie com todos os dez quartos vazios, e depois
// leia uma quantidade N representando o n�mero de estudantes que v�o
// alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
// N estudantes. Para cada registro de aluguel, informar o nome e email do
// estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
// que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
// um relat�rio de todas ocupa��es do pensionato, por ordem de quarto.

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Cria Vetor de 10 posi��es onde cada elemento � um aluguel / rent
		Rent[] vect = new Rent[10]; // posi��es nulas
		
		// Teste
		// Rent r = new Rent("Maria", "maria@gmail.com");
		// System.out.println(r);
		
		// L� a quatidade do vetor
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
	
		// L� os dados do vetor
		for(int i = 1; i <= n; i++) {
			System.out.println("\nRent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine(); // limpa quebra de linha do buffer para ler nova quebra de linha de frase com espa�o
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next(); // Aqui apenas next pois email n�o tem espa�o em branco
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			// Ap�s ler os dados, instancia um novo aluguel
			Rent rent = new Rent(name, email);
			// Salva o novo aluguel na posi��o do vetor do quarto escolhido 
			// vect[roomNumber] = rent;
			
			// Atribui os dados do vetor
			// ou mais resumido: instancia o objeto, e atribui a refer�ncia dele para o vetor na posi��o roomNumber informada
			 vect[roomNumber] = new Rent(name, email);	
		}
		
		// Mostra todos os quartos, inluindo os nulos / n�o ocupados
		// for (int i = 0; i < 19; i++) {
		// 	System.out.println(vect[i]);
		// }
		
		// Percorre o vetor j� preenchido, imprimindo   
		// somente os quartos ocupados
		System.out.println("\nBusy rooms:");
		for(int i = 0; i < 10; i++) {
			// S� imprime se o vetor na posi��o i for diferente de nulo
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}
}
