package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		//lista de numeros inteiros - não aceita tipos primitivos 
		// <> é generics - parametrizacao de tipo, informando outro tipo
		List<String> list = new ArrayList<>();  //classe ArrayList que implementa a interface List
		
		//adicioando elementos na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		//inserindo elementos na posicao 2 da lista
		list.add(2, "Marco");
		
		//removendo elementos da Lista 
	//	list.remove("Anna");

		
		//tamanho da lista
		System.out.println(list.size());
		//percorrer a lista com For Each
		for(String x : list) {
			System.out.println(x);
		}			

		System.out.println("------------------");
		//removendo quem esta na posicao 1
//		list.remove(1);
		//removendo elementos dpor predicado (primeira letra, por ex)
		//remove todo String x, tal que char na posicao zero de x seja igual a M
		list.removeIf(x -> x.charAt(0) == 'M');  
		for(String x : list) {
			System.out.println(x);
		}	
		System.out.println("------------------");
		//encontrar a posicao de um elemento
		System.out.println("Index of Bob: " + list.indexOf("Bob"));

		//encontrar um elemento que na oexiste na lista (retorna -1)
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("------------------");

		//Deixar na lista somente quem tem nome coemçando com A

		//declarar nova lista  - pega a lista list e filtra somente os valores que começam com A,
		//devolvendo assim uma nova lista somente com os elementos escolhidos
		
		//stream() é um tipo especial do java que aceita operaçoes com expressoes lambda
		//list é convertido para o tipo stream()
		//apartir do stream() chama-se a função filter que recebe o predicado
		//stream() não é compativel com List, por isso é convertido novamente
		//para Lista - chamando-se a função collect
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}	
		//Encontrar elemento da lista que atenda certo Predicado
		//encontrar primeiro elemento que começa com A
		System.out.println("------------------");
		
		//funcao findFir pega o primeiro elemento do Stream, retornando um tipo Optional
		// orElse(null) retorna nulo se o elemento buscado não existir
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		

		// orElse(null) retorna nulo se o elemento buscado não existir
		String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name2);
	}
}
