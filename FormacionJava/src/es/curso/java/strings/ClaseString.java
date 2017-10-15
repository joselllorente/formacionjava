package es.curso.java.strings;

public class ClaseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (String valor : args) {
			System.out.println(valor);
		}
		
		//Forma implicita
		String apellido = "Lopez";
		
		String apellido2 = "Lopez";
		//Forma explicita
		String nombre = new String("lopez");

//		System.out.println(apellido==apellido2);
//		System.out.println(apellido==nombre);
//		System.out.println(apellido.equals(nombre));
		
		apellido.charAt(3);
		
		System.out.println("Hola "+ 6);
		
		apellido.concat(String.valueOf(2));
		
		apellido.contains("pez");
		
		apellido.endsWith(".txt");
		
		apellido.startsWith("Fichero_");
		
		System.out.println(nombre.equalsIgnoreCase(apellido));
		
		String valor = "    Mara  villa   ";
//		System.out.println(valor.indexOf("a"));
//		
//		System.out.println(valor.lastIndexOf("a"));
		
		System.out.println(valor.replace('a', 'e'));
		
		System.out.println("'"+ valor.trim() +"'");
		
		System.out.println(valor.trim().substring(3));
		System.out.println(valor.trim().substring(3,7));
		
		String cadena = "Ramon|Juan|Angel|Rosa";
		
		String [] nombres = cadena.split("\\|");
		for (String nom : nombres) {
			System.out.println(nom);
		}

	}

}
