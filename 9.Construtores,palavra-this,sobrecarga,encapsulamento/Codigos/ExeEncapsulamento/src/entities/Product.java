package entities;

public class Product {
	// Agora os atributos serão encapsulados - Private e será necessário implementar metodos get e set
	private String name;
	private double price;
	// Quantidade do produto só pode ser alterada quando houver entrada ou saida no estoque
	// isto é uma regra de negocio que proteje a integridade do produto
	// por isso não foi implementado o metodo set p/ esse atributo
	private int quantity;
	
	// Consturtor padrão - também é uma sobrecarga
	public Product() {
		
	}
	
	// Construtor - executa no momento da instanciação do objeto obriga que seja inicializados os
	// atributos do objeto. Os parametros do construtor nao precisam ter Os mesmos nomes do atributo
	public Product(String name, double price, int quantity) {
		// Atribui estes atributos/parametros, aos atributos do objeto - this é o atributo do objeto
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		 
		// Assim é possivel passar arugmentos diretamente na chamada do construtor
		// Product product = new Product("TV", 1500.0, 0);
	}
	
	// SOBRECARGA do construtor
	// um segundo construtor opicial, este nao possui quantidade de estoque
	// assim nao é obriigatorio passar o valor zero entre os parametors, pois 
	// automaticamente inicia em zero se nao for passado
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		// também nao é necessario a palavra this, e nao precisa atribuir zero, opcional
		// quantity = 0;
	}
	
	// metodos get e set p/ acesso aos atributos do objeto são colocados depois dos consturtores
	// metodo que get que retonrna o atributo name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	// Regra de negocio - nao ha o metodo setQuantity, pois este so pode ser 
	// alterado pela adiçao ou remoçao de produtos ,preservando assim sua integridade.
	public int getQuantity() {
		return quantity;
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