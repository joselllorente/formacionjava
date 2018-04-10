package es.curso.java.excepciones;

public class PruebaExcepciones {

	public static void main(String[] args) {
		System.out.println("Empieza");

		String[] nombres = {"",""};
		
		
			try {
				miMetodo();
			} catch (MiExcepcion e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		try {
//			int num = 9/0;
//			Doctor d = null;
//			d.getAniosEstudio();
//			nombres[2]="";
		}catch(ArrayIndexOutOfBoundsException | NullPointerException aiobe) {
			System.out.println("Error "+aiobe.getMessage());
		}catch(Exception e) {
			System.out.println("Error general"+e.getMessage());
		}finally {
			System.out.println("Siempre se ejecuta");
		}
		
		System.out.println("Acaba");
	}
	
	static void miMetodo() throws MiExcepcion, Exception{
		throw new Exception("Excepcion creada por mi");
	}

}
