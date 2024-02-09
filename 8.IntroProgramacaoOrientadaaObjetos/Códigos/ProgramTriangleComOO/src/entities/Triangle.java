package entities;

public class Triangle {
	// Declarando os 3 atributos da classe Triangle
	public double a;
	public double b;
	public double c;	
	
	// FUNÇÃO de cálculo da area do triângulo
	/* public = função pode ser usada em outro arquivo
	* double é o tipo de retorno da função (area)
	* area(parâmetros) = neste caso nao tem parâmetros pois os atributos a, b e c sao suficientes */
	public double area() {
		//trabalhando com os atributos da classe Triangle
		double p = (a + b + c) / 2.0;
		//double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		//return result;
			//OU
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
