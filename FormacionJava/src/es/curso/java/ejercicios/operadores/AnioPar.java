package es.curso.java.ejercicios.operadores;

public class AnioPar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int anio = 1977;
		
		int resto = anio%2;
		boolean esPar = (anio%2)==0;
		System.out.println("El año "+anio + " es par "+((anio%2)==0));

	}

}
