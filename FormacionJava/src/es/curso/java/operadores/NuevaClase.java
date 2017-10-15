package es.curso.java.operadores;

public class NuevaClase {
	
	public void metodoA(){
		System.out.println("Llmando metodo A");
		metodoB("");
	}
	
	private void metodoB(String nombre){
		System.out.println(nombre);
	}
	
	public static int metodoC(String [] nombres){
		
		return nombres.length;
	}
}
