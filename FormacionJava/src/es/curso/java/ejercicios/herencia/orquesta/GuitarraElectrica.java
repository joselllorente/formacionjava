package es.curso.java.ejercicios.herencia.orquesta;

public final class GuitarraElectrica extends Guitarra {
	private double potencia;

	public GuitarraElectrica() {
		super();
	}

	public GuitarraElectrica(String nombre, String tipo, int numCuerdas) {
		super(nombre, tipo, numCuerdas);
	}

	public GuitarraElectrica(String nombre, String tipo, int numCuerdas,
			double potencia) {
		super(nombre, tipo, numCuerdas);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public void tocar() {
		System.out.println("Tocando guitarra electrica");
	}
	
}
