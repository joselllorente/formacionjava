package es.curso.java.ejercicios.herencia.guerra;

public class Guerra {
	private Nave naveTerricolas, naveMarcianos;
	private int numTerricolas, numMarcianos;
	final static String TIPO_TERRICOLA = "Terricola";
	
	public static void main(String[] args){	
        new Guerra(4,2);
    }
	
    public Guerra(int _numTerr, int _numMarc){
    	numTerricolas= _numTerr;
    	numMarcianos = _numMarc;
    	naveTerricolas = new Nave(TIPO_TERRICOLA,numTerricolas);
        naveMarcianos = new Nave("Marciano",numMarcianos);
        empiezaGuerra();
    }
    
    public void empiezaGuerra(){
    	int totalDisparos=0;
        do{    
        	System.out.println("Terricolas Vivos\t"+naveTerricolas.cuantosQuedan());
        	System.out.println("Marcianos Vivos\t"+naveMarcianos.cuantosQuedan());
        	System.out.println("\n");
        	System.out.println("=========Atacan Terricolas============");
            for(int i = 0; i<numTerricolas && naveMarcianos.cuantosQuedan()>0;i++){
            	System.out.println("Terricola "+i);
            	totalDisparos =naveTerricolas.generaDisparo(i); 
            	if (totalDisparos>0){
            		naveMarcianos.recibeDisparo(totalDisparos);
            	}else{
            		System.out.println("Ataque fallido");
            	}
            }
            
            if (naveMarcianos.cuantosQuedan()>0){
	            System.out.println("===============Atacan Marcianos================");
	            for(int i = 0; i<numMarcianos&&naveTerricolas.cuantosQuedan()>0;i++){
	            	System.out.println("Marciano "+i);
	            	totalDisparos =naveMarcianos.generaDisparo(i); 
	            	if (totalDisparos>0){
	            		naveTerricolas.recibeDisparo(totalDisparos);
	            	}else{
	            		System.out.println("Ataque fallido");
	            	}
	            }
            }
            System.out.println("\n\n");
        }while(naveTerricolas.cuantosQuedan()>0&&naveMarcianos.cuantosQuedan()>0);
        
        if(naveTerricolas.cuantosQuedan()>0){
            System.out.println("GANARON LOS TERRICOLAS!!!!!");
        }
        else if (naveMarcianos.cuantosQuedan()>0){
            System.out.println("GANARON LOS MARCIANOS");
        }
    }
    
}