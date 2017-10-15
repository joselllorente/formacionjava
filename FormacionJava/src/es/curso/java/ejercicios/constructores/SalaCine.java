package es.curso.java.ejercicios.constructores;

public class SalaCine {
	public static void main(String[] args) {
		Persona persona1 = new Persona ();
		persona1.setNombre("Nombre1");
		persona1.setApellidos("Ape1");
		persona1.setDni("11111A");
		persona1.setEdad(23);
		persona1.setPeso(70.9);
		
		Persona persona2 = new Persona ("Nombre2","Apellido2","2222B");
		persona2.setEdad(45);
		persona2.setPeso(60.5);
		
		Persona persona3 = new Persona("Nombre3","Apellido3","3333C",34,80.6);
		
		Persona [] personas = {persona1,persona2,persona3};
		mostrarDatosPersonas(personas);
		
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
	}
	
	private static void mostrarDatosPersonas (Persona [] personas){
		
		for (Persona persona : personas) {
			System.out.println(persona);
			if (persona.getDni().equals("11111A")){
				persona.setNombre("Andres");
			}
			
		}
	}
}
