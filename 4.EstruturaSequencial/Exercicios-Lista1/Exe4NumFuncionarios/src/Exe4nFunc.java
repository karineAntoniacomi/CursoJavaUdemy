import java.util.Locale; 
import java.util.Scanner;

/* Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas 
 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse funcion�rio. 
 * A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais. */

public class Exe4nFunc {

	public static void main(String[] args) {
		
		// Possibilita entradas com ponto no lugar de virgula
		Locale.setDefault(Locale.US);		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N�mero do funcion�rio: ");	
		int nFunc = sc.nextInt();
		
		System.out.println("N�mero de horas trabalhadas: ");	
		Double nHoras = sc.nextDouble();
		
		System.out.println("Sal�rio por hora: ");
		Double salarioHR = sc.nextDouble(); 
		
		Double salario = nHoras * salarioHR;
		
		System.out.printf("\nFuncion�rio: %d \nSal�rio: U$ %.2f", nFunc, salario);
		
		sc.close();
	}

}
