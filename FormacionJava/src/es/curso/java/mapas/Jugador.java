package es.curso.java.mapas;


public class Jugador {
	private String nombre;
	private String apellidos;
	private String dni;
	private int dorsal;
	private int edad;
	private int aniosJugando;
	
	public Jugador() {
		super();
	}
	public Jugador(String nombre, String apellidos, String dni, int dorsal) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.dorsal = dorsal;
	}
	public Jugador(String nombre, String apellidos, String dni, int dorsal,
			int edad, int aniosJugando) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.dorsal = dorsal;
		this.edad = edad;
		this.aniosJugando = aniosJugando;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getAniosJugando() {
		return aniosJugando;
	}
	public void setAniosJugando(int aniosJugando) {
		this.aniosJugando = aniosJugando;
	}
	public String getDni() {
		return dni;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", apellidos=" + apellidos
				+ ", dni=" + dni + ", dorsal=" + dorsal + ", edad=" + edad
				+ ", aniosJugando=" + aniosJugando + "]";
	}
	
	
	
}
