package es.curso.java.ejercicios.colecciones.hospital;

import es.curso.java.ejercicios.constructores.Persona;

public class Paciente extends Persona {
	private String sintoma;

	public Paciente() {
		super();
	}

	public Paciente(String nombre, String apellidos, String dni, String sintoma) {
		super(nombre, apellidos, dni);
		this.sintoma = sintoma;
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	@Override
	public String toString() {
		super.toString();
		return "Paciente [sintoma=" + sintoma + "]";
	}
	
	
	
	
}
