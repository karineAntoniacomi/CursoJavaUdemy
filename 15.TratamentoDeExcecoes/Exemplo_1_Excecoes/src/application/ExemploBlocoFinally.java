package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploBlocoFinally {

	public static void main(String[] args) {

		File file = new File (
				"C:\\Users\\karin\\Desktop\\Material Curso Java Udemy\\15.Tratamento de Exceções\\Texto.txt");

		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.err.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.err.println("Error opening file: " + e.getMessage());
		} finally {
			// Bloco finally é executado independente de dar certo ou não o try catch
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finally Block executed");
		}
	}
}