package es.curso.java.metodos;

public class AulaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Aula aula1 = new Aula("Aula1", 10,"Colegio1",4);
		System.out.println(aula1.getNombreAula());
		System.out.println(aula1.getColegio());
		System.out.println(aula1.dameColegioAula());
		aula1.setNumAlumnos(12);
		//aula1.colegio = "otro Nombre";
	}

}
