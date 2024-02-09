package entities;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	// Retorna preço X quantidade	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		// this indica o aatributo da classe e não o parâmetro da função
		this.quantity += quantity; 
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	// Reecreve o método da classe object possibilitando
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

