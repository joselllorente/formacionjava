package es.curso.java.herencia.zoologico;

public class Zoologico {
	public static void main(String[] args) {
		Animal animal = new Elefante ("Dumbo",65,350,"Asiatico",2);
		//elefante1.setNumCuernos(2);
		System.out.println(animal);
		
		((Elefante)animal).moverTrompa();
		
				
		//animal.moverTrompa();
	
		
		Animal serp1 = new Serpiente("Serpiente1",10,30,"Cascabel",false);
		
		Animal a = serp1;
		
		Animal a2 = a;
		
		System.out.println(a2);
		
		
		//Elefante elefante2 = animal;
		//elefante2.comer();
		
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
