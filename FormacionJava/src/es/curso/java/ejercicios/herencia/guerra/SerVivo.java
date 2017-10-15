package es.curso.java.ejercicios.herencia.guerra;

public abstract class SerVivo {
	private boolean vivos = true;
    
    public boolean isVivos() {
		return vivos;
	}
	public void setVivos(boolean vivos) {
		this.vivos = vivos;
	}


	public abstract int dispara();
}