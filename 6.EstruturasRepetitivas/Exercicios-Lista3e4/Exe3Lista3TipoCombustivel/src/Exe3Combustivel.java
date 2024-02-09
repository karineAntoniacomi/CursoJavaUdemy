import java.util.Scanner;

/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência 
 * de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido 
 * (tipoificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário
 * informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo
 * código (até que seja válido). O programa será encerrado quando o código informado 
 * for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de  
 * clientes que abasteceram cada tipo de combustível, conforme exemplo.*/

public class Exe3Combustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = 0;

		while(tipo != 4) {
			System.out.println("\nTipo |  Combustível\n  1  |  Álcool \n"
								+ "  2  |  Gasolina \n  3  |  Diesel \n  4  |  Fim");
			System.out.println("\nInforme o tipo de comsbustivel abastecido: ");
			tipo = sc.nextInt();
			
			if(tipo == 1) {
				alcool += 1;   //= alcool = alcool + 1
			}else if(tipo == 2) {
				gasolina += 1;				
			}else if(tipo == 3){
				diesel +=1;
			}
		}
		System.out.println("\nMUITO OBRIGADO \n"
				+ "Quantidade de clientes que abasteceram: "
				+ "\nÁlcool = "+alcool
				+ "\nGasolina = "+gasolina+"\nDiesel = "+diesel);
	sc.close();		
	}
}
