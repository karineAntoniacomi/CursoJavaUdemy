package entities;

import entities.enums.Color;

public class Circle extends Shape {
	
	private Double radius;
	
	public Circle() {	
		super();	
	}

	public Circle(Color color, Double radius) {	
		super(color);	
		this.radius = radius;
	}

	public Double getRadius() {	
		return radius;	
	}
	
	public void setRadius(Double radius) {	
		this.radius = radius;	
	}
		
	// Como essa classe n�o � abstrata ela � obrigada a�implementar
	// /sobrescrever o m�todo abstrato�Shape.area da superclasse� 
	@Override 
	public double area() {
		return Math.PI * radius * radius; 
	}
}