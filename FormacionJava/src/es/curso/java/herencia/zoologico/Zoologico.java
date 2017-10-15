package es.curso.java.herencia.zoologico;

public class Zoologico {
	public static void main(String[] args) {
		Animal animal = new Elefante ("Dumbo",65,350,"Asiatico",2);
		//elefante1.setNumCuernos(2);
		
		Animal serp1 = new Serpiente("Serpiente1",10,30,"Cascabel",false);
		
		Elefante elefante2 = null;
		elefante2.comer();
		
		animal.comer();
		animal.dormir();
		if (animal instanceof Elefante){
			Elefante e = (Elefante)animal;
			e.moverTrompa();
		}
		
		System.out.println("==================");
		
		serp1.comer();
		serp1.dormir();
		
	}
}
