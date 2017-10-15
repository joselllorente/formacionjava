package es.curso.java.ejercicios.herencia.guerraold;

public abstract class SerVivo {

    public boolean isVivo(){
        return vivo;
    }
    
    protected boolean vivo = true;
    public abstract int dispara();
}