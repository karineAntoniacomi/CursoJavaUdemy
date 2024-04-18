package entities;

public class Account {

	private Integer number;
	private String holder;
	protected Double balance;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	// apenas getBalance, o setBalance não pode ser 
	// utilizado pois o saldo da conta não pode ser
	// alterado livremente
	public Double getBalance() {
		return balance;
	}

	// saque = descontar do saldo
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	// depositar = adicionar ao saldo
	public void deposit(double amount) {
		balance += amount;
	}
}
