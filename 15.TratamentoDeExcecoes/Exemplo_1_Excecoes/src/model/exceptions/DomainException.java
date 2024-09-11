package model.exceptions;

// RuntimeException - tipo de exce��o que o compilador n�o obriga a tratar
// Se for apenas Exception ou ParseExeption o compilador obriga a tratar
public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	// Permite instanciar a exce��o personalizada passando uma mensagem
	public DomainException(String msg) {
		super(msg);
	}
	
}
