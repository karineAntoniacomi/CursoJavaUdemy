import java.util.Scanner;

/* Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia 
 * de seus clientes. Escreva um algoritmo para ler o tipo de combust�vel abastecido 
 * (tipoificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 4.Fim). Caso o usu�rio
 * informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo
 * c�digo (at� que seja v�lido). O programa ser� encerrado quando o c�digo informado 
 * for o n�mero 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de  
 * clientes que abasteceram cada tipo de combust�vel, conforme exemplo.*/

public class Exe3Combustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = 0;

		while(tipo != 4) {
			System.out.println("\nTipo |  Combust�vel\n  1  |  �lcool \n"
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
				+ "\n�lcool = "+alcool
				+ "\nGasolina = "+gasolina+"\nDiesel = "+diesel);
	sc.close();		
	}
}
