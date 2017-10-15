package es.curso.java.threads.supermercado;

import java.util.Arrays;

import es.curso.java.ejercicios.constructores.Persona;

public class ClienteSupermercado extends Persona {
	
	private double[] preciosProductos;

	public ClienteSupermercado() {
		super();
	}

	public ClienteSupermercado(String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
	}

	public ClienteSupermercado(String nombre, String apellidos, String dni,
			double[] preciosProductos) {
		super(nombre, apellidos, dni);
		this.preciosProductos = preciosProductos;
	}

	public double[] getPreciosProductos() {
		return preciosProductos;
	}

	public void setPreciosProductos(double[] preciosProductos) {
		this.preciosProductos = preciosProductos;
	}

	@Override
	public String toString() {
		return "ClienteSupermercado [preciosProductos="
				+ Arrays.toString(preciosProductos) + "]";
	}
	
	
	
	
	
}
