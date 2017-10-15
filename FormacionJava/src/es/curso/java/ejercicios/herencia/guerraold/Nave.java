package es.curso.java.ejercicios.herencia.guerraold;

public class Nave {
	private Guerrero[] tripulacion;
	private String somos;
    public Nave (String somos, int tripulantes){
        this.somos = somos;
        tripulacion = new Guerrero[tripulantes];
        for (int i = 0; i<tripulantes; i++){
            if (somos.equals("Terricolas")){
                tripulacion [i] = new Terricola(somos, tripulantes);
            }
            else{
                tripulacion [i] = new Marciano(somos, tripulantes);
                
            }
        }
        System.out.println("Creada nave de " + somos);
    }
    
    public void recibeDisparo(int i){
        //for (int j=0; j<10;j++){
            if (somos.equals("Terricolas")){
                ((Terricola)(tripulacion[0])).recibeDisparo(i);
            }
            else{
                ((Marciano)(tripulacion[0])).recibeDisparo(i);
            }
            
        //}
    }
    
    public int generaDisparo(int i){
    	if (Math.random()>0.75){
    		return tripulacion[i].dispara();
    	}else{
    		return 0;
    	}
        
    }
    
    public int cuantosQuedan(){
        if (somos.equals("Terricolas")){
            return ((Terricola)(tripulacion[1])).getTotal();
        }
        else{
            return ((Marciano)(tripulacion[1])).getTotal();
        }            
    }
   
    
}