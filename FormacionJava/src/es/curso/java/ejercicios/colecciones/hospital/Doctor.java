package es.curso.java.ejercicios.colecciones.hospital;

import java.util.HashSet;
import java.util.Set;

import es.curso.java.ejercicios.constructores.Persona;

public class Doctor extends Persona implements EmpleadoHospital, Universitario{
	
	private String especialidad;
	private Set<Enfermo> enfermos;
	int aniosEstudio;
	private int id;
	
	public Doctor() {
		super();
		enfermos = new HashSet<Enfermo>();
	}
	public Doctor(String nombre, String apellidos, String dni, int edad,
			double peso, String especialidad) {
		super(nombre, apellidos, dni, edad, peso);
		this.especialidad = especialidad;
		enfermos = new HashSet<Enfermo>();
	}
	public Doctor(String nombre, String apellidos, String dni, String especialidad) {
		super(nombre, apellidos, dni);
		this.especialidad = especialidad;
		enfermos = new HashSet<Enfermo>();
	}
	
	public Doctor(String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
		enfermos = new HashSet<Enfermo>();
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public Set<Enfermo> getEnfermos() {
		return enfermos;
	}
	public void setEnfermos(Set<Enfermo> enfermos) {
		this.enfermos = enfermos;
	}
	
	public boolean tratarPaciente (Paciente paciente){
		boolean estaEnfermo = false;
		System.out.println("Doctor "+getNombre() +
				" tratando al apciente "+paciente.getNombre());
		
		if (Math.random()>0.5){
			estaEnfermo = true;
			Enfermo e = new Enfermo (paciente.getNombre(), paciente.getApellidos(), paciente.getDni(), "Gripe");
			enfermos.add(e);
		}
		
		return estaEnfermo;
	}
	@Override
	public void fichar() {
		System.out.println("El doctor "+getNombre()+" esta fichando");
		
	}
	@Override
	public void descansar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getAniosEstudio() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setAniosEstudio(int aniosEstudio) {
		// TODO Auto-generated method stub
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}
