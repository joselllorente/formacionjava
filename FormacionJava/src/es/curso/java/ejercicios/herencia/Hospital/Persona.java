package es.curso.java.ejercicios.herencia.Hospital;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private int edad;
	
	///Constructores
	public Persona(){
		this.nombre = "";
		this.apellido = "";
		this.dni="";
		this.edad = 0;
	}
	
	public Persona (String nombre,String apellido,int edad,String dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}

	
	///Geters y seters
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarDatos(){
		String texto  = this.getNombre() + " " + this.getApellido();
		   texto += ", tiene un dni con el numero: " + this.getDni() + ", Una edad de: " + this.getEdad() + " a�os, " ;

		System.out.println(texto);
	}
	
}
