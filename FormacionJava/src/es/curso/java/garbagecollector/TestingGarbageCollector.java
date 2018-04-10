package es.curso.java.garbagecollector;

public class TestingGarbageCollector {

	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		
		String cadena = "";
		for (int i = 0; i < 1000000; i++) {
			cadena = "p";
		}
		long freeMemory = runtime.freeMemory();
		runtime.gc();
		System.out.println(runtime.freeMemory()-freeMemory);
		
		

		String cadena2 = new String ("");
		for (int i = 0; i < 1000000; i++) {
			cadena2 = new String ("p");
		}
		freeMemory = runtime.freeMemory();
		runtime.gc();
		System.out.println(runtime.freeMemory()-freeMemory);
		
	}
	
	

}
