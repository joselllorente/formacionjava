package es.curso.java.ejercicios.strings;

import java.util.Scanner;

public class ValidaEmails2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String respuesta="";
		do{
			System.out.println("Escribe un email");
			Scanner scan = new Scanner(System.in);
			String email = scan.nextLine();
			
			email= email.trim();
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
					if (dominio.substring(0, 
							dominio.indexOf(".")).length()<1){
						emailValido = false;
						error = "El espacio entre la @ y el punto es insuficiente";
					}else {
						String extension = dominio.substring(
								dominio.lastIndexOf(".")+1);
						System.out.println("extension: "+extension);
						if (extension.length()<2 || extension.length()>4){
							emailValido = false;
							error = "Longitud de la extension del dominio incorrecta "+extension;
						}
					}
				}
			}
			
			if (emailValido){
				System.out.println("El email "+email+ " es correcto");
			}else{
				System.out.println("El email "+email+ " no es correcto");
				System.out.println(error);
			}
			
			System.out.println("Quieres validar otro email (Si/No)");
			respuesta = scan.nextLine();
		}while(!respuesta.trim().equalsIgnoreCase("NO"));
		
		System.out.println("Adios");
		
	}

}
