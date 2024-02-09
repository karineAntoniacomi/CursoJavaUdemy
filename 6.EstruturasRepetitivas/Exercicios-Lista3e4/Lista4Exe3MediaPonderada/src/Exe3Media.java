import java.util.Locale;
import java.util.Scanner;

/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de 
 * teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada 
 * para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor 
 * tem peso 3 e o terceiro valor tem peso 5. */

public class Exe3Media {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite um valor inteiro: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("\nDigite "+n+" valores reais: ");
			//recebe 3 valores reais (pulando linha ou nao) e calcula a media ponderada de cada tupla de valores
			double teste1 = sc.nextDouble();
			double teste2 = sc.nextDouble();
			double teste3 = sc.nextDouble();
		
			double media = (teste1 * 2.0 + teste2 * 3.0 + teste3 * 5.0) / 10.0;
			System.out.printf("Média ponderada: %.1f%n", media);
		}	
		sc.close();
	}
}
	
