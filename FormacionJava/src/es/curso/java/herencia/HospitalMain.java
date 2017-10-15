package es.curso.java.herencia;

import es.curso.java.ejercicios.herencia.orquesta.Guitarra;

public class HospitalMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HospitalInfantil hospital1 = new HospitalInfantil();
		hospital1.metodoHospital("");

		Guitarra guitarra = new Guitarra();
		
		ejecutaMetodos(hospital1);
		ejecutaMetodos(guitarra);
	}
	
	private static  void ejecutaMetodos (Interface1 obj){
		obj.metodo2();
		System.out.println(Interface1.GOOD);
	}

}
