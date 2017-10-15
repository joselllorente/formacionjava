package es.curso.java.herencia.zoologico;

public class Elefante extends Animal{
	private int numCuernos;

	public Elefante() {
		super();
	}

	public Elefante(String nombre, int edad, double peso, String tipo) {
		super(nombre, edad, peso, tipo);
	}

	public Elefante(String nombre, int edad, double peso, String tipo,
			int numCuernos) {
		super(nombre, edad, peso, tipo);
		this.numCuernos = numCuernos;
	}

	public int getNumCuernos() {
		return numCuernos;
	}

	public void setNumCuernos(int numCuernos) {
		this.numCuernos = numCuernos;
	}

	@Override
	public void comer() {
		super.comer();
		System.out.println("Pastando");
	}

	@Override
	public String toString() {
		return "Elefante [numCuernos=" + numCuernos + "]";
	}
	
	public void moverTrompa(){
		System.out.println("El elefante "+getNombre() + " esta moviendo la trompa");
	}
	
}
