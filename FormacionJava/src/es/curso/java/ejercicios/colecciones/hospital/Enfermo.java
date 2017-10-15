package es.curso.java.ejercicios.colecciones.hospital;

import es.curso.java.ejercicios.constructores.Persona;


public class Enfermo extends Persona {
	private String enfermedad;

	public Enfermo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enfermo(String nombre, String apellidos, String dni, String enfermedad) {
		super(nombre, apellidos, dni);
		this.enfermedad = enfermedad;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public String toString() {
		super.toString();
		return "Enfermo [enfermedad=" + enfermedad + "]";
	}

	
}
