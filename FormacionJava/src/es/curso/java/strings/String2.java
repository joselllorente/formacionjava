package es.curso.java.strings;

public class String2 {

	public static void main(String[] args) {
		String nombre = "Juan";
		String nombre2 = "Juan";
		String nombre3 = new String("Juan");
		
		System.out.println(nombre==nombre2);
		System.out.println(nombre==nombre3);
		System.out.println(nombre.equals(nombre3));
		
		nombre = "Juan2";
		System.out.println(nombre);
		System.out.println(nombre2);
		
		nombre.toUpperCase();
		
		System.out.println(nombre);
		
	}

}
