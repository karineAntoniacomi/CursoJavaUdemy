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
	
	// Se o m�todo � abstrado ent�o a classe tamb�m deve ser� 
	// abstrata (pois esta n�o tem a implementa��o do m�todo) 
	public abstract double area(); 
}
