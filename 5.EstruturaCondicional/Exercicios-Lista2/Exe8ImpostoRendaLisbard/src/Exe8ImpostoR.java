import java.util.Locale;
import java.util.Scanner;

/* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar
 * seus impostos, pois sabem que nele não existem políticos corruptos e os recursos 
 * arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda 
 * deste país é o Rombus, cujo símbolo é o R$. 

 * Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de 
 * Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de 
 * Imposto de Renda, segundo a tabela abaixo.

 * Lembre que, se o salário for R$ 3002.00, a tasalarioa que incide é de 8% apenas 
 * sobre R$ 1000.000, pois a faisalarioa de salário que fica de R$ 0.000 até 
 * R$ 2000.000 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é 
 * de 8% sobre R$ 1000.000 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total.
 * O valor deve ser impresso com duas casas decimais. */

public class Exe8ImpostoR {

	public static void main(String[] args) {	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------------------------------\n"
						 + "  RENDA                       |  IMPOSTO DE RENDA \n"
						 + "--------------------------------------------------\n"
						 + "  De 0.000 até R$ 2000.000    |      Isento\n"
						 + "  De 2000.001 até R$ 3000.000 |         8 %\n"
						 + "  De 3000.001 até R$ 4500.000 |        18 %\n"
						 + "  Acima de R$ 4500.000        |        28 %\n"
						 + "--------------------------------------------------");
		
		System.out.println("Digite o salário: ");
		double salario = sc.nextDouble();
		
		double imposto = 0.00;
		
		if (salario >= 0.00 && salario <= 2000.00) {
			imposto = 0.00;
			System.out.println("Isento");
		}
		else if (salario <= 3000.00) {
			imposto = (salario - 2000.00) * 0.08;
			System.out.printf("Valor a ser pago de Imposto de Renda = %.2f", imposto);
		} 
		else if (salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + 1000.0 * 0.08;
			System.out.printf("Valor a ser pago de Imposto de Renda = %.2f", imposto);
		} 
		else if (salario > 4500.00) {
			//double imposto3 = (salario - 2000.00) *  18 / 100  + (salario - 4500.00) * 28 / 100;
			imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
			System.out.printf("Valor a ser pago de Imposto de Renda = %.2f", imposto);
		} 
		
		sc.close();
	}
}
