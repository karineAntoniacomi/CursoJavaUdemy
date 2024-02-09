/* Fazer um programa para ler os valores da largura e altura de um retângulo.
 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
 * Usar uma classe como mostrado no projeto ao lado. */

package entities;

// Nme de Classes sempre começa com letra Maiúscula
// Classe Retângulo, com atributos e métodos relacionados a entidade / Objeto Retângulo
public class Rectangle {
		// Prefixo "public" indica que o atributo ou método pode ser usado em outros arquivos
		public double width;   //Altura
		public double height;  //Largura
		
		// Métodos da classe Retangulo
		public double area() {
		// A = b * h
		    return width * height;
		}
		
		public double perimeter(){ 
		// P = 2(b + h)
		    return 2 * (width + height);
		}
		
		public double diagonal() {
		// Raiz quadrada de d = h^2 + b^2 --- divide-se em 2 triangulos, teorema de Pitágoras
		       return Math.sqrt(width * width + height * height);    
		}
}
