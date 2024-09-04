package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		method1();
		System.out.println("End of program");
	}

	public static void method1() {

		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}

	public static void method2() {
		System.out.println("***METHOD2 START***");
		
		Scanner sc = new Scanner(System.in);

		// Bloco de código que pode gerar exceção
		try {
			// Leitura de vários dados na mesma linha
			// separados por espaço em branco
			String[] vect = sc.nextLine().split(" ");

			// Exibe o vetor na posição informada
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		// Bloco que captura e declara a exceção. Ao invés de parar o
		// programa ao ocorrer uma exceção, o programa continua normalmente
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			// Imprime o tipo de exceção e a sequencia de chamadas de métodos que a gerou
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();

		System.out.println("***METHOD2 END***");
	}
}