package es.curso.java.threads.supermercado;

import es.curso.java.ejercicios.constructores.Persona;

public class CajeraSupermercado extends Persona implements Runnable {

	private ClienteSupermercado cliente;
	private int parsimonia;
	private Thread miThread;
	
	public CajeraSupermercado() {
		super();
	}

	public CajeraSupermercado(String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
		
		miThread = new Thread(this,nombre);
	}

	public CajeraSupermercado(String nombre, String apellidos, String dni,
			int parsimonia) {
		super(nombre, apellidos, dni);
		this.parsimonia = parsimonia;
		miThread = new Thread(this,nombre);
	}

	public ClienteSupermercado getCliente() {
		return cliente;
	}

	public void setCliente(ClienteSupermercado cliente) {
		this.cliente = cliente;
	}

	public int getParsimonia() {
		return parsimonia;
	}

	public void setParsimonia(int parsimonia) {
		this.parsimonia = parsimonia;
	}

	public Thread getMiThread() {
		return miThread;
	}

	public void setMiThread(Thread miThread) {
		this.miThread = miThread;
	}

	public void run() {
		
		double total=0;
		double [] precios = this.cliente.getPreciosProductos();
		long initialTime = System.currentTimeMillis();

		System.out.println("La cajera " + getNombre() +
				" COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " 
				+ this.cliente.getNombre());
		
		for (double precio : precios) {
			total += precio;
			System.out.println("\tLa cajera " + getNombre() + " PROCESA PRODUCTO DE PRECIO " 
					+ precio);
			try {
				System.out.println("parsimonia:" + parsimonia);
				Thread.sleep(parsimonia);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("La cajera " + getNombre() + " HA TERMINADO DE PROCESAR " 
				+ this.cliente.getNombre() + " EN EL TIEMPO: " 
				+ (System.currentTimeMillis() - initialTime) / 1000 
				+ "seg");
		
		System.out.println("El cliente "+this.cliente.getNombre()+ " tiene una factura de "+total+ " �");
	}
	
	
	public void empiezaADespachar(){
		System.out.println("Empieza a despachar cajera "+getNombre());
		//new Thread(miThread).start();
		miThread.start();
	}
}





