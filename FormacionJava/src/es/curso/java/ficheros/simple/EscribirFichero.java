package es.curso.java.ficheros.simple;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File fichero = new File ("C:/Users/SAT/Documents/mifichero3.txt");
		FileWriter fw=null;
		if (fichero.exists()){
			
			try {
				fw = new FileWriter(fichero,true);
				BufferedWriter bw = new BufferedWriter(fw);
				
				for (int i=0;i<10;i++){
					bw.write("Hola Mundo!\n");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					fw.flush();
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
