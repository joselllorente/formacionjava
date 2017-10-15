package es.curso.java.ejercicios.herencia.centralita;

public class CentralitaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Centralita c = new Centralita();
		Llamada l1 = new LlamadaLocal("911234567", "919876543", 67);
		c.registrarLlamadas(l1);
		Llamada l2 = new LlamadaLocal("919876543", "911234567", 43);
		c.registrarLlamadas(l2);

		Llamada p1 = new LlamadaProvincial("919876543", "939876543", 12, 1);
		c.registrarLlamadas(p1);
		System.out.println("N� total de llamadas: " + c.getTotalLlamadas());
		System.out.println("Total Facturado: " + c.getTotalFacturado());

	}

}
