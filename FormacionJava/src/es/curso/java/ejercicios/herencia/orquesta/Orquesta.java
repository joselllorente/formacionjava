package es.curso.java.ejercicios.herencia.orquesta;

public class Orquesta {
	public static void main(String[] args) {
		
		//Instrumento instru1 = new Instrumento("Nombre","Vacio");
		//Flauta flauta2 = new Instrumento();
		
		Instrumento i1 = new Flauta("flauta1","travesera");
	
		Instrumento i2 =i1;
		
		Instrumento i3 = null;
		
		i3.getNombre();
		
		i2.setNombre(i1.getNombre());
		i1=i2;
		
		i2.tocar();
		
		//Flauta f1 = new Instrumento();
		
		Flauta flauta = new Flauta("flauta1","travesera");
		flauta.setModelo("Modelo1");
		
		Tambor tambor = new Tambor ("Tambor1","Tipo1", "Grande");
		
		Guitarra guitarra = new Guitarra ("Guitarra1","Espa�ola",6);
		
		GuitarraElectrica guitarraElectrica = 
				new GuitarraElectrica ("GE","Electrica",6,150);
		
		Violin violin1 = new Violin();
		
		Instrumento [] instrumentos = {flauta,tambor,
				guitarra, guitarraElectrica,violin1};
		
		boolean afinados = afinarInstrumentos(instrumentos);
		
//		if (afinados){
//			tocarInstrumentos(instrumentos);
//		}
		tocar2(instrumentos);
	}
	
	private static boolean afinarInstrumentos (Instrumento [] arrayInstrumentos){
		
		for (Instrumento instrumento : arrayInstrumentos) {
			instrumento.afinar();
		}
		
		return true;
	}
	
private static boolean tocar2 (Instrumento [] instrumentos){
		
		for (Instrumento instrumento : instrumentos) {
			instrumento.tocar();
			
			if (instrumento instanceof Tambor) {
				Tambor t = (Tambor)instrumento;
				t.aporrear();
			}
			
		}
		
		return true;
	}
	
	private static void tocarInstrumentos (Instrumento [] instrumentos){
		
		do{
			System.out.println("==== Tocando instrumentos ====");
			for (Instrumento instrumento : instrumentos) {
				instrumento.tocar();
				//instrumento.aporrear();
				if (instrumento instanceof Tambor){
//					Tambor t = ((Tambor) instrumento);
//					t.aporrear();
					((Tambor) instrumento).aporrear();
				}
			}
			
		}while (Math.random()>0.4);
	}
}
