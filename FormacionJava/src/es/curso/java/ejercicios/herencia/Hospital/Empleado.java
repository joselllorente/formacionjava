package es.curso.java.ejercicios.herencia.Hospital;

public class Empleado extends Persona{

	
	private String sala;
	
	public Empleado(){
		super();
		sala = "";
	}

	public Empleado(String nombre, String apellido, int edad,String dni,String sala) {
		super(nombre, apellido, edad,dni);
		this.sala = sala;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	@Override
	public String toString()  {
		String texto  ="Empleado " + super.toString();
		texto += "trabaja en la sala " + this.sala;
		return texto;
	}

	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		super.mostrarDatos();
		System.out.println("Empleado trabajando en sala "+sala);
	}
	
	
	
	
}
