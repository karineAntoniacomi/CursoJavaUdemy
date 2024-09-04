package entities;

import entities.enums.Color;

public abstract class Shape {
	
	private Color color;

	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {	
		this.color = color;	
	}
	
	// Se o método é abstrado então a classe também deve ser  
	// abstrata (pois esta não tem a implementação do método) 
	public abstract double area(); 
}
