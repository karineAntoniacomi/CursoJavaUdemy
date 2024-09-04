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
	
	// desconta do saldo da conta sem a taxa de 5 pois é conta 
	// poupança. Como se esta sobrecrevendo um metodo da superclasse, 
	// usa-se a anotação @overrride
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
	
}
