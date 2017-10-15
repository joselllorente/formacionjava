package es.curso.java.metodos;

import es.curso.java.operadores.NuevaClase;

public class DeclaracionMetodos {

	/**
	 * @param args
	 */
	public static void main(String[] werwer) {
		
		metodo1();
		
		String valor = metodo2();
		System.out.println(valor);
		String [] array = metodo3(null,8);
		
		metodo4(3,"BHU",null,"Rosa","Juan");
		
		NuevaClase nc = new NuevaClase();
		nc.metodoA();
		//nc.metodoB("");
		NuevaClase.metodoC(array);
	}
	
	public static void metodo1 (){
		System.out.println("Llamando metodo1");
	}
	
	static String metodo2 (){
		System.out.println("Llamando metodo2");
		
		return "Metodo2 Ejecutado";
	}
	
	private static String[] metodo3(String cadena){
		String [] valores= null;
		return valores;
	}
	
	private static String[] metodo3(String cadena, int num){
		String [] valores= null;
		return valores;
	}
	
	//VARARGS
	static void metodo4 (int numero, String... cadena ){
		for (String valor : cadena) {
			System.out.println(valor);
		}
	}
	
}
