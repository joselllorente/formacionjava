package es.curso.java.ficheros.simple;

import java.io.File;

public class MisFicheros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fichero = "C:/Micarpeta/fichero.txt";
		File miFichero = new File(fichero);
		
		if (miFichero.exists()){
			if (miFichero.isDirectory()){
				File[] ficheros = miFichero.listFiles();
				
				for (int i = 0; i<ficheros.length;i++){
					File ficheroObtenido = ficheros[i];
					System.out.println(ficheroObtenido.getAbsolutePath() +" " + ficheroObtenido.isHidden());
				}
				
			}else if(miFichero.isFile()){ 
				System.out.println("Nombre" + miFichero.getName() + " tama�o "+miFichero.length());
			}
		}else{
			System.out.println("El fichero no existe");
		}

	}

}
