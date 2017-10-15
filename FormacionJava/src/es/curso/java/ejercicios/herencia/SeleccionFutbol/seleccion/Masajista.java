package es.curso.java.ejercicios.herencia.SeleccionFutbol.seleccion;

public class Masajista extends SeleccionFutbol {

	   private String titulacion;
	   private int aniosExperiencia;

	   // constructor, getter y setter
	   public Masajista(String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
			super(nombre, apellidos, edad);
			this.titulacion=titulacion;
			this.aniosExperiencia=aniosExperiencia;
			// TODO Auto-generated constructor stub
		}
	   
	   
	   @Override
	   public void entrenamiento() {
	      System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
	   }
	   
	   public void darMasaje() {
	      System.out.println("Da un Masaje");
	   }
	}
