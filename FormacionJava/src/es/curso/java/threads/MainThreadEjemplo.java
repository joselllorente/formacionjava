package es.curso.java.threads;

public class MainThreadEjemplo {

	public static void main(String[] args) {
		
		ThreadEjemplo pepe =new ThreadEjemplo("Pepe"); 
		ThreadEjemplo juan =new ThreadEjemplo("Juan");
		
		
		pepe.start();
		juan.start();

        System.out.println("Termina thread main");
	}

}
