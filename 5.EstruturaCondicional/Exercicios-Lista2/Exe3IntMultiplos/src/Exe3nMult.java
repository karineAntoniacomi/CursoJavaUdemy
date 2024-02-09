import java.util.Scanner;

/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar
 * uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando 
 * se os valores lidos são múltiplos entre si. Atenção: os números 
 * devem poder ser digitados em ordem crescente ou decrescente.
 * 
 * Exemplos: a) 35 é múltiplo de 7, pois 35 é igual a 7 multiplicado
 * pelo número inteiro 5. */

public class Exe3nMult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 2 números inteiros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		double div = num1 / num2; 
		double div2 = num2 / num1; 
		
		// ou usando modulo e sem as variaveis div:
		//if (A % B == 0 || B % A == 0) {
		if( num1 == ( num2 * div) || num2 == ( num1 * div2)) {
			System.out.println("São Múltiplos!");
		}else {
			System.out.println("Não são Múltiplos!");
		}
		sc.close();
	}
}
