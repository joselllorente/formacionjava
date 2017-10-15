package es.curso.java.ejercicios.herencia.guerra;

public class Nave {
	private Guerrero[] tripulacion;
	private String tipoTripulacion;
	
    public Nave (String tipo, int numTripulantes){
        this.tipoTripulacion = tipo;
        tripulacion = new Guerrero[numTripulantes];
        
        if (tipoTripulacion.equals(Guerra.TIPO_TERRICOLA)){
        	Terricola.setTotal(numTripulantes);
        }else{
        	Marciano.setTotal(numTripulantes);
        }
        
        for (int i = 0; i<numTripulantes; i++){
            if (tipoTripulacion.equals("Terricolas")){            	
                tripulacion [i] = new Terricola(tipoTripulacion);
            }
            else{
                tripulacion [i] = new Marciano(tipoTripulacion);
            }
        }
        System.out.println("Creada nave de " + tipoTripulacion);
    }
    
    public void recibeDisparo(int numDisparos){
    	tripulacion[0].recibeDisparo(numDisparos);
    }
    
    public int generaDisparo(int i){
    	if (Math.random()>0.6){
    		return tripulacion[i].dispara();
    	}else{
    		return 0;
    	}
        
    }
    
    public int cuantosQuedan(){
        if (tipoTripulacion.equals(Guerra.TIPO_TERRICOLA)){
            return Terricola.getTotal();
        }
        else{
            return Marciano.getTotal();
        }            
    }
   
    
}