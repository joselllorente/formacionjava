package es.curso.java.ejercicios.strings;

public class ValidaEmails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Validando emails ");
		for (String email : args) {
			System.out.println("Validando email "+email);
			boolean emailValido = true;
			String error = "";
			if(email.contains(" ")){
				emailValido = false;
				error = "El email contiene un espacio en blanco";
			}else if (!email.contains("@")){
				emailValido = false;
				error = "El email no contiene la @";
			}else if (email.indexOf("@") != email.lastIndexOf("@")){
				emailValido = false;
				error = "El email contiene mas de una @";
			}else{
				String dominio = email.substring(email.indexOf("@")+1);
				System.out.println("dominio: "+dominio);
				if (!dominio.contains(".")){
					emailValido = false;
					error = "No contiene punto despues de la @";
				}else{
					String extension = dominio.substring(dominio.lastIndexOf(".")+1);
					System.out.println("extension: "+extension);
					if (extension.length()<2){
						emailValido = false;
						error = "Longitud de la extension del dominio incorrecta "+extension;
					}
				}
			}
			
			if (emailValido){
				System.out.println("El email "+email+ " es correcto");
			}else{
				System.out.println("El email "+email+ " no es correcto");
				System.out.println(error);
			}
		}
		
		
	}

}
