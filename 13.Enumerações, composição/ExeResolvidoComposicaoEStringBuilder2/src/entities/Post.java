package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	// Declara uma Constante para não precisar
	// instanciar mais vezes o SimpleDateFormat
	// private static não permite que haja cópia 
	// deste objeto para cada post da aplicação
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	// Associação - 1 post pode ter vários comentários
	// lista do tipo Comment
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	// Para lista, somente o get será implementado 
	// neste caso não pode haver um set comum
	// que receba outra lista de comentários
	public List<Comment> getComments() {
		return comments;
	}
		
	// No lugar de um setComment deve ser usado
	// este que adiciona um comentário na lista
	// e recebe um comentario como argumento
	public void addComment(Comment comment) {
		// Vai na lista de comentários comments
		// que chama o método add para adicionar 
		// na lista o comentário recebido como argumento
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		// Vai na lista de comentários comments
		// que chama o método remove para remover 
		// da lista o comentário recebido como argumento
		comments.remove(comment);
	}
	
	// toString com a classe StringBuilder pois 
	// consome menos memoria e é mais otimizada 
	// (do que apenas concatenar) e útil quando 
	// se tem de escrever um String grande
	// a partir de strings menores
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// objeto sb agora permite concanetar
		// outros string usando a função append
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		// para acrescentar a data, é necessário ter uma
		// instancia do SimpleDateFormat nesta classe também
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		// Texto de cada comentário associado ao post
		// para cada Comment c na lista de comments do post
		for(Comment c : comments) {
			// Acrescenta todos os comentários no StringBuilder
			sb.append(c.getText() + "\n");
		}
		// Converte o StringBuilder para String
		return sb.toString();
	}
}
