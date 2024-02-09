
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// OPERAÇÃO BIT A BIT
		/*		
		//32 em binário é igual a 100 000 = 2 elevado a 6 = 64 - 32 = 32 é verdadeiro para o sexto bit
		int mask = 0b100000;
		int n = sc.nextInt();
		
		// o sexto bit vale 1 ou 0 ?
		//se for verdadeiro o 6 bit é verdadeiro (vale 1)
		//se n E bit a bit com a mascara for diferente de zero então o sexto bit vale 1
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false");
		}
		sc.close();
*/
	
		
		// FUNÇÕES PARA STRING
/*
		String original = "abcde FGHIJ ABC abc DEFG ";

		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original: -" + original + "-");
		//LETRA MINUSCULA
		System.out.println("toLowerCase: -" + s01 + "-");
		//LETRA MAIUSCULA
		System.out.println("toUpperCase: -" + s02 + "-");
		// trim REMOVE ESPAÇOS NO FINAL DA STRING
		System.out.println("trim: -" + s03 + "-");
		// substring gera nova string de caracteres a partir da posição como argumento passado
		System.out.println("substring(2): -" + s04 + "-");
		// substring com 2 argumentos faz um recorte das posições passadas
		System.out.println("substring(2, 9): -" + s05 + "-");		
		// replace substitui o primeiro argumento pelo segundo (pode ser char ou string)
		System.out.println("replace('a', 'x'): -" + s06 + "-");	
		// replace substitui o primeiro argumento pelo segundo (pode ser char ou string)
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");	
		// indexOf verifica a primeira posição do substring bc na string original
		System.out.println("indexOf of 'bc': " +i);	
		// lastIndexOf verifica a ultima posição do substring bc na string original
		System.out.println("lastIndexOf of 'bc': " +j);	
*/
		
		// FUNÇÃO SPLIT - serve para recortar string - recebe separador e separa em vetores as partes do string
		String s = "potato apple lemon orange";
		
		//declarando vetor de string - split separa, o espa;ço entre aspas sera o separador 
		String[] vect = s.split(" ");
		
		//acessando outras posições do vetor
//		System.out.println(vect[0]);	
//		System.out.println(vect[1]);	
//		System.out.println(vect[2]);	
//		System.out.println(vect[3]);	
		
	}
}