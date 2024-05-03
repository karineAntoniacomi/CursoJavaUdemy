package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public Double tax() {
		// Forma alternativa com If ternário
		// Se for menor que 20k então retorna taxa de 15% - gastos com saúde. 
		// Se não, recebe a tava de 25% - gastos com saúde.
		double basicTax = (getAnualIncome() < 20000.0) ? 
				getAnualIncome() * 0.15 - (healthExpenditures *  0.50) 
				: getAnualIncome() * 0.25  - (healthExpenditures *  0.50);
		return basicTax;
	}
}
