package exemplosFileReaderBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Processo de abrir e fechar manualmente Stream
public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\karin\\AppData\\Local\\Temp\\ina.txt";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			// Stream - sequencia de leitura
			fr = new FileReader(path);
			// BufferedReader - oega a stream básica FileReader e a partir dela
			// instancia a stream que tem o buffer p/ deixar mais rapida a leitura
			br = new BufferedReader(fr);

			String line = br.readLine(); // lê uma linha do arquivo, se estiver no final retorna nulo
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getLocalizedMessage());
		}
		// finally p/ fechar as duas streams
		finally {
			// bloco try pois também pode ocorrer exceção na hora de fechar as streams
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
