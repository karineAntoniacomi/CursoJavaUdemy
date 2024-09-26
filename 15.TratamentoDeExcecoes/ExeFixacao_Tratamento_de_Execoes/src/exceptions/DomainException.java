package exceptions;

public class DomainException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	// Permite instanciar a exce��o personalizada passando mensagem
	public DomainException(String msg) {
		super(msg);
	}
}
