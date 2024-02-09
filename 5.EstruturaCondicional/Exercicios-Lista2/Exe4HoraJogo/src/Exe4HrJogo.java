import java.util.Scanner;

/* Leia a hora inicial e a hora final de um jogo. 
 * A seguir calcule a duração do jogo, sabendo que o mesmo pode
 * começar em um dia e terminar em outro, tendo uma duração mínima
 * de 1 hora e máxima de 24 horas. */

public class Exe4HrJogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double hrIni = 0.0;
		double hrFin = 0.0;
		double tempoJogo = 0.0;
		
		System.out.println("Hora Inicial do jogo: ");
		hrIni = sc.nextDouble();
		
		System.out.println("Hora Final do jogo: ");
		hrFin = sc.nextDouble();
				
		if(hrIni < hrFin) {
			tempoJogo = hrFin - hrIni;			
		}else {
			tempoJogo = 24.0 - hrIni + hrFin;	
		}
		
		System.out.printf("O jogo durou: %.1f Horas", tempoJogo);		
	}
}



