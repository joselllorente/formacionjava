package es.curso.java.ejercicios.herencia.SeleccionFutbol.seleccion;

public class Main {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	static SeleccionFutbol[] integrantes = new SeleccionFutbol[3];

	public static void main(String[] args) {
		SeleccionFutbol iniesta = new Futbolista("Andres", "Iniesta", 29, 6, "Interior Derecho");
		SeleccionFutbol delBosque = new Entrenador("Vicente", "Del Bosque", 60, 28489);
		SeleccionFutbol raulMartinez = new Masajista("Ra�l", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes[0]=delBosque;
		integrantes[1]=iniesta;
		integrantes[2]=raulMartinez;
		
		
		Entrenador entrenador1 = new Entrenador("Ramon","",78,213);
		entrenador1.concentrarse();
		
		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo m�todo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo m�todo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();
		}
//		
		// ENTRENAMIENTO
		System.out.println("\nEntrenamiento: Todos los integrantes tienen su funci�n en un entrenamiento (Especializaci�n)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.entrenamiento();
		}
//
//		// PARTIDO DE FUTBOL
		System.out.println("\nPartido de F�tbol: Todos los integrantes tienen su funci�n en un partido (Especializaci�n)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.partidoFutbol();
		}
//		
//		// PLANIFICAR ENTRENAMIENTO
		System.out.println("\nPlanificar Entrenamiento: Solo el entrenador tiene el m�todo para planificar un entrenamiento:");
		System.out.print(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
		((Entrenador) delBosque).planificarEntrenamiento();

//		// ENTREVISTA
		System.out.println("\nEntrevista: Solo el futbolista tiene el m�todo para dar una entrevista:");
		System.out.print(iniesta.getNombre() + " " + iniesta.getApellidos() + " -> ");
		((Futbolista) iniesta).entrevista();
//
//		// MASAJE
		System.out.println("\nMasaje: Solo el masajista tiene el m�todo para dar un masaje:");
		System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
		((Masajista) raulMartinez).darMasaje();
	}
}