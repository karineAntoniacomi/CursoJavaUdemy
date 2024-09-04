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

		// Bloco de c�digo que pode gerar exce��o
		try {
			// Leitura de v�rios dados na mesma linha
			// separados por espa�o em branco
			String[] vect = sc.nextLine().split(" ");

			// Exibe o vetor na posi��o informada
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		// Bloco que captura e declara a exce��o. Ao inv�s de parar o
		// programa ao ocorrer uma exce��o, o programa continua normalmente
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			// Imprime o tipo de exce��o e a sequencia de�chamadas de m�todos que a gerou
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();

		System.out.println("***METHOD2 END***");
	}
}