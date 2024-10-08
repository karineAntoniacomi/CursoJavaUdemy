package entities;

import exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder; // titular
	private Double balance; // saldo
	private Double withdrawLimit; // limite de saque

	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
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

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public void deposit(double amount) {
		this.balance += amount;

	}

	public void withdraw(double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}

	private void validateWithdraw(double amount) {
		if (amount > getWithdrawLimit()) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit.");
		}

		if (amount > getBalance()) {
			throw new DomainException("Withdraw error: Not enough balance.");
		}
	}
}
