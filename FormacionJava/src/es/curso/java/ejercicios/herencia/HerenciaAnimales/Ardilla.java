package es.curso.java.ejercicios.herencia.HerenciaAnimales;

public class Ardilla extends Animal {
	private String cola;
	
	@Override
	public void comer() {
		System.out.println("La ardilla "+getNombre()+ " esta comiendo");
	}

	public String getCola() {
		return cola;
	}

	public void setCola(String cola) {
		this.cola = cola;
	}
	
	

}
