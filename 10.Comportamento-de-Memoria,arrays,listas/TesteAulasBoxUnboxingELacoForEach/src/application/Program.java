package application;

public class Program {

	public static void main(String[] args) {
		
		//variavel do tipo primitivo
		int x = 20;
		
		//variavel do tipo Object do tipo referencia que é uma classe (a mais generica)
		//boxing = encaxotamento, onde pega-se um tipo valor comum e encaxotou em um objeto 
		Object obj = x;
		
		System.out.println(obj);
		
		//unboxing é o reverso: conversao de objeto do tipo referencia para tipo valor compativel
		//desencaixotando objeto e colocando em variavel do tipo valor
		int y = (int) obj;
		System.out.println(y);
		
		System.out.println();
		//WRAPPER CLASSES - são classes equivalentes aos tipos primitivos 
		//bonxig e unboxing é natural, nao precisa de casting
		int z = 30;
		Integer objeto = z;
		
		System.out.println(objeto);
		
		int w = objeto * 2;
		
		System.out.println(w);
		
		System.out.println();
		//LAOÇO FOR EACH - sintaxe simplificada para percorrer coleções 
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i<vect.length; i++) {
			//imprime cada um dos elementos do vetor
			System.out.println(vect[i]);
		}
		System.out.println("-------------");
		//mesma coisa porém com lalo for each
		// tipo dos elementos do vetor - apelido para cada elemento do vetor - nome da coleção
		for(String objt : vect) {  // = para cada objeto objt contido no vetor vect faça
			System.out.println(objt);
		}
		

	}
}
