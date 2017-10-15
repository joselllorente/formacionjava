package es.curso.java.threads.supermercado;

public class Supermercado {
	public static void main(String[] args) {
		ClienteSupermercado cliente1 = new ClienteSupermercado("Nombre1","Ape1","123123M");
		double [] precios = {123.0,23.78,67.0};
		cliente1.setPreciosProductos(precios);
		
		ClienteSupermercado cliente2 = new ClienteSupermercado("Nombre2","Ape2","123123M");
		double [] preciosCliente2 = {23.0,73.78,67.0,10.45,98};
		cliente2.setPreciosProductos(preciosCliente2);
		
		
		CajeraSupermercado cajera1 = 
			new CajeraSupermercado("Cajera1","Ape1","123123M",(int)(Math.random()*5000));
		cajera1.setCliente(cliente1);
		
		CajeraSupermercado cajera2 = 
			new CajeraSupermercado("Cajera2","Ape1","123123M",(int)(Math.random()*5000));
		cajera2.setCliente(cliente2);
		
		cajera1.empiezaADespachar();
		cajera2.empiezaADespachar();
		
		System.out.println("Termina");
		
	}
}








