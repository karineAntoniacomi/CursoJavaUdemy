import java.util.Scanner;

/* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, 
mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" 
para fora do intervalo). */

public class Exe2Intervalo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int in = 0;
		int out = 0;
		
		System.out.println("Digite um valor inteiro: ");
		int n = sc.nextInt();
		
		System.out.println("Agora digite "+n+" valor(es) inteiro(s).");	
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				in += 1;				
			}
			else{
				out += 1;
			}
		}
		System.out.println("Dentro do intervalo [10,20] = "+in);
		System.out.println("Fora do intervalo [10,20] = "+out);
		
		sc.close();
	} 
}
