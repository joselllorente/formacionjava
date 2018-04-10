package es.curso.java.enums;

public class PruebaEnumerados {

	public static void main(String[] args) {
		System.out.println(Enumerados.HOSPITAL1.getDireccion());
		
		System.out.println(Enumerados.HOSPITAL5.getDoctor().getNombre());
		
		
		for (Enumerados hospital : Enumerados.values()) {
			System.out.println(hospital);
			System.out.println(hospital.getDireccion());
			System.out.println(hospital.getCapacidad());
			System.out.println(hospital.getLocalidad());

		}

	}

}
