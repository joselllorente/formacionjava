package es.curso.java.ejercicios.herencia.HerenciaAnimales;

public class MainAnimal {


	public static void main(String[] args) {
		//new Animal()
		Elefante elefante1 = new Elefante ("Dumbo");
		//elefante1.setNombre("Dumbo");
		
		Elefante elefante2 = new Elefante ();
		elefante2.setNombre("Elefante2");
		
		System.out.println(elefante1.getNombre());
		System.out.println(elefante2.getNombre());
		
		elefante1.comer();
		elefante1.beber();
		
		

	}

	
}