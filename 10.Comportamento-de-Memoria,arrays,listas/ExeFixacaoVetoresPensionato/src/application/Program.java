package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

// A dona de um pensionato possui dez quartos para alugar para estudantes,
// sendo esses quartos identificados pelos números 0 a 9.
// Fazer um programa que inicie com todos os dez quartos vazios, e depois
// leia uma quantidade N representando o número de estudantes que vão
// alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
// N estudantes. Para cada registro de aluguel, informar o nome e email do
// estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
// que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
// um relatório de todas ocupações do pensionato, por ordem de quarto.

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Cria Vetor de 10 posições onde cada elemento é um aluguel / rent
		Rent[] vect = new Rent[10]; // posições nulas
		
		// Teste
		// Rent r = new Rent("Maria", "maria@gmail.com");
		// System.out.println(r);
		
		// Lê a quatidade do vetor
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
	
		// Lê os dados do vetor
		for(int i = 1; i <= n; i++) {
			System.out.println("\nRent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine(); // limpa quebra de linha do buffer para ler nova quebra de linha de frase com espaço
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.next(); // Aqui apenas next pois email não tem espaço em branco
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			// Após ler os dados, instancia um novo aluguel
			Rent rent = new Rent(name, email);
			// Salva o novo aluguel na posição do vetor do quarto escolhido 
			// vect[roomNumber] = rent;
			
			// Atribui os dados do vetor
			// ou mais resumido: instancia o objeto, e atribui a referência dele para o vetor na posição roomNumber informada
			 vect[roomNumber] = new Rent(name, email);	
		}
		
		// Mostra todos os quartos, inluindo os nulos / não ocupados
		// for (int i = 0; i < 19; i++) {
		// 	System.out.println(vect[i]);
		// }
		
		// Percorre o vetor já preenchido, imprimindo   
		// somente os quartos ocupados
		System.out.println("\nBusy rooms:");
		for(int i = 0; i < 10; i++) {
			// Só imprime se o vetor na posição i for diferente de nulo
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}
}
