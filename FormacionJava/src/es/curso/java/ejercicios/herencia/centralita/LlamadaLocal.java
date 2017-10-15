package es.curso.java.ejercicios.herencia.centralita;

public class LlamadaLocal extends Llamada {
	private double precio = 15;

	public LlamadaLocal(String numOrigen, String numDestino, double duracion) {
		super(numOrigen, numDestino, duracion);
	}

	public double calcularPrecio() {
		return getDuracion() * precio;
	}

	@Override
	public String toString() {
		return "Llamada Local # " + getNumOrigen() + " - # " + getNumDestino() + " - " + getDuracion() + "sg.";
	}
}
