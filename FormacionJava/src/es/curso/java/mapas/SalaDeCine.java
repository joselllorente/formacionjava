package es.curso.java.mapas;

public class SalaDeCine {
	private String nombre;
	private int numAsientos;
	private String pelicula;
	
	public SalaDeCine() {
		super();
	}

	public SalaDeCine(String nombre, int numAsientos, String pelicula) {
		super();
		this.nombre = nombre;
		this.numAsientos = numAsientos;
		this.pelicula = pelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumAsientos() {
		return numAsientos;
	}

	public void setNumAsientos(int numAsientos) {
		this.numAsientos = numAsientos;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "SalaDeCine [nombre=" + nombre + ", numAsientos=" + numAsientos
				+ ", pelicula=" + pelicula + "]";
	}
	
}
