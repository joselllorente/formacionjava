package es.curso.java.ejercicios.herencia.SeleccionFutbol.seleccion;

public class Entrenador extends SeleccionFutbol {

	   private int idFederacion;

	   // constructor, getter y setter
	   public Entrenador(String nombre, String apellidos, int edad, int idFederacion) {
		super(nombre, apellidos, edad);
		this.idFederacion=idFederacion;
		
	   }
	   
	   @Override
	   public void entrenamiento() {
	      System.out.println("Dirige un entrenamiento (Clase Entrenador)");
	   }
	   
	   @Override
	   public void partidoFutbol() {
	      System.out.println("Dirige un Partido (Clase Entrenador)");
	   }

	   public void planificarEntrenamiento() {
	      System.out.println("Planificar un Entrenamiento");
	   }
	}