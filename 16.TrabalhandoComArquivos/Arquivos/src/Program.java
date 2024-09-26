import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\karin\\AppData\\Local\\Temp\\in.txt");
		
		// Ao instanciar o Scanner a partir deste arquivo 
		// pode ser gerada exceção, por isso colocar em bloco try catch;
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		// Fecha de scanner independete se deu certo o try ou nao
		finally {
			// para caso o scanner não tenha sido instanciado corretamente
			if( sc != null) {				
				sc.close();
			}
		}
	}
}
