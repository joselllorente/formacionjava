package es.curso.java.ejercicios.herencia.guerra;

public abstract class Guerrero extends SerVivo {
	private String tipo;
	
    public Guerrero (String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int dispara (){
        int disparos = ((int)(Math.random()*10))/2;
        System.out.println(tipo + " dispara " +disparos + " disparos");
        return  disparos;
    }

	
	public abstract void recibeDisparo(int i);
}
    