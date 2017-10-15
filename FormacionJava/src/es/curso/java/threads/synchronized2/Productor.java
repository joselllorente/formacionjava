package es.curso.java.threads.synchronized2;

public class Productor extends Thread {
	private Buffer buffer;
	private final String letras = "abcdefghijklmnopqrstuvxyz";

	public Productor(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			char c = letras.charAt((int) (Math.random() * letras.length()));
			System.out.println("Llamando poner");
			buffer.poner(c);
			System.out.println("==============================" +i + " Productor: " + c);
			try {
				sleep(400);
			} catch (InterruptedException e) {
			}
		}
	}
}
