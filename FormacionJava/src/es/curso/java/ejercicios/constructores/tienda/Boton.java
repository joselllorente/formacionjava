package es.curso.java.ejercicios.constructores.tienda;

public class Boton {
	
	private String tamanio;
	private String color;
	
	public Boton(String tamanio, String color) {
		super();
		this.tamanio = tamanio;
		this.color = color;
	}
	
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Boton [tamanio=" + tamanio + ", color=" + color + "]";
	}
}
