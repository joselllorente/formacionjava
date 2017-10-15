package es.curso.java.ejercicios.herencia.centralita;

public class LlamadaProvincial extends Llamada {
	private double precio1 = 20;
	private double precio2 = 25;
	private double precio3 = 30;
	int franja;

	public LlamadaProvincial(String numOrigen, String numDestino, double duracion, int franja) {
		super(numOrigen, numDestino, duracion);
		this.franja = franja;
	}

	public double calcularPrecio() {
		if (franja == 1)
			return getDuracion() * precio1;
		else if (franja == 2)
			return getDuracion() * precio2;
		else
			return getDuracion() * precio3;
	}

	@Override
	public String toString() {
		return "Llamada Provincial # " + getNumOrigen() + " - # " + getNumDestino() + " - " + getDuracion() + "sg"
				+ " - franja: " + franja;
	}
}
