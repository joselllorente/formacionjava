package es.curso.java.excepciones;

public class ClaseNormal {

	public void metodo1() throws MiExcepcion {
		System.out.println("Llamando metodo1");
		throw new MiExcepcion("Esta es una excepcion lanzada por mi");
	}
}
