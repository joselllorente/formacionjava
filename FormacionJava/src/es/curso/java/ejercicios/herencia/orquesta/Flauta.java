package es.curso.java.ejercicios.herencia.orquesta;

public class Flauta extends Instrumento {
	private String modelo;

//	public Flauta() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
	public Flauta(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}

	public Flauta(String nombre, String tipo, String modelo) {
		super(nombre, tipo);
		this.modelo = modelo;
	}

	public String getModelo() {
		
		setNombre("");
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

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}
	
	public void metodo1() {
		
	}
	
}
