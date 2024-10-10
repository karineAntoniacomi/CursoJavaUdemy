package model.services;

import java.time.Duration;

import Exemplo1.model.entities.CarRental;
import Exemplo1.model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	// método que gera a fatura a parir do carRental
	public void processInvoice(CarRental carRental) {
		
		// obtendo as horas e minutos para arredondar as horas p/ cima
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes / 60.0;
				
		double basicPayment;
		if (hours <= 12.0) {
			// Arredondando hora p/ cima -> função ceil / teto
			basicPayment = pricePerHour * Math.ceil(hours);
		}
		else {
			// preço por dia caso horas > 12
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		
		// Imposto
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
	
}
