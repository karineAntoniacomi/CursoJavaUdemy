import java.util.Scanner;

/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a
 * quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar. */

public class Exe5Coditem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double preco = 0.0;

		System.out.println("--------------------------------------");
		System.out.println(" CÓDIGO    ESPECIFICAÇÃO      PREÇO");
		System.out.println("--------------------------------------");
		System.out.println(" 1         Cachorro Quente    R$ 4.00");
		System.out.println(" 2         X-Salada           R$ 4.50");
		System.out.println(" 3         X-Bacon            R$ 5.00");
		System.out.println(" 4         Torrada simples    R$ 2.00");
		System.out.println(" 5         Refrigerante       R$ 1.50");
		System.out.println("--------------------------------------");

		System.out.println("\nDigite o código do item: ");
		int cod = sc.nextInt();
		System.out.println("\nDigite a quantidade do item de código " + cod + ":");
		int qtd = sc.nextInt();

//		if(cod == 1){
//			preco = 4.00;
//		}else if(cod == 2){
//			preco = 4.50;
//		}else if(cod == 3){
//			preco = 5.00;
//		}else if(cod == 4){
//			preco = 2.00;
//		}else if(cod == 5){
//			preco = 1.50;
//		}else{
//			System.out.println("\nCodigo de item inválido.");
//		}					

		// If acima com Switch case
		switch (cod) {
		case 1:
			preco = 4.00;
			break;
		case 2:
			preco = 4.50;
			break;
		case 3:
			preco = 5.00;
			break;
		case 4:
			preco = 2.00;
			break;
		case 5:
			preco = 1.50;
			break;
		default:
			System.out.println("\nCódigo de item inválido.");
			break;
		}

		double conta = preco * qtd;

		System.out.printf("\nTotal a pagar: R$ %.2f", conta);

		sc.close();
	}
}
