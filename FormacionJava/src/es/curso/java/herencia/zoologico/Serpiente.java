package es.curso.java.herencia.zoologico;

public class Serpiente extends Animal {
	boolean venosa;

	public Serpiente() {
		super();
	}

	public Serpiente(String nombre, int edad, double peso, String tipo) {
		super(nombre, edad, peso, tipo);
	}

	public Serpiente(String nombre, int edad, double peso, String tipo,
			boolean venosa) {
		super(nombre, edad, peso, tipo);
		this.venosa = venosa;
	}

	public boolean isVenosa() {
		return venosa;
	}
	public void setVenosa(boolean venosa) {
		this.venosa = venosa;
	}

	@Override
	public void comer() {
		System.out.println("La serpiente "+getNombre() + " est� deglutiendo");
	}

	@Override
	public void beber() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
