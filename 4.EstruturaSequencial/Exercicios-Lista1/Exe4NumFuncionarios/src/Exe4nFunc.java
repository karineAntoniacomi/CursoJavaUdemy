import java.util.Locale; 
import java.util.Scanner;

/* Fazer um programa que leia o número de um funcionário, seu número de horas 
 * trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais. */

public class Exe4nFunc {

	public static void main(String[] args) {
		
		// Possibilita entradas com ponto no lugar de virgula
		Locale.setDefault(Locale.US);		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número do funcionário: ");	
		int nFunc = sc.nextInt();
		
		System.out.println("Número de horas trabalhadas: ");	
		Double nHoras = sc.nextDouble();
		
		System.out.println("Salário por hora: ");
		Double salarioHR = sc.nextDouble(); 
		
		Double salario = nHoras * salarioHR;
		
		System.out.printf("\nFuncionário: %d \nSalário: U$ %.2f", nFunc, salario);
		
		sc.close();
	}

}
