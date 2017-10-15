package es.curso.java.ejercicios.mapasyenums;

import es.curso.java.ejercicios.constructores.Persona;

public enum EnumPersonas {

	PERSONA1 ("Nombre1","Apellido1","DNI1"),
	PERSONA2 ("Nombre2","Apellido2","DNI2"),
	PERSONA3 ("Nombre3","Apellido3","DNI3"),
	PERSONA4 (new Persona("Nombre4","Apellido4","DNI4"));
	
	private String nombre;
	private String apellidos;
	private String dni;
	private Persona persona;
	private EnumPersonas(String nombre, String apellidos, String dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	private EnumPersonas(Persona p) {
		this.persona = p;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
}
