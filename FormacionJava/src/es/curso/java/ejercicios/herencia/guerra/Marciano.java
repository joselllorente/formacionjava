package es.curso.java.ejercicios.herencia.guerra;

public class Marciano extends Guerrero {
	
	private static int total = 0;
    
    Marciano(String tipo){
        super(tipo);
    }
    
    public void recibeDisparo(int i){
    	double aleatorio = Math.random(); 
    	if (aleatorio>0.7){
    		total = total-i;
    		System.out.println (""+ i +" "+ getTipo() + " muertos, quedan " +total);
    	}else if (aleatorio>0.3 && aleatorio<=0.7){
    		total = total-(i/2);
    		System.out.println (""+ (i/2) +" "+ getTipo() + " muertos, quedan " +total);
    	}else{
    		System.out.println ("No hay "+ getTipo() + " muertos, quedan " +total);
    	}
    	
    	if (total<=0){
    		setVivos(false);
    		System.out.println ("No quedan "+getTipo() +" vivos");
    	}
    }

	public static int getTotal() {
		return total;
	}
	public static void setTotal(int total) {
		Marciano.total = total;
	}
    
}
