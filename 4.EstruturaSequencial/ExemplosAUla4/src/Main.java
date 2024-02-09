import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		// quebra de linha pendente
		/* ao usar comando de leitura diferente do nextLine()
		e dar quebra de linha, essa quebra de linha fica
		"pendente" na entrada padrão. Se fizer um nextLine(),
		a quebra de linha pendente será absorvida pelo nextLine(). */
		x = sc.nextInt();
		
		// Solução: fazer um nextLine() extra
		sc.nextLine();
		// uma entrada será ignorada pela pendente acima
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}