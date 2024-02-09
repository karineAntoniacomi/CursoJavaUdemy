import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		double y = 25.0;
//		//fun��o de raiz quadrada
//		double x = Math.sqrt(y);
		
//		System.out.println(x);
		
		//Fazer programa para ler 3 numeros inteiros e  
		//mostrar o maior deles		
/*		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a > c) {
			System.out.println("Higher = " + a);
		}else if(b > c) {
			System.out.println("Higher = " + b);
		}else {
			System.out.println("Higher = " + c);
		}
		sc.close();
*/		
		
		//SUBSTITUINDO O C�DIGO ACIMA POR UMA FUN��O		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// Chama fun��o max
		int higher = max(a, b, c);
		
		// Chama fun��o showResult
		showResult(higher);
		
		sc.close();
	}
	
	// Fun��o max - retorna maior numero de 3
	// public = disponivel em outras classes; 
	// static = fun�ao pode ser chamada independente de criar objeto
	// int � o tipo de retorno da fun��o
	public static int max(int x, int y, int z) {
		int aux;  // Vari�vel que existe somente no escopo dessa fun��o
		
		if(x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		// valor que a fun��o retorna
		return aux;
	}
	
	// Fun��o showResult - nao retorna valor (void), imprime
	// mensagem na tela, passa o parametro (value) como valor
	public static void showResult(int value){
		System.out.println("Higher = " + value);
	}
}
