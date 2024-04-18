package entities;

public class SavingsAccount extends Account{

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	// construtor comr argumentos da classe Account
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		// executa o construtor da superclasse
		super(number, holder, balance);
		// Atribui a taxa de juros
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		// Operação que atualiza o saldo da 
		// conta com base na taxa de juros
		balance += balance * interestRate;
	}
}
