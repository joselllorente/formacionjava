package es.curso.java.metodos;

public class Aula {
	//Varaibles de instancia
	private String nombreAula;
	private int numAlumnos;
	private String colegio;
	private int planta;
	
	public Aula(){
		
	}
	
	Aula(String nombreAula, int numAlumnos, 
			String colegio, int planta){
		this.nombreAula = nombreAula;
		this.numAlumnos = numAlumnos;
		this.colegio = colegio;
		this.planta = planta;
	}

	public Aula(int numAlumnos, String colegio) {
		super();
		this.numAlumnos = numAlumnos;
		this.colegio = colegio;
	}

	public String dameColegioAula(){
		String nombre;
		System.out.println(colegio);
		return colegio;
	}
	
	public String getNombreAula(){
		return this.nombreAula;
	}
	public void setNombreAula(String nombre){
		this.nombreAula=nombre;
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	public String getColegio() {
		return colegio;
	}

	private void setColegio(String colegio) {
		this.colegio = colegio;
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}
	
}
