package es.curso.java.enums;

public class PruebaEnumerados {

	public static void main(String[] args) {
		System.out.println(Enumerados.HOSPITAL1.getDireccion());
		for (Enumerados hospital : Enumerados.values()) {
			System.out.println(hospital);
			System.out.println(hospital.getDireccion());
			System.out.println(hospital.getCapacidad());

		}

	}

}
