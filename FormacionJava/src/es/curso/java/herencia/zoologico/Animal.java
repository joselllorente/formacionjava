package es.curso.java.herencia.zoologico;

public abstract class Animal {
	private String nombre;
	private int edad;
	private double peso;
	private String tipo;
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String nombre, int edad, double peso, String tipo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso
				+ ", tipo=" + tipo + "]";
	}
	
	public void comer (){
		System.out.println("El animal esta comiendo");
		metodo1();
	}
	
	public void dormir (){
		System.out.println("El animal esta durmiendo");
	}
	
	private void metodo1() {
		
	}
	
	public abstract void beber ();
	
	
	
	
	
	
	
	
}
