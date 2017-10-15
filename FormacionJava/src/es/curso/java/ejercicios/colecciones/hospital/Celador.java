package es.curso.java.ejercicios.colecciones.hospital;

import es.curso.java.ejercicios.constructores.Persona;

public class Celador extends Persona implements EmpleadoHospital{
	String planta;

	public Celador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Celador(String nombre, String apellidos, String dni, int edad,
			double peso, String planta) {
		super(nombre, apellidos, dni, edad, peso);
		this.planta = planta;
	}

	public String getPlanta() {
		return planta;
	}

	public void setPlanta(String planta) {
		this.planta = planta;
	}

	@Override
	public String toString() {
		super.toString();
		return "Celador [planta=" + planta + "]";
	}
	
	@Override
	public void fichar() {
		System.out.println("El doctor "+getNombre()+" esta fichando");
		
	}
	@Override
	public void descansar() {
		// TODO Auto-generated method stub
		
	}
}
