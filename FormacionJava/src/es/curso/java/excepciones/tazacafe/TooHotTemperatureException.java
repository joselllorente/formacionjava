package es.curso.java.excepciones.tazacafe;

public class TooHotTemperatureException extends TemperatureException {

	public TooHotTemperatureException() {
		super();
	}

	public TooHotTemperatureException(String message) {
		super(message);
	}
	
}
