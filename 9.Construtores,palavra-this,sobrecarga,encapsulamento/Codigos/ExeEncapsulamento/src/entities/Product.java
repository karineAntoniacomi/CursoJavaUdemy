package entities;

public class Product {
	// Agora os atributos ser�o encapsulados - Private e ser� necess�rio implementar metodos get e set
	private String name;
	private double price;
	// Quantidade do produto s� pode ser alterada quando houver entrada ou saida no estoque
	// isto � uma regra de negocio que proteje a integridade do produto
	// por isso n�o foi implementado o metodo set p/ esse atributo
	private int quantity;
	
	// Consturtor padr�o - tamb�m � uma sobrecarga
	public Product() {
		
	}
	
	// Construtor - executa no momento da instancia��o do objeto obriga que seja inicializados os
	// atributos do objeto. Os parametros do construtor nao precisam ter Os mesmos nomes do atributo
	public Product(String name, double price, int quantity) {
		// Atribui estes atributos/parametros, aos atributos do objeto - this � o atributo do objeto
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		 
		// Assim � possivel passar arugmentos diretamente na chamada do construtor
		// Product product = new Product("TV", 1500.0, 0);
	}
	
	// SOBRECARGA do construtor
	// um segundo construtor opicial, este nao possui quantidade de estoque
	// assim nao � obriigatorio passar o valor zero entre os parametors, pois 
	// automaticamente inicia em zero se nao for passado
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		// tamb�m nao � necessario a palavra this, e nao precisa atribuir zero, opcional
		// quantity = 0;
	}
	
	// metodos get e set p/ acesso aos atributos do objeto s�o colocados depois dos consturtores
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
	// alterado pela adi�ao ou remo�ao de produtos ,preservando assim sua integridade.
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