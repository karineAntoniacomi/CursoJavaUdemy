import java.util.Scanner;

/* Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, começando
 de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo. */

public class Exe7NintLin {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		System.out.print("Digite um número inteiro positivo: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int first = i;
			int second = i * i;
			int third = i * i * i;
			
			//imprime em cada linha 3 valores, o numero da linha, o dobro e o triplo do valor
			System.out.printf("%d %d %d%n", first, second, third);
		}
		sc.close();
	}
}
