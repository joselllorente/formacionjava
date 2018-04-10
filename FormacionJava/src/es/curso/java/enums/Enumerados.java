package es.curso.java.enums;

import es.curso.java.ejercicios.colecciones.hospital.Doctor;

public enum Enumerados {
	HOSPITAL1("Dir1",120),
	HOSPITAL2("Dir2",240), 
	HOSPITAL3("Dir3",180,"Madrid"),
	HOSPITAL4("Dir4",500,"Localidad"),
	HOSPITAL5(new Doctor ("Nombre","Apellido","DNI")),
	VEHICULO1("MArca1","Modelo1");
	
	private String direccion;
	private int capacidad;
	private String localidad;
	private Doctor doctor;
	
	Enumerados (String marca, String modelo){
		
	}
	
	Enumerados (Doctor d){
		this.doctor = d;
	}
	
	Enumerados (String direccion, int capacidad){
		this.direccion=direccion;
		this.capacidad=capacidad;
	}
	
	Enumerados (String direccion, int capacidad, String localidad){
		this(direccion,capacidad);
		//this.capacidad=capacidad;
		this.localidad = localidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public Doctor getDoctor() {
		return doctor;
	}
	
	
	
}
