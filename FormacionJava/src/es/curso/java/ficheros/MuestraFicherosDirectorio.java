package es.curso.java.ficheros;

import java.io.File;

public class MuestraFicherosDirectorio {

	public static void main(String[] args) {
		
		File ruta;
		do{
			String path = "C:/";
			ruta = new File(path);
			
		}while(!ruta.exists()||ruta.isFile());
		
		
		File [] ficheros = ruta.listFiles();
		System.out.println("NOMBRE\t\tEs Fichero\tTamaño\tOculto");
		System.out.println("========================================");
		for (File file : ficheros) {
			System.out.print(file.getName()+"\t\t");
			System.out.print(file.isFile()+"\t");
			System.out.print(file.length()+"\t");
			System.out.print(file.isHidden()+"\t");
			System.out.println("----------------------------------------");
		}
		

	}

}











