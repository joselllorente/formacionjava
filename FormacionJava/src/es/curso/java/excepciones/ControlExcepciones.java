package es.curso.java.excepciones;

import es.curso.java.ejercicios.constructores.Persona;

public class ControlExcepciones {

	/**
	 * @param args
	 */
	public static void main(String[] args){
	
		System.out.println("Entrando");
		Persona p = null;
		String[] nombres = {"Rosa","Angel"};
		
		ClaseNormal cn = new ClaseNormal();
		
		try{
//			nombres[3]= "";
//			p.getNombre();
			cn.metodo1();
			
		}catch(NullPointerException npe){
			System.out.println("Un objeto no esta inicializado: "+npe.getMessage());
			npe.printStackTrace();
		}catch(MiExcepcion me){
			System.out.println("Excepcion controlada: "+me.getMessage());
			me.printStackTrace();
		}
		catch(Exception npe){
			System.out.println("Ha ocurrido un error general: "+npe.getMessage());
			npe.printStackTrace();
		}finally{
			System.out.println("ESTO SE EJECUTA SIEMPRE");
		}
		
		System.out.println("Saliendo");

	}

}
