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
		// Forma alternativa com If tern�rio
		// Se for menor que 20k ent�o retorna taxa de 15% - gastos com sa�de. 
		// Se n�o, recebe a tava de 25% - gastos com sa�de.
		double basicTax = (getAnualIncome() < 20000.0) ? 
				getAnualIncome() * 0.15 - (healthExpenditures *  0.50) 
				: getAnualIncome() * 0.25  - (healthExpenditures *  0.50);
		return basicTax;
	}
}
