package es.curso.java.threads.synchronized1;

public class Descargar extends Thread {
    private Pistola arma;
    private int cartucho;

    public Descargar(Pistola arma, int cartucho) {
        this.arma = arma;
        this.cartucho = cartucho;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
        	System.out.println("-----Disparando bala " + i);
            arma.disparar(i);
            System.out.println("==========================Descargar #" + this.cartucho
                               + " bala: " + i);
        }
    }
}