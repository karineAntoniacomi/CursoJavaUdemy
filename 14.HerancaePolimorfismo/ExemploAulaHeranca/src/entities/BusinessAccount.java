package entities;

// Classe BusinessAccount herda de Account, assim esta 
// ter� todos os dados e comportamentos de Account
public class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		// super() Chama o construtor da superclasse Account
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	// Emprestar = dinheiro entra na conta
	public void loan(double ammount) {
		// Verifica se o o valor a ser emprestado 
		// � menor ou igual ao limite de empr�stimo
		if(ammount <= loanLimit) {
			// deposit(ammount);
			balance += ammount - 10.0;
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		// reutilizando c�digo da superclasse 
		balance -= 2.0; // desconta mais 2
	}
}
