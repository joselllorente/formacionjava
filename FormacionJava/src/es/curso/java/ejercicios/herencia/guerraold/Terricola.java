package es.curso.java.ejercicios.herencia.guerraold;

public class Terricola extends Guerrero {
	
	private static int total = 0;
    //private String soy;
    Terricola(String soy, int tripulantes){
        super(soy);
        total=tripulantes;
    }

    public void recibeDisparo(int i){
    	if (Math.random()>0.7){
    		total = total-i;
    		System.out.println (""+ i +" "+ getSoy() + " muertos, quedan " +total);
    	}else if (Math.random()>0.3 && Math.random()<=0.7){
    		total = total-(i/2);
    		System.out.println (""+ (i/2) +" "+ getSoy() + " muertos, quedan " +total);
    	}else{
    		System.out.println ("No hay "+ getSoy() + " muertos, quedan " +total);
    	}
    	
    	if (total<=0){
    		vivo=false;
    		System.out.println ("No quedan "+getSoy() +" vivos");
    	}
    }
    
    public int getTotal(){
        return total;
    }
    
    

}

