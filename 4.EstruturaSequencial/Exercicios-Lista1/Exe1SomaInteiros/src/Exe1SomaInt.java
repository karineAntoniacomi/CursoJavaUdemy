import java.util.Scanner;

// Exe 1 - Estrutura Sequencial
// Faça um programa para ler dois valores inteiros, e depois mostrar
// na tela a soma desses números com uma mensagem explicativa.

public class Exe1SomaInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores inteiros:");
		//int num1, num2, soma; - pode-se declarar assim ou direto no sc como abaixo		
		Integer num1 = sc.nextInt();
		Integer num2 = sc.nextInt();
		Integer soma = num1 + num2;
		
		System.out.println("A soma dos dois valores inteiros é: " + soma);
		
		sc.close();
	}
}
