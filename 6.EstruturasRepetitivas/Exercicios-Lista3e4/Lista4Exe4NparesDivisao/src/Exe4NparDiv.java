import java.util.Scanner;

/* Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel". */

public class Exe4NparDiv {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double div = 0.0;
		double n1 = 0.0;
		double n2 = 0.0;		
		
		System.out.println("\nDigite um número inteiro: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("\n\nDigite "+n+" pares de número(s): ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();			
			
			if(n2 == 0) {
				System.out.println("Divisão impossível.");
			}
			else {
				div = n1 / n2;
				System.out.printf("\nDivisão de %.1f por %.1f = %.1f",n1, n2, div);
			}
		}		
		sc.close();
	}
}
