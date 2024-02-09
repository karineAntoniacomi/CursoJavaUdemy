/* Fazer um programa para ler os valores da largura e altura de um ret�ngulo.
 * Em seguida, mostrar na tela o valor de sua �rea, per�metro e diagonal.
 * Usar uma classe como mostrado no projeto ao lado. */

package entities;

// Nme de Classes sempre come�a com letra Mai�scula
// Classe Ret�ngulo, com atributos e m�todos relacionados a entidade / Objeto Ret�ngulo
public class Rectangle {
		// Prefixo "public" indica que o atributo ou m�todo pode ser usado em outros arquivos
		public double width;   //Altura
		public double height;  //Largura
		
		// M�todos da classe Retangulo
		public double area() {
		// A = b * h
		    return width * height;
		}
		
		public double perimeter(){ 
		// P = 2(b + h)
		    return 2 * (width + height);
		}
		
		public double diagonal() {
		// Raiz quadrada de d = h^2 + b^2 --- divide-se em 2 triangulos, teorema de Pit�goras
		       return Math.sqrt(width * width + height * height);    
		}
}
