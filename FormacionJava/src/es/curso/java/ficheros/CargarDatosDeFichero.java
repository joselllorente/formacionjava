package es.curso.java.ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import es.curso.java.ejercicios.colecciones.hospital.Celador;
import es.curso.java.ejercicios.colecciones.hospital.Doctor;
import es.curso.java.ejercicios.colecciones.hospital.Enfermero;
import es.curso.java.ejercicios.constructores.Persona;

public class CargarDatosDeFichero {


	public static void main(String[] args) {
		
		//LEER EL FICHERO
		File ficheroALeer = new File ("C:/hospital.txt");
		
		System.out.println("Leyendo el fichero "+ficheroALeer.getAbsolutePath()
				+ " de tamaño "+ficheroALeer.length()+"\n");
		
		try {
			FileReader fReader = new FileReader(ficheroALeer);
			BufferedReader bReader = new BufferedReader(fReader);
			
			leerFichero(bReader,true);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	private static void leerFichero (BufferedReader bReader,boolean conCabecera){
		String line=null;
		int contador = 0;
		Set<Persona> personasHospital=new HashSet<Persona>();
		
		Map<Integer,String> columnas = new HashMap<Integer,String>();
		
		try {
			while ((line= bReader.readLine())!=null){
				String [] datos = line.split("\\|");
				if (contador!=0){//Información a procesar
					System.out.println(line);
					
					Persona personaHospital = null;
					if (!conCabecera){
						personaHospital = almacenaPersonas (datos);
					}else{
						personaHospital = almacenaPersonas (datos,columnas);
					}
					
					
					personasHospital.add(personaHospital);
					
//					StringTokenizer st = new StringTokenizer(line,"\\|");
//					System.out.println(st.countTokens());
//					while (st.hasMoreElements()){
//						System.out.println(st.nextElement());
//					}
					
				}else{//Linea Cabecera
					contador++;
					
					for (int i = 0; i < datos.length; i++) {
						columnas.put(i, datos[i]);
					}
				}
				
				
			}
			
			System.out.println("\n\n==============Mostrando Info de personas================");
			for (Persona persona : personasHospital) {
				System.out.println(persona);
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}	
		
		
	}
	
	
	private static Persona almacenaPersonas 
						(String [] datosPersonas){
		
		Persona reply=null;
		
		String tipo = datosPersonas[0];
		String nombre = datosPersonas[1];
		String apellidos = datosPersonas[2];
		String dni = datosPersonas[3];
		String edad = datosPersonas[4];
		String aux = datosPersonas[5];
		
		if (tipo.equals("Doctor")){
			Doctor doc = new Doctor(nombre,apellidos,dni,
					Integer.parseInt(edad),12,aux);
			
			reply=doc;
		}else if (tipo.equals("Enfermero")){
			Enfermero enf = new Enfermero(nombre,apellidos,dni,
					Integer.parseInt(edad),56,aux);
			
			reply=enf;
		}else if (tipo.equals("Celador")){
			Celador cel = new Celador(nombre,apellidos,dni,
					Integer.parseInt(edad),67,aux);
			
			reply=cel;
		}
		
		return reply;
	}
	
	
	private static Persona almacenaPersonas 
		(String [] datosPersonas, Map<Integer,String> cabecera){
		Persona reply = null;
		String tipo="", nombre="",apellidos="",dni="", aux="";
		int edad=0;
		
		for (int i = 0; i < datosPersonas.length; i++) {
			
			String valor = cabecera.get(i);
			
			if (valor.equals("Tipo")){
				tipo = datosPersonas[i];
			}else if (valor.equals("Nombre")){
				nombre = datosPersonas[i];
			}else if (valor.equals("Apellidos")){
				apellidos = datosPersonas[i];
			}else if (valor.equals("dni")){
				dni = datosPersonas[i];
			}else if (valor.equals("edad")){
				edad = Integer.parseInt(datosPersonas[i]);
			}else if (valor.equals("auxiliar")){
				aux = datosPersonas[i];
			}
		}
		
		if (tipo.equals("Doctor")){
			Doctor doc = new Doctor(nombre,apellidos,dni,
					edad,56,aux);
			
			reply=doc;
		}else if (tipo.equals("Enfermero")){
			Enfermero enf = new Enfermero(nombre,apellidos,dni,
					edad,65,aux);
			
			reply=enf;
		}else if (tipo.equals("Celador")){
			Celador cel = new Celador(nombre,apellidos,dni,
					edad,45,aux);
			
			reply=cel;
		}
		
		
		return reply;
	}

}





