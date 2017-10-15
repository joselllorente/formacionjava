package es.curso.java.ejercicios.herencia.orquesta;

public class Instrumento {
	private String nombre;
	private String tipo;
	
	public Instrumento() {
		super();
	}
	public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void tocar (){
		System.out.println("Tocando el instrumento "+this.nombre);
	}
	
	public void afinar (){
		System.out.println("Afinando el instrumento "+this.nombre);
	}
	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
	
}
