package es.curso.java.ejercicios.herencia.orquesta;

public class Tambor extends Instrumento {
	private String tamanio;

	public Tambor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tambor(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}

	public Tambor(String nombre, String tipo, String tamanio) {
		super(nombre, tipo);
		this.tamanio = tamanio;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
	public void aporrear (){
		System.out.println("Aporreando el tambor " + getNombre());
	}
}
