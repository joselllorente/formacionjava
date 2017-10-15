package es.curso.java.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {

	public boolean validaEmail(String email){
		boolean emailCorrecto=true;
		email = email.trim();
		
		if (email.contains(" ")){
			emailCorrecto=false;
		}else{
			//Comprobamos que existe solo una @
			int posArroba = email.indexOf("@");
			if( posArroba>0 && posArroba!=(email.length()-1) &&
					(posArroba ==email.lastIndexOf("@")) ){
				
				String url = email.substring(posArroba+1);
				System.out.println("Url:"+url);
				//Validamos que haya un punto despues de la arroba
				//y al menos un caracter antes del primer punto
				int posPunto = url.indexOf(".");
				if (posPunto>0){
					
					//Validamos que despues del ultimo punto
					//haya como mínimo dos caracteres
					System.out.println("Texto despues ultimo punto '"+url.substring(url.lastIndexOf(".")+1)+"'");
					int longDominio=
						url.substring(url.lastIndexOf(".")+1).length();
					
					if(longDominio<=1 || longDominio>4){
						emailCorrecto=false;
					}
					
				}else{
					emailCorrecto=false;
				}
				
				
			}else{
				emailCorrecto=false;
			}
		}

		return emailCorrecto;
	}
	
	
	public static int pideEntero(String texto){
		int reply =0;
		System.out.println(texto);

		Scanner scan = new Scanner(System.in);
		
		try{
			reply = scan.nextInt();
		}catch(InputMismatchException iae){
			System.out.println("El numero introducido no es correcto");
			reply = pideEntero(texto);
		}
		
		
		return reply;
	}

	public static String pideCadena(String texto){
		String reply ="";
		boolean esTextoValido=false;
		do{
			System.out.println(texto);
	
			Scanner scan = new Scanner(System.in);
			reply = scan.nextLine();
			
			for (int i=0;i<reply.length() ; i++){
				char caracter = reply.charAt(i);
				if (! Character.isDigit(caracter) ){
					esTextoValido=true;
					break;
				}
			}
		}while( !esTextoValido );
		
		return reply;
	}
	
	
	public static void pintaArray(String [] opcionesMenu ){
		
		for (String opcion : opcionesMenu) {
			System.out.println(opcion);
		}
		
	}
	
	
	public static int pintaMenu (String [] opcionesMenu){
		int reply=0;
//		pintaArray(opcionesMenu);
//		reply = pideEntero("Selecciona una opcion");

		reply = pintaMenu (opcionesMenu,"Selecciona una opcion");
		
		return reply;
	}
	
	public static int pintaMenu (String [] opcionesMenu, String texto){
		int reply=0;
		pintaArray(opcionesMenu);
		reply = pideEntero(texto);
		
		return reply;
	}
	
	public static Connection getConexionBBDD (){
		Connection reply=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Obteniendo conexion");
			reply = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "cursojava", "cursojava");
			System.out.println("Conectado");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		

		
		return reply;
	}
}









