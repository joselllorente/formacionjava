package es.curso.java.ejercicios.herencia.HerenciaAnimales;

public abstract class Animal {
	
	private String nombre;
	private String raza;
	private int edad;
	
	public Animal() {
		super();
		System.out.println("Generando Animal");
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Animal(String nombre, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	
	
	public abstract void comer ();
	
	public void beber (){
		System.out.println("El animal esta bebiendo");
	}
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	
	
}
