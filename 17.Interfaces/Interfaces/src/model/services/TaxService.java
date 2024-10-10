package model.services;

// tipo genérico
public interface TaxService {

	// define que qualquer classe que implementar 
	// esta interface, deve implementar esta operação
	double tax(double amount);
}
