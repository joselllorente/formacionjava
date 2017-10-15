package es.curso.java.herencia;

public interface Interface1 extends Interface2{
	String GOOD = "BUENO";
	String REGULAR = "REGULAR";
	String BAD = "MALO";
	
	public void metodo1();
	public abstract String metodo2();
	public void metodo3(int num, String...strings );
	
//	public void metodo4 (){
//		
//	}
}
