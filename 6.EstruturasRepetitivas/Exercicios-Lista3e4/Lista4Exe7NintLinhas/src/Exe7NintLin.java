import java.util.Scanner;

/* Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas, come�ando
 de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme exemplo. */

public class Exe7NintLin {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		System.out.print("Digite um n�mero inteiro positivo: ");
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
