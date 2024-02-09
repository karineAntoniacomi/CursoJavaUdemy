package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	// Construtor padrão - também é uma sobrecarga
	public Product() {
	}
	
	// Construtor - executa no momento da instanciação do objeto, obriga que seja
	// inicializados os atributos do objeto, os parametros do construtor nao precisam 
	// ter os mesmos nomes do atributo, mas o idel é ser o mesmo.
	public Product(String name, double price, int quantity) {
		// Atribui estes atributos/parametros, aos atributos do objeto - this é o atributo do objeto
		this.name = name; // this -> referencia ao proprio objeto
		this.price = price; 
		this.quantity = quantity;		 
		// Assim é possivel passar argumenttos diretamente na chamada do construtor
		// Product product = new Product("TV", 1500.0, 0);
	}
	
	// SOBRECARGA do construtor
	// Um segundo construtor opcial, este nao possui quantidade de estoque
	// assim nao é obrigatorio passar o valor zero entre os parametors, pois 
	// automaticamente inicia em zero se nao for passado
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		// Também nao é necessario a palavra this, e nao precisa atribuir zero, opcional
		// quantity = 0;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}