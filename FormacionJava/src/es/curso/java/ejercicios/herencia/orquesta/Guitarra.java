package es.curso.java.ejercicios.herencia.orquesta;

import es.curso.java.herencia.Interface1;

public class Guitarra extends Instrumento implements Interface1{
	private int numCuerdas;

	public Guitarra() {
		super();
	}

	public Guitarra(String nombre, String tipo) {
		super(nombre, tipo);
	}

	public Guitarra(String nombre, String tipo, int numCuerdas) {
		super(nombre, tipo);
		this.numCuerdas = numCuerdas;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	@Override
	public void metodo1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String metodo2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void metodo3(int num, String... strings) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodo5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void limpiar() {
		System.out.println("Limpiando Guitarra");
		
	}

}
