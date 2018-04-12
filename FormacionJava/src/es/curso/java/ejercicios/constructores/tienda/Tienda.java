package es.curso.java.ejercicios.constructores.tienda;

public class Tienda {

	public static void main(String[] args) {
		Tienda t = new Tienda ();
		t.abrir();
	}

	private void abrir () {
		Boton b1 = new Boton("pequeño","blanco");
		Boton b2 = new Boton("pequeño","blanco");
		Boton b3 = new Boton("mediano","negro");
		
		Pantalon p1 = new Pantalon("L","Azul",39.99,b3);
		Pantalon p2 = new Pantalon("L","Negro",29.99,b3);
		
		Boton [] botones = {b1,b2};
		
		Camisa c1 = new Camisa ("L","Azul",39.99, botones  );
		Camisa c2 = new Camisa ("L","Blanca",59.99, botones );
		
		Vestido vestido = new Vestido("Azul",59.99);
		
		Maniqui m1 = new Maniqui (123123);
		m1.vestir(c2, p1);
		
		
		Maniqui m2 = new Maniqui (453453,c1,p2);
		m2.desvestir();
		
		Maniqui m3 = new Maniqui (67856,vestido);
		
		Maniqui[] maniquies = {m1,m2,m3};
		
		calculaPrecioManiquis(maniquies);
	}
	
	
	private void calculaPrecioManiquis(Maniqui[] maniquis){
		double precio;
		for (Maniqui maniqui : maniquis) {
			precio = 0;
			if (maniqui.getPantalon() != null && 
					maniqui.getCamisa()!=null) {
				precio = 
						maniqui.getPantalon().getPrecio() +
						maniqui.getCamisa().getPrecio();
			}else if (maniqui.getVestido()!=null) {
				precio = maniqui.getVestido().getPrecio();
			}
			
			System.out.println("Precio de la ropa del maniqui "
					+maniqui.getId() + " es " + precio);
		}
	}
	private void mostrarEscaparate (Maniqui[] ms) {
		
		for (Maniqui maniqui : ms) {
			
			Camisa camisa = maniqui.getCamisa();
			Pantalon pantalon = maniqui.getPantalon();
			if(camisa!=null)
				System.out.println(camisa.getColor());
			if (pantalon!=null)
				System.out.println(pantalon.getColor());
			
			System.out.println(maniqui);
		}
	}
	
}
