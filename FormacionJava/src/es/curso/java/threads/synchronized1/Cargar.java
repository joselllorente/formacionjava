package es.curso.java.threads.synchronized1;

public class Cargar extends Thread {
    private Pistola arma;
    private int cartucho;

    public Cargar(Pistola arma, int cartucho) {
        this.arma = arma;
        this.cartucho = cartucho;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
        	System.out.println("------Apuntando bala " + i);
            arma.apuntar(i);
            System.out.println("==========================Apuntar #" + this.cartucho
                               + " bala: " + i);
        }
    }
}
