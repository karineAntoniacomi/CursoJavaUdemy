package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploBlocoFinally {

	public static void main(String[] args) {

		File file = new File (
				"C:\\Users\\karin\\Desktop\\Material Curso Java Udemy\\15.Tratamento de Exce��es\\Texto.txt");

		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.err.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.err.println("Error opening file: " + e.getMessage());
		} finally {
			// Bloco finally � executado independente de dar certo ou n�o o try catch
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally Block executed");
		}
	}
}