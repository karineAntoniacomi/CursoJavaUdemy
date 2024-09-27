package exemplosFileReaderBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Bloco try with resources para abrir e fechar as streams 
// sem precisar fazer o processo manualmente
public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\karin\\AppData\\Local\\Temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine(); // lê uma linha do arquivo, se estiver no final retorna nulo
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getLocalizedMessage());
		}
	}
}
