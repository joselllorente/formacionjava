package es.curso.java.ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import es.curso.java.ejercicios.colecciones.hospital.Celador;
import es.curso.java.ejercicios.colecciones.hospital.Doctor;
import es.curso.java.ejercicios.colecciones.hospital.Enfermero;
import es.curso.java.ejercicios.colecciones.hospital.Paciente;
import es.curso.java.ejercicios.constructores.Persona;

public class EscribeFicheroPersonas {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Nombre1","ZApe1","1111A");
		Persona persona2 = new Persona("Nombre2","Ape2","2222B");
		Persona persona3 = new Persona("Nombre3","FApe3","3333C");
		Persona persona4 = new Persona("Nombre4","SApe4","4444D");
		Persona persona5 = new Persona("Nombre5","LApe5","4444D");
		Doctor doctor1 = new Doctor("Doctor1","AApe1","5555E",23,44,"Especialidad");
		Enfermero enfermero1 = new Enfermero("Enfermero1","ABpe4","4444D",23,44,"QQQQQ");
		Paciente paciente1 = new Paciente("Paciente1","Ape5","4444D","Dolor cabeza");
		
		Set <Persona> personas = new HashSet<Persona>();
		
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
		personas.add(persona4);
		personas.add(persona5);
		personas.add(doctor1);
		personas.add(enfermero1);
		personas.add(paciente1);

		try {
			escribirEnFichero(personas);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static void escribirEnFichero(Set <Persona> personas) 
						throws IOException{
		
		File file = new File ("C:/workspace/personas.txt");
		FileWriter fwrite = new FileWriter(file);
		
		try{
			fwrite.write("TIPO|NOMBRE|APELLIDO|EDAD|DNI|AUX\n");
			String tipo="", aux="";
			for (Persona persona : personas) {
				if (persona instanceof Doctor){
					tipo = "Doctor";
					aux = ((Doctor) persona).getEspecialidad(); 
				}else if (persona instanceof Enfermero){
					tipo = "Enfermero";
					aux = ((Enfermero) persona).getEspecialidad();
				}else if (persona instanceof Paciente){
					tipo = "Paciente";
					aux = ((Paciente) persona).getSintoma();
				}else if (persona instanceof Celador){
					tipo = "Celador";
					aux = ((Celador) persona).getPlanta();
				}else{
					tipo = "Persona";
					aux="";
				}
				
				
				fwrite.write(tipo+"|"+persona.getNombre()+"|"+persona.getApellidos()+
						"|"+persona.getEdad()+"|"+persona.getDni()+"|"+aux+"\n");
						
			}
			
			
			
			
		}finally{
			fwrite.close();
		}
		
	}

}






