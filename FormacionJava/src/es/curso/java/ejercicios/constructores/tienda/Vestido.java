package es.curso.java.ejercicios.constructores.tienda;

public class Vestido {
	private String color;
	private double precio;
	
	public Vestido(String color, double precio) {
		super();
		this.color = color;
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Vestido [color=" + color + ", precio=" + precio + "]";
	}
	
	
}
