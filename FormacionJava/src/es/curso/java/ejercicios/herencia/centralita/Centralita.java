package es.curso.java.ejercicios.herencia.centralita;

public class Centralita {
	private int cont = 0;
	private double acum = 0;

	public int getTotalLlamadas() {
		return cont;
	}

	public double getTotalFacturado() {
		return acum;
	}

	public void registrarLlamadas(Llamada param) {
		System.out.println(param);
		cont++;
		acum += param.calcularPrecio();
	}
}
