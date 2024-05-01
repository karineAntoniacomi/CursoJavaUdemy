package entities;

import entities.enums.Color;

public class Rectangle extends Shape {

	private Double width;
	private Double height;

	public Rectangle() {
		super();
	}

	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {	
		this.height = height;	
		}
	
	// Como essa classe n�o � abstrata ela � obrigada a�implementar
	// /sobrescrever o m�todo abstrato Shape.area da superclasse�
	@Override 
	public double area() {
		return width * height; 
	}
}
