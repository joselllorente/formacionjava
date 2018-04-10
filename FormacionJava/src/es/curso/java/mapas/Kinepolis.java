package es.curso.java.mapas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import es.curso.java.ejercicios.colecciones.hospital.Doctor;
import es.curso.java.ejercicios.colecciones.hospital.Enfermero;
import es.curso.java.ejercicios.colecciones.hospital.Paciente;
import es.curso.java.ejercicios.constructores.Persona;

public class Kinepolis {

	public static void main(String[] args) {
		SalaDeCine sala1 = new SalaDeCine("sala1", 2, "Pelicula1");
		SalaDeCine sala2 = new SalaDeCine("sala2", 1, "Pelicula2");
		SalaDeCine sala3 = new SalaDeCine("sala3", 2, "Pelicula3");
		
		List<Persona> personasSala1 = new ArrayList<Persona>();
		
		List<Persona> personasSala2 = new ArrayList<Persona>();
		
		List<Persona> personasSala3 = new ArrayList<Persona>();
		
		
		Map <SalaDeCine, List<Persona> > cine 
					= new HashMap<SalaDeCine, List<Persona>>();
		
		
		
		cine.put(sala1, personasSala1);
		cine.put(sala2, personasSala2);
		cine.put(sala3, personasSala3);
		
		Persona persona1 = new Persona("Nombre1","ZApe1","1111A");
		Persona persona2 = new Persona("Nombre2","Ape2","2222B");
		Persona persona3 = new Persona("Nombre3","FApe3","3333C");
		Persona persona4 = new Persona("Nombre4","SApe4","4444D");
		Persona persona5 = new Persona("Nombre5","LApe5","4444D");
		Paciente paciente1 = new Paciente("Paciente1","Ape5","4444D","Dolor cabeza");
		
		Persona[] personas = {persona1,persona2,persona3,persona4,
				persona5, paciente1};

		
		Set<Entry<SalaDeCine,List<Persona>>> entryCine 
		= cine.entrySet();
		
		for (Persona espectador : personas) {
			boolean encontroSala=false;
			System.out.println(espectador.getNombre() + " esperando sala ");
			
			for (Entry<SalaDeCine, List<Persona>> entry : entryCine) {
				
				SalaDeCine salaCine = entry.getKey();
				List<Persona> personasSala = entry.getValue();
				
				if (personasSala.size()<salaCine.getNumAsientos()){
					personasSala.add(espectador);
					System.out.println(espectador.getNombre() + 
							" entro en la sala "+salaCine.getNombre());
					encontroSala=true;
					break;
				}
			}
			
			if (!encontroSala){
				System.out.println("Es espectador "+espectador.getNombre() 
						+" se ha quedado sin sala");
			}
			
		}

//		Kinepolis kine = new Kinepolis();
//		kine.pintaSalas(cine);
		pintaSalas(cine);
	}
	
	
	private static void pintaSalas(Map<SalaDeCine,List<Persona>> cine){
		
		Set<SalaDeCine> keySalas =	cine.keySet();
		for (SalaDeCine salaDeCine : keySalas) {
			System.out.println("=====================================");
			System.out.println(salaDeCine.toString());
			System.out.println("=====================================");
			List<Persona> personas = cine.get(salaDeCine);
			
			for (Persona persona : personas) {
				System.out.println("\t"+persona);
			}
		}
		
		
		
	}

}






