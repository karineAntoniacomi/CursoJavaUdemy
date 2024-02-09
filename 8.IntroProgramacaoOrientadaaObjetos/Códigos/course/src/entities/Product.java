package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	// Retorna pre�o X quantidade	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		// this indica o aatributo da classe e n�o o par�metro da fun��o
		this.quantity += quantity; 
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	// Reecreve o m�todo da classe object possibilitando
	// imprimir os dados do objeto na forma de String formatada
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}
}

