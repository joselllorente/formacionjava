package es.curso.java.herencia;

public abstract class HospitalNuevo {
	private String direccion;

	public HospitalNuevo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HospitalNuevo(String direccion) {
		super();
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	protected abstract void metodoHospital(String valor);
	
	protected abstract void metodoHospital2();
}
