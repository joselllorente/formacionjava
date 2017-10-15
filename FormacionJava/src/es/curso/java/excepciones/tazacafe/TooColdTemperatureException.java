package es.curso.java.excepciones.tazacafe;

public class TooColdTemperatureException extends TemperatureException {

	public TooColdTemperatureException() {
		super();
		
	}

	public TooColdTemperatureException(String message) {
		super(message);
		
	}
	
}
