package entities;

public class Triangle {
	// Declarando os 3 atributos da classe Triangle
	public double a;
	public double b;
	public double c;	
	
	// FUN��O de c�lculo da area do tri�ngulo
	/* public = fun��o pode ser usada em outro arquivo
	* double � o tipo de retorno da fun��o (area)
	* area(par�metros) = neste caso nao tem par�metros pois os atributos a, b e c sao suficientes */
	public double area() {
		//trabalhando com os atributos da classe Triangle
		double p = (a + b + c) / 2.0;
		//double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		//return result;
			//OU
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
