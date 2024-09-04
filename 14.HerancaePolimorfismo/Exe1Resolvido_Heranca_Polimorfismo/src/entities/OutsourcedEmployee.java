package entities;

public class OutsourcedEmployee extends Employee {
	
	private Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}
	
	// construtor com argumentos da superclasse
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double aditionalCharge) {
		// repassa este p/ a superclasse
		super(name, hours, valuePerHour);
		this.additionalCharge = aditionalCharge;
	}

	public Double getAditionalCharge() {
		return additionalCharge;
	}

	public void setAditionalCharge(Double aditionalCharge) {
		this.additionalCharge = aditionalCharge;
	}

	// Sobrescreve a  regra de pagamento p/ 
	/// funcionario terceirazo, pois é diferente 
	// de funcionario comum
	@Override
	public double payment() {
		// metodo retorna o pagamento normal + 110% 
		// da despesa adicional de funcionario terceiizado
		return super.payment() + additionalCharge * 1.1;		
	}

}
