package es.curso.java.threads;

public class ThreadEjemplo extends Thread {
	
    public ThreadEjemplo(String str) {
        super(str);
    }
    
    @Override
    public void run() {
    	Operacion ope = new Operacion();
        for (int i = 0; i < 10 ; i++){
        	
        	try{
	        	if (getName().startsWith("Pe")){
	        		Thread.sleep(1000);
	        	}else{
	        		Thread.sleep(1500);
	        	}
	        	ope.operando(getName());
        	}catch(InterruptedException ie){
        		ie.printStackTrace();
        	}
            System.out.println(i + " " + getName());
        }
        	
        
        System.out.println("Termina thread " + getName());
    }
    
    
    
}