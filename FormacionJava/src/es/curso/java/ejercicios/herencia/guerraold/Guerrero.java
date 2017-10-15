package es.curso.java.ejercicios.herencia.guerraold;

public abstract class Guerrero extends SerVivo {
	protected int blanco;
	private final String soy;
	
    public Guerrero (String soy){
        this.soy = soy;
    }
    
    public int dispara (){
        int disparo = ((int)(Math.random()*10))/2;
        System.out.println(soy + " dispara " +disparo + " disparos");
        return  disparo;
    }
    
    
    public String getSoy() {
		return soy;
	}

	public abstract void recibeDisparo(int i);
}
    