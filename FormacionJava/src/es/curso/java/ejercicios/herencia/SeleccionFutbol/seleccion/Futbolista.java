package es.curso.java.ejercicios.herencia.SeleccionFutbol.seleccion;

public class Futbolista extends SeleccionFutbol {

	   private int dorsal;
	   private String demarcacion;

	   // constructor, getter y setter

	   public Futbolista(String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super( nombre, apellidos, edad);
		this.dorsal=dorsal;
		this.demarcacion=demarcacion;
		// TODO Auto-generated constructor stub
	}
	   
	   @Override
	   public void entrenamiento() {
	      System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	   }

	   public void partidoFutbol() {
	      System.out.println("Juega un Partido (Clase Futbolista)");
	   }

	   public void entrevista() {
	      System.out.println("Da una Entrevista");
	   }
	}
