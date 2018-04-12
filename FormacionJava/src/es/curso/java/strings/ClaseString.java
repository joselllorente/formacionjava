package es.curso.java.strings;

public class ClaseString {

	public static void main () {
		System.out.println("Main");
	}
	/**
	 * @param args
	 */
	public static void main(String... args) {
		main();
		for (String valor : args) {
			System.out.println(valor);
		}
		
		String b;
		b = (b="1") + 'a';
		System.out.println(b);
		
		System.out.println("1"+5+5);
		System.out.println(5+5+"1");
		
		//Forma implicita
		String apellido = "LopeZ";
		System.out.println(apellido.toLowerCase());
		System.out.println(apellido);

		String apellido2 = "Lopez";
		//Forma explicita
		String nombre = new String("Lopez");

		System.out.println(apellido==apellido2);
		System.out.println(apellido==nombre);
		System.out.println(apellido.equals(nombre));

		
		apellido.charAt(3);
//		
//		System.out.println("Hola "+ 6);
//		
		apellido.concat(String.valueOf(2));
//		
		apellido.contains("pez");
//		
		apellido.endsWith(".txt");
//		
		apellido.startsWith("Fichero_");
//		
//		System.out.println(nombre.equalsIgnoreCase(apellido));
		
		String valor = "    Mara  villa   ";
		System.out.println(valor.indexOf("a"));
//		
		System.out.println(valor.lastIndexOf("a"));
		
		System.out.println(valor.replace(" ", ""));
		
		System.out.println("'"+ valor.trim() +"'");
		
		System.out.println(valor.trim().substring(3));
		System.out.println(valor.trim().substring(3,7));
		
		String cadena = "Ramon|Juan|Angel|Rosa";
		
		String [] nombres = cadena.split("\\|");
		for (String nom : nombres) {
			System.out.println(nom);
		}
		
		apellido.substring(apellido.indexOf("a"),
				apellido.lastIndexOf("a"));

	}

}

class OtraClase {
	
}
