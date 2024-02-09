import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa que leia três valores com ponto flutuante de dupla 
 * precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

public class Exe6FP {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 valores reais A, B, C, com duas casas decimais: ");
		Double A = sc.nextDouble();
		Double B = sc.nextDouble();
		Double C = sc.nextDouble();
		
		// Área triângulo retângulo: área = base * altura /2
		Double areaTri = (A*C)/2;
		
		// Área círculo: área =  pi * raio elevado ao quadrado (A = π r²)
		Double areaCirc = 3.1415 * Math.pow(C,2);
		
		// Área trapézio: área = (soma das bases * altura)/2 
		Double areaTrap = ((A + B) * C) / 2;
		
		// Área quadrado:  área = base * altura;
		Double areaQuad = B * B;
		
		// Área retângulo:  área = base * altura;
		Double areaRet = A * B;
				
		System.out.printf("A área do triângulo retângulo, com A por base e C por altura: %.3f\n", areaTri);
		System.out.printf("A área do círculo de raio C: %.3f\n", areaCirc);
		System.out.printf("A área do trapézio, com A e B por base e C por altura: %.3f\n", areaTrap);
		System.out.printf("A área do quadrado com lado B: %.3f\n", areaQuad);
		System.out.printf("A área do retângulo com lados A e B: %.3f", areaRet);
		
		sc.close();		
	}

}
