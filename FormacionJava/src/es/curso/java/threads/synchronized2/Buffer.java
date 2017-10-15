package es.curso.java.threads.synchronized2;

public class Buffer {
	private char contenido;
	private boolean disponible = false;

	public Buffer() {
	}

	
//	public char recoger() {
//		if (disponible) {
//			disponible = false;
//			return contenido;
//		}
//		return ('\t');
//	}
//
//	public void poner(char c) {
//		contenido = c;
//		disponible = true;
//	}

	public synchronized char recoger() {
		while (!disponible) {
			try {
				System.out.println("Esperando en regoger");
				wait();
			} catch (InterruptedException ex) {
			}
		}
		disponible = false;
		System.out.println("Notifica recoger terminado");
		notify();
		return contenido;
	}

	public synchronized void poner(char valor) {
		while (disponible) {
			try {
				System.out.println("Esperando en poner");
				wait();
			} catch (InterruptedException ex) {
			}
		}
		contenido = valor;
		disponible = true;
		
		System.out.println("Notifica poner terminado");
		notify();
	}

}