package exemplosFileWriterBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"};
		
		// Criando arquivo e guardando os dados acime nele
		String path = "D:\\Temp\\out.txt";
	
		// Assim recria o arquivo e grava novamente os dados
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
		// Assim ele não recria o arquivo, apenas adiciona ao final do arquivo os dados
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			// grava no arquivo as linhas do vetor lines
			for (String line : lines) {
				bw.write(line);
				bw.newLine(); // para adicionar quebra de linha
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
