package entities;

public class ContaBancaria {
	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	// construtor com 3 elementos
	public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		// encapsulamento : encapsula a regra de negocio relativa a deposito
		deposito(depositoInicial);
	}
	
	// construtor com 2 elementos
	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	// setNumeroConta nao é implementado pois numero da conta nunca é alterado
	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	// setSaldo nao será implementado pois saldo só é alterado por meio de deposito/saque
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	// 5 de taxa ao sacar
	public void saque(double valor) {
		saldo -= valor + 5;
	}
	
	// sobrescrita do metodo toString para imprimir o objeto conta formatado
	public String toString() {
		return "Conta: "+ numeroConta + ", Nome: " + nomeTitular + ", Saldo $: " + String.format("%.2f", saldo);		
	}
}
