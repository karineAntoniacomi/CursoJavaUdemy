import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		double y = 25.0;
//		//função de raiz quadrada
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
		
		//SUBSTITUINDO O CÓDIGO ACIMA POR UMA FUNÇÃO		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// Chama função max
		int higher = max(a, b, c);
		
		// Chama função showResult
		showResult(higher);
		
		sc.close();
	}
	
	// Função max - retorna maior numero de 3
	// public = disponivel em outras classes; 
	// static = funçao pode ser chamada independente de criar objeto
	// int é o tipo de retorno da função
	public static int max(int x, int y, int z) {
		int aux;  // Variável que existe somente no escopo dessa função
		
		if(x > y && x > z) {
			aux = x;
		}else if(y > z) {
			aux = y;
		}else {
			aux = z;
		}
		// valor que a função retorna
		return aux;
	}
	
	// Função showResult - nao retorna valor (void), imprime
	// mensagem na tela, passa o parametro (value) como valor
	public static void showResult(int value){
		System.out.println("Higher = " + value);
	}
}
