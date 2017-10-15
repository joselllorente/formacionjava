package es.curso.java.ficheros;

import java.io.File;

public class MuestraFicherosTodosDirectorios {

	
	public static void main(String[] args) {
		
		File ruta;
		String extensionFichero;
		do{
			String path = "C:/";
			ruta = new File(path);
			
			extensionFichero = ".txt";
			
		}while(!ruta.exists()||ruta.isFile());
		
		muestraDirectorio(ruta, extensionFichero);
		
	}
	
	private static void muestraDirectorio(File directorio, String extension){
		
		File [] ficheros = directorio.listFiles();
		for (File file : ficheros) {
			if (file.isDirectory() && file.listFiles().length>0 ){
				muestraDirectorio(file,extension);
			}else if(file.isFile() && 
					file.getName().endsWith(extension)){
				System.out.println("Borrando fichero "+file.getAbsolutePath());
				file.delete();
			}
		}
		
	}

}
