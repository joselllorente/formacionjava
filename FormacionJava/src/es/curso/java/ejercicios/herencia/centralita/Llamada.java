package es.curso.java.ejercicios.herencia.centralita;

public abstract class Llamada {
	private String numOrigen;
	private String numDestino;
	private double duracion;

	public Llamada(String numOrigen, String numDestino, double duracion) {
		this.numOrigen = numOrigen;
		this.numDestino = numDestino;
		this.duracion = duracion;
	}

	public String getNumOrigen() {
		return numOrigen;
	}

	public String getNumDestino() {
		return numDestino;
	}

	public double getDuracion() {
		return duracion;
	}

	public abstract double calcularPrecio();
}
