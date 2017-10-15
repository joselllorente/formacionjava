package es.curso.java.threads;

public class Operacion {
	private String operacion;
	
	private synchronized void operar (String name){
    	System.out.println("Operando "+name);
    	try {
    		Thread.sleep(5000);
    		operacion="name";
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	System.out.println("Terminando Operar "+name);
    }
	
	public void operando (String name){
		operar(name);
	}
	
}
