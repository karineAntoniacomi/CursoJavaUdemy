import java.util.Locale;
import java.util.Scanner;

//Fazer programa para ler medidas de largura e comprimento de um terreno 
//retangular com um casa decimal, e o valor do metro quadrado do terreno 
//com 2 casas decimais. Em seguida, o programa deve mostrar o valor da area
//do terreno, bem como o valor do preço do terreno, ambos com 2 casas decimais.

public class terrenoMedidas {

	public static void main(String[] args) {
		
		//permite usar ponto em vez de virgula com numeros reais
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as medidas de largura e em seguida de "
				+ "comprimento do terreno: ");
		Double largura = sc.nextDouble();  	
		Double comprimento = sc.nextDouble(); 
		
		System.out.println("Digite o o valor do metro quadrado do terreno");
		Double metroQuadrado = sc.nextDouble(); 
		
		Double area = largura * comprimento;
		System.out.printf("O valor da area do terreno é: %.2f\n", area);
		
		Double preco = area * metroQuadrado;
		System.out.printf("O valor da area do terreno é: %.2f\n", preco);
	
		sc.close();
	}

}
