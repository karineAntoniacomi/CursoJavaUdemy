package entities;

import java.sql.Date;

public class Order {
	
	private Date date;
	private Product product;
	
	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;
		//pode acessar o atributo name, que está em outra classe, pois o Modificador de 
		//acesso Private foi removido
		this.product.name = "TV";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
