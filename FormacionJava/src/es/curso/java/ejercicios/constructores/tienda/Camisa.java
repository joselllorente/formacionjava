package es.curso.java.ejercicios.constructores.tienda;

import java.util.Arrays;

public class Camisa {
	private String talla;
	private String color;
	private double precio;
	private Boton [] botones;
	
	public Camisa(String talla, String color, double precio) {
		super();
		this.talla = talla;
		this.color = color;
		this.precio = precio;
	}

	public Camisa(String talla, String color, 
			double precio, Boton[] botones) {
		super();
		this.talla = talla;
		this.color = color;
		this.precio = precio;
		this.botones = botones;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
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

	public Boton[] getBotones() {
		return botones;
	}

	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}

	@Override
	public String toString() {
		return "Camisa [talla=" + talla + ", color=" + color + ", precio=" + precio + ", botones="
				+ Arrays.toString(botones) + "]";
	}
	
}
