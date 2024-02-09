// Faça um programa para ler o valor do raio de um círculo, e depois
// mostrar o valor da área deste círculo com quatro casas decimais.

// Fórmula da área: area = π . raio^2
// Considere o valor de π = 3.14159

import java.util.Scanner;

public class Exe2RaioCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do raio de um circulo: ");
		double raio = sc.nextDouble();		
		
		double area = 3.1415 * (Math.pow(raio, 2.0));
		
		System.out.printf("O valor da area deste circulo: %.4f m", area);
		
		sc.close();
	}
}
