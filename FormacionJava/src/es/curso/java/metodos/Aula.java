package es.curso.java.metodos;

public class Aula {
	// Varaibles de instancia
	private String nombreAula;
	private int numAlumnos;
	private int planta;
	private Colegio colegio;
	
	// public Aula() {
	// super();
	// // TODO Auto-generated constructor stub
	// }

	public Aula(String nombreAula) {
		super();
		this.nombreAula = nombreAula;
	}

	public Aula(String nombreAula, int numAlumnos) {
		super();
		this.nombreAula = nombreAula;
		this.numAlumnos = numAlumnos;
	}

	public String getNombreAula() {
		return nombreAula;
	}

	 public void setNombreAula(String nombreAula) {
	 this.nombreAula = nombreAula;
	 }

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}


	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public Colegio getColegio() {
		return colegio;
	}

	public void setColegio(Colegio colegio) {
		this.colegio = colegio;
	}

	
}
