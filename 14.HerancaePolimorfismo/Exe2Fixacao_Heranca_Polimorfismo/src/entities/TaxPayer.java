package entities;

// TaxPayer é a super classe mais genérica, Individual e  
// Company são as sub classes mais especializadas
public abstract class TaxPayer {
	
	private String name;
	private Double anualIncome;
	
	public TaxPayer() {
	}
	
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getAnualIncome() {
		return anualIncome;
	}
	
	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract Double tax();
}