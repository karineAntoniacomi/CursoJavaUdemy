package exeFixacaoArquivos.entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exeFixacaoArquivos.application.Product;

/* Fazer um programa para ler o caminho de um arquivo .csv
 contendo os dados de itens vendidos. Cada item possui um
 nome, preço unitário e quantidade, separados por vírgula. Você
 deve gerar um novo arquivo chamado "summary.csv", localizado
 em uma subpasta chamada "out" a partir da pasta original do
 arquivo de origem, contendo apenas o nome e o valor total para
 aquele item (preço unitário multiplicado pela quantidade),
 conforme exemplo. */

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<Product>();

		// Leitura do caminho do arquivo
		System.out.println("Digite o caminho do arquivo:"); // D:\\Temp\\input.csv";
		String sourceFileStr = sc.nextLine();

		// Classe File que permite criar objeto passando um caminho
		File sourceFile = new File(sourceFileStr);

		// Operação para obter o caminho da pasta
		String sourceFolderStr = sourceFile.getParent();

		// Retornar se conseguiu criar ou não o diretorio
		boolean success = new File(sourceFolderStr + "\\out").mkdir();

		System.out.println("Diretório criado: " + success);

		// Criando arquivo de saída e guardando os dados
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

		// leitura do arquivo com try with resources
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			String itemCsv = br.readLine();
			// enquanto nao chegar ao fim do arquivo, continunar lendo as linhas
			while (itemCsv != null) {
				// Após cada linha irá instanciar um produto
				String[] filds = itemCsv.split(",");
				String name = filds[0];
				double price = Double.parseDouble(filds[1]);
				int quantity = Integer.parseInt(filds[2]);

				// adicionando itens à lista de produtos
				list.add(new Product(name, price, quantity));

				// lê a primeira linha, imprime e passa p/ a proxima
				itemCsv = br.readLine();
			}

			// Gravando dados no arquivo summary.csv
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				// percorrer lista de produtos, e para cada linha gravar no arquivo de saída
				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total()) + "," + item.getQuantity());
					bw.newLine();
				}
				// se deu cero, irá imrimir
				System.out.println(targetFileStr +  "CRIADO COM SUCESSO");

			} catch (IOException e) {
				System.out.println("erro ao escrever no arquivo: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Erro ao escrever no arquivo." + e.getMessage());
		}		
		sc.close();
	}
}
