package es.curso.java.ejercicios.colecciones.hospital;

import es.curso.java.ejercicios.constructores.Persona;

public class Enfermero extends Persona implements EmpleadoHospital{
	private String especialidad;

	public Enfermero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enfermero(String nombre, String apellidos, String dni, int edad,
			double peso, String especialidad) {
		super(nombre, apellidos, dni, edad, peso);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		super.toString();
		return "Enfermero [especialidad=" + especialidad + "]";
	}
	
	@Override
	public void fichar() {
		System.out.println("El enfermero "+getNombre()+" esta fichando");
		
	}
	@Override
	public void descansar() {
		// TODO Auto-generated method stub
		
	}

}
