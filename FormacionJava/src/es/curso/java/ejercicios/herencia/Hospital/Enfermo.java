package es.curso.java.ejercicios.herencia.Hospital;

public class Enfermo extends Persona{

	private String patologia;
	
	public Enfermo() {
		super();
		patologia = "";
	}

	public Enfermo(String nombre, String apellido, int edad,String dni,String patologia) {
		super(nombre, apellido, edad,dni);
		this.patologia = patologia;
	}

	public String getPatologia() {
		return patologia;
	}

	public void setPatologia(String patologia) {
		this.patologia = patologia;
	}
	
	
	public void mostrarDatos(){
		super.mostrarDatos();
		System.out.println("Con patologia "+patologia);
	}

}
