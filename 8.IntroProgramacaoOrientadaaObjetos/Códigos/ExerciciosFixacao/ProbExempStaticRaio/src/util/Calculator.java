package util;

public class Calculator {
	
	// pi � est�tico, independende de qualquer objeto sempre ser� o mmesmo valor
	public static final double PI = 3.14159;
	
	// o mesmo vale para estes m�todos, ser�o sempre os mesmos (se tiverem 
	// o mesmo valor) independente de qual seja o objetivo
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius /3;
	}

}
