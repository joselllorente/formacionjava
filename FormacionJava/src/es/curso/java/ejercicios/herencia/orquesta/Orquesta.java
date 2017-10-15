package es.curso.java.ejercicios.herencia.orquesta;

public class Orquesta {
	public static void main(String[] args) {
		Flauta flauta = new Flauta("flauta1","travesera");
		flauta.setModelo("Modelo1");
		
		Tambor tambor = new Tambor ("Tambor1","Tipo1", "Grande");
		
		Guitarra guitarra = new Guitarra ("Guitarra1","Española",6);
		
		GuitarraElectrica guitarraElectrica = 
				new GuitarraElectrica ("GE","Electrica",6,150);
		
		
		Instrumento [] instrumentos = {flauta,tambor,guitarra, guitarraElectrica};
		boolean afinados = afinarInstrumentos(instrumentos);
		
		if (afinados){
			tocarInstrumentos(instrumentos);
		}
	}
	
	private static boolean afinarInstrumentos (Instrumento [] instrumentos){
		
		for (Instrumento instrumento : instrumentos) {
			instrumento.afinar();
		}
		
		return true;
	}
	
	private static void tocarInstrumentos (Instrumento [] instrumentos){
		
		do{
			System.out.println("==== Tocando instrumentos ====");
			for (Instrumento instrumento : instrumentos) {
				instrumento.tocar();
				if (instrumento instanceof Tambor){
					((Tambor) instrumento).aporrear();
				}
			}
		}while (Math.random()>0.4);
	}
}
