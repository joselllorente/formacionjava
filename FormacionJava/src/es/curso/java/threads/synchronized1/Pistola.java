package es.curso.java.threads.synchronized1;


/*si es invocado un m�todo synchronized �nicamente el "Thread" que lo invoca 
 * tiene acceso a la instancia del Objeto, y cualquier otro "Thread" 
 * que intente acceder a esta misma instancia tendr� que esperar hasta que 
 * sea terminada la ejecuci�n del m�todo synchronized.
 */

/*
 * El m�todo wait permite paralizar temporalmente la ejecuci�n de un "Thread", 
 * mientras los m�todos notify y notifyAll permiten enviar notificaciones individuales y a todo "Thread" 
 * respectivamente, sobre la terminaci�n de un "Thread" especifico.
 */
public class Pistola {
	private boolean enposicion = true;

	public synchronized void disparar(int bala) {
		System.out.println("Llamando a disparar de bala "+bala);
		while (enposicion == false) {
			try {
				// Esperar a apuntar
				System.out.println("Esperando a apuntar bala" +bala);
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Saliendo de disparar bala" +bala);
		enposicion = false;
		notifyAll();//notificar a todo "Thread" la terminaci�n del m�todo y por ende la liberaci�n ("lock") sobre la instancia del Objeto.
	}

	public synchronized void apuntar(int bala) {
		System.out.println("Llamando a apuntar bala "+bala);
		while (enposicion == true) {
			try {
				// Esperar a disparar
				System.out.println("Esperando a disparar bala "+bala);
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Saliendo de apuntar bala" +bala);
		enposicion = true;
		notifyAll();
	}
}
