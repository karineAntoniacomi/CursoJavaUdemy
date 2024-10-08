package Exemplo1.application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Exemplo1.model.entities.CarRental;
import Exemplo1.model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

/* Uma locadora brasileira de carros cobra um valor por hora para loca��es de at�
12 horas. Por�m, se a dura��o da loca��o ultrapassar 12 horas, a loca��o ser�
cobrada com base em um valor di�rio. Al�m do valor da loca��o, � acrescido no
pre�o o valor do imposto conforme regras do pa�s que, no caso do Brasil, � 20%
para valores at� 100.00, ou 15% para valores acima de 100.00. Fazer um
programa que l� os dados da loca��o (modelo do carro, instante inicial e final da
loca��o), bem como o valor por hora e o valor di�rio de loca��o. O programa
deve ent�o gerar a nota de pagamento (contendo valor da loca��o, valor do
imposto e valor total do pagamento) e informar os dados na tela. Veja os
exemplos. */

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		
		// leitura de dados
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		// Instanciando o aluguel de carro
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com o pre�o por hora: ");
		double pricePerHour = sc.nextDouble();
		
		System.out.print("Entre com o pre�o por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA:");		
		System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		sc.close();
	}

}
