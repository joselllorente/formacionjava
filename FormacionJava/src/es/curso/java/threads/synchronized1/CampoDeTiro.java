package es.curso.java.threads.synchronized1;

public class CampoDeTiro {
	 public static void main(String[] args) {
	        Pistola arma = new Pistola();
	        Cargar c = new Cargar(arma, 1);
	        Descargar d = new Descargar(arma, 1);
	        c.start();
	        d.start();
	    }
}
