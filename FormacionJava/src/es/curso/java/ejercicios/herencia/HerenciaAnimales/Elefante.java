package es.curso.java.ejercicios.herencia.HerenciaAnimales;

public class Elefante extends Animal{

	private String trompa;
	
	public Elefante() {
		super();
		System.out.println("Generando Elefante");
	}
	
	
	public Elefante (String nombre){
		super(nombre);
	}

	
	public Elefante (String nombre,int edad, String raza, String trompa){
		super(nombre,raza,edad);
		this.trompa = trompa;
	}
	
	public void comer (){
		System.out.println("El elefante "+getNombre()+ " esta comiendo");
	}

	public String getTrompa() {
		return trompa;
	}

	public void setTrompa(String trompa) {
		this.trompa = trompa;
	}
	
}
