package es.curso.java.ejercicios.herencia.guerraold;

public class Guerra {
	private Nave nave1, nave2;
	private int numTerricolas, numMarcianos;
	
    public Guerra(int _numTerr, int _numMarc){
    	numTerricolas= _numTerr;
    	numMarcianos = _numMarc;
        nave1 = new Nave("Terricolas",numTerricolas);
        nave2 = new Nave("Marcianos",numMarcianos);
        empiezaGuerra();
    }
    
    public void empiezaGuerra(){
    	int totalDisparos=0;
        do{    
        	System.out.println("Terricolas Vivos\t"+nave1.cuantosQuedan());
        	System.out.println("Marcianos Vivos\t"+nave2.cuantosQuedan());
        	System.out.println("\n");
        	System.out.println("=========Atacan Terricolas============");
            for(int i = 0; i<numTerricolas&&nave2.cuantosQuedan()>0;i++){
            	System.out.println("Terricola "+i);
            	totalDisparos =nave1.generaDisparo(i); 
            	if (totalDisparos>0){
            		nave2.recibeDisparo(totalDisparos);
            	}else{
            		System.out.println("Ataque fallido");
            	}
            }
            
            if (nave2.cuantosQuedan()>0){
	            System.out.println("===============Atacan Marcianos================");
	            for(int i = 0; i<numMarcianos&&nave1.cuantosQuedan()>0;i++){
	            	System.out.println("Marciano "+i);
	            	totalDisparos =nave2.generaDisparo(i); 
	            	if (totalDisparos>0){
	            		nave1.recibeDisparo(totalDisparos);
	            	}else{
	            		System.out.println("Ataque fallido");
	            	}
	            }
            }
            System.out.println("\n\n");
        }while(nave1.cuantosQuedan()>0&&nave2.cuantosQuedan()>0);
        
        if(nave1.cuantosQuedan()>0){
            System.out.println("GANARON LOS TERRICOLAS!!!!!");
        }
        else if (nave2.cuantosQuedan()>0){
            System.out.println("GANARON LOS MARCIANOS");
        }
    }
    
    public static void main(String[] args){	
        new Guerra(12,8);
    }
}