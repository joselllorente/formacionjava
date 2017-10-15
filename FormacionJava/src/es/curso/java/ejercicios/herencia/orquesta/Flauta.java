package es.curso.java.ejercicios.herencia.orquesta;

public class Flauta extends Instrumento {
	private String modelo;

	public Flauta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flauta(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}

	public Flauta(String modelo) {
		super();
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public void tocar() {
		super.tocar();
		System.out.println("Soplando");
	}
	
	
}
