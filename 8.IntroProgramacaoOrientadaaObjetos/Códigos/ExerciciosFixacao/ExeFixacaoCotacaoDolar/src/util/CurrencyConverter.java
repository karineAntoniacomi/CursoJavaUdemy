package util;

public class CurrencyConverter {

	// Nome de variáveis static final sempre em letra maiúscula
	public static final double  IOF = 0.06;
		
	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
	}
}
