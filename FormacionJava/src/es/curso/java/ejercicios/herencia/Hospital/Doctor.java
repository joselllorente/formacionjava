package es.curso.java.ejercicios.herencia.Hospital;

public class Doctor extends Persona{

	private Enfermo enfermo;
	private String especialidad;
	
	public Doctor(){
		super();
		especialidad = "";
		//enfermo = null;
	}

	public Doctor(String nombre, String apellido, int edad,String dni,String especialidad) {
		super(nombre, apellido, edad,dni);
		this.especialidad = especialidad; 
		enfermo = null;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public void setEnfermo(Enfermo enfermo){
		this.enfermo = enfermo;
	}
	
	public Enfermo getEnfermo(){
		return enfermo;
	}
	
	public boolean tieneEnfermo(){
		if(this.enfermo == null)
			return false;
		else 
			return true;
	}

	@Override
	public String toString() {
		String texto = "El medico: " + super.toString();
			   texto += "tiene " + this.especialidad + " de especialidad";
		return texto;
	}
	
	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		super.mostrarDatos();
		System.out.println("Con especialidad "+especialidad);
		if (tieneEnfermo()){
			System.out.println("Tiene un enfermo asociado:");
			enfermo.mostrarDatos();
		}
	}
	
	
}
