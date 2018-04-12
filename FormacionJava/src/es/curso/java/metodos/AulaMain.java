package es.curso.java.metodos;

public class AulaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Aula aula0 = new Aula("NombreAula0");
		System.out.println(aula0.getNombreAula());
		
		Aula aula1 = new Aula("NombreAula1",4);
		
		Aula aula2 = aula1;
		
		System.out.println(aula0);
		System.out.println(aula1);
		System.out.println(aula2);

		aula2.setNumAlumnos(6);
		System.out.println(aula1.getNumAlumnos());
		
		aula2.setNumAlumnos(aula1.getNumAlumnos());
		
		metodoAula(aula2);
		
		System.out.println(aula1.getNombreAula());
		
		Colegio colegio1 = new Colegio("Cole1");
		aula0.setColegio(colegio1);
		System.out.println(aula0.getColegio().getNombre());
		
	}

	public static void metodoAula(Aula a) {

		a.setNombreAula("OtroNombre");
		
	}
}
