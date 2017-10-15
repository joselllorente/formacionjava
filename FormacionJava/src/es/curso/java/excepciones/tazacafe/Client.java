package es.curso.java.excepciones.tazacafe;

import es.curso.java.ejercicios.constructores.Persona;

public class Client extends Persona {

	public Client() {
		super();
	}

	public Client(String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
	}
	
	
	void drinkCoffeCup (CoffeCup tazaCafe) 
		throws TemperatureException{
		
		if(tazaCafe.getTemperature()>60){
			throw new TooHotTemperatureException("El cafe esta muy caliente: "+tazaCafe.getTemperature());
		}else if(tazaCafe.getTemperature()<20){
			throw new TooColdTemperatureException("El cafe esta muy frio: "+tazaCafe.getTemperature());
		}else{
			System.out.println("El cliente "+getNombre()+ 
					" se ha tomado la taza de café a "
					+tazaCafe.getTemperature() +" grados");
		}
			
		
	}
	
}
