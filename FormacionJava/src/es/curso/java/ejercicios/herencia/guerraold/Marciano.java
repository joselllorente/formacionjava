package es.curso.java.ejercicios.herencia.guerraold;

public class Marciano extends Guerrero {
	
	private static int total = 0;
    private String soy;
    
    Marciano(String soy, int tripulantes){
        super(soy);
        this.soy =soy;
        total=tripulantes;
        
    }
    
    public void recibeDisparo(int i){
    	if (Math.random()>0.7){
    		total = total-i;
    		System.out.println (""+ i +" "+ soy + " muertos, quedan " +total);
    	}else if (Math.random()>0.3 && Math.random()<=0.7){
    		total = total-(i/2);
    		System.out.println (""+ (i/2) +" "+ soy + " muertos, quedan " +total);
    	}else{
    		System.out.println ("No hay "+ soy + " muertos, quedan " +total);
    	}
    	
    	if (total<=0){
    		vivo=false;
    		System.out.println ("No quedan "+soy +" vivos");
    	}
        /*if (vivo && blanco == i){
            vivo = false;
            total--;
            System.out.println (soy + "Muerto por disparo n� " +i);
        }*/
    }
    
    public int getTotal(){
        return total;
    }    
}
