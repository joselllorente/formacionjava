package es.curso.java.ejercicios.mapasyenums;

import java.util.HashMap;
import java.util.Map;

import es.curso.java.ejercicios.constructores.Persona;

public class MainEnumPersonas {

	public static void main(String[] args) {
		Map <String,Persona> personas = new HashMap<String,Persona>();
		
		for (EnumPersonas ePersona : EnumPersonas.values()) {
			Persona p = null;
			if (ePersona.getNombre()!=null){
				 p = new Persona (ePersona.getNombre(),ePersona.getApellidos(), ePersona.getDni());
			}else{
				 p = ePersona.getPersona();
			}
				
			personas.put(p.getDni(), p);
			
		}

		String dni = "DNI6";
		if (personas.containsKey(dni)){
			Persona pers = personas.get(dni);
			System.out.println(pers);
		}else{
			System.out.println("No hay nadie con el dni "+dni);
		}
		
		
	}

}
