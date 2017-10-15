package es.curso.java.anotaciones;

public class ClaseReflexion {
	public String param2;
	private String param;
	private int num;
	private boolean nuevo;
	
	public ClaseReflexion() {
		super();
	}
	
	public ClaseReflexion(String param, int num, boolean nuevo) {
		super();
		this.param = param;
		this.num = num;
		this.nuevo = nuevo;
	}

	public String metodo1(){
		return "1";
	}
	
	public String metodo1(String param1){
		return "2";
	}

	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isNuevo() {
		return nuevo;
	}
	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}
}
