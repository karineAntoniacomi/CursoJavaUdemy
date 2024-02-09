package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

// Instancie manualmente (hard code) os 
// objetos mostrados abaixo (Post, Comment)
// e mostre-os na tela do terminal.

public class Program {

	public static void main(String[] args) throws ParseException {
	
		// Usado para instancia a data/instante com máscara
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// POST 1
		// Instanciando objetos do tipo Comment
		Comment c1 = new Comment("Have a  nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
	  
		// Instanciando objetos Post
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!", 
				12);
		
		// Adiciona no Post 1 os 2 comentários instanciados
		p1.addComment(c1);
		p1.addComment(c2);
		
		// POST 2
		// Instanciando objetos do tipo Comment
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("Maybe the Force be with you");
	  
		// Instanciando objetos Post
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		
		// Adiciona no Post 2 os 2 comentários instanciados
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
