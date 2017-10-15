package es.curso.java.condicionales;

public class CondicionalesIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean esMayor = 7>3;
		
		if (esMayor)
			System.out.println("Condicion ejecutada");
		else if(9<8)
			System.out.println("Otra Condicion ejecutada");
		else
			System.out.println("No se ha cumplido Condicion");
			System.out.println("Otro valor");
			
			
		String valor="A";
		switch (valor){
			case "V": System.out.println("sdfsdf3"); break;
			case "A": System.out.println("sdfsdf");
			case "B": System.out.println("sdfsdf2"); break;
			
			case "Z": System.out.println("sdfsdf4"); break;
			default: System.out.println("");break;
		
		}
		
	}

}
