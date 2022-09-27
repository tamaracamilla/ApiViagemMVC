package br.com.service.exeption;

public class ObjectNotFoundExeption extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundExeption (String message) {
		super (message);
		
	}

	public ObjectNotFoundExeption (String message , Exception exception) {
		super (message , exception);
		
	}
	public ObjectNotFoundExeption (Exception exception) {
		super (exception);
		
	}
}
