package model.exceptions;

// RuntimeException - tipo de exceção que o compilador não obriga a tratar
// Se for apenas Exception ou ParseExeption o compilador obriga a tratar
public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	// Permite instanciar a exceção personalizada passando uma mensagem
	public DomainException(String msg) {
		super(msg);
	}
	
}
