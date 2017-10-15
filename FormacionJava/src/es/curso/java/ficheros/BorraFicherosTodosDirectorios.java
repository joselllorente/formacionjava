package es.curso.java.ficheros;

import java.io.File;

public class BorraFicherosTodosDirectorios {

	
	public static void main(String[] args) {
		
		File ruta;
		do{
			String path = "C:/Eclipse";
			ruta = new File(path);
			
		}while(!ruta.exists()||ruta.isFile());
		
		muestraDirectorio(ruta);
		
	}
	
	private static void muestraDirectorio(File directorio){
		
		File [] ficheros = directorio.listFiles();
		for (File file : ficheros) {
			System.out.println(file.getAbsolutePath()+"\t\t");
//			System.out.print(file.isFile()+"\t");
//			System.out.print(file.length()+"\t");
//			System.out.print(file.isHidden()+"\t");
//			System.out.println("----------------------------------------");
			
			if (file.isDirectory() && file.listFiles().length>0 ){
				muestraDirectorio(file);
			}
		}
		
	}

}
