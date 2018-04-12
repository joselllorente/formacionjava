package es.curso.java.ejercicios.constructores.tienda;

public class Maniqui {
	private long id;
	private Camisa camisa;
	private Pantalon pantalon;
	private Vestido vestido;
	
	public Maniqui(long id) {
		super();
		this.id = id;
	}

	public Maniqui(long id, Camisa camisa, Pantalon pantalon) {
		super();
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
	}

	public Maniqui(long id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public long getId() {
		return id;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	
	@Override
	public String toString() {
		return "Maniqui [id=" + id + ", camisa=" + camisa + ", pantalon=" + pantalon + ", vestido=" + vestido + "]";
	}

	public void vestir (Camisa camisa, Pantalon pantalon) {
		if (this.vestido!=null)
			desvestir();
		this.camisa = camisa;
		this.pantalon = pantalon;
	}
	
	public void vestir (Vestido vestido) {
		if (this.camisa!=null || this.pantalon!=null)
			desvestir();
		this.vestido= vestido;
	}
	
	public void desvestir () {
		this.pantalon = null;
		this.camisa = null;
		this.vestido = null;
	}
	
	
}
