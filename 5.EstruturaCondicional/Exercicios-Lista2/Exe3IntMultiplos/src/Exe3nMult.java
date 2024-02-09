import java.util.Scanner;

/* Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar
 * uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando 
 * se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros 
 * devem poder ser digitados em ordem crescente ou decrescente.
 * 
 * Exemplos: a) 35 � m�ltiplo de 7, pois 35 � igual a 7 multiplicado
 * pelo n�mero inteiro 5. */

public class Exe3nMult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 n�meros inteiros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		double div = num1 / num2; 
		double div2 = num2 / num1; 
		
		// ou usando modulo e sem as variaveis div:
		//if (A % B == 0 || B % A == 0) {
		if( num1 == ( num2 * div) || num2 == ( num1 * div2)) {
			System.out.println("S�o M�ltiplos!");
		}else {
			System.out.println("N�o s�o M�ltiplos!");
		}
		sc.close();
	}
}
