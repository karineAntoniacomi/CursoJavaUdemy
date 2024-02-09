package util;

public class Calculator {
	
	// pi é estático, independende de qualquer objeto sempre será o mmesmo valor
	public static final double PI = 3.14159;
	
	// o mesmo vale para estes métodos, serão sempre os mesmos (se tiverem 
	// o mesmo valor) independente de qual seja o objetivo
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius /3;
	}

}
