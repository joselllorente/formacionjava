package es.curso.java.enums;

public enum Enumerados {
	HOSPITAL1("Dir1",120),
	HOSPITAL2("Dir2",240), 
	HOSPITAL3("Dir3",180);
	
	private String direccion;
	private int capacidad;
	
	Enumerados (String direccion, int capacidad){
		this.direccion=direccion;
		this.capacidad=capacidad;
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
}
