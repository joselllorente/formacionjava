package es.curso.java.ficheros.simple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String fichero = "C:/Micarpeta/fichero.txt";
			File miFichero = new File(fichero);
			
			FileInputStream fis = new FileInputStream(miFichero);
			InputStreamReader isr = new InputStreamReader (fis);
			BufferedReader br = new BufferedReader(isr);
			String line = br.readLine();
			while (line!=null){
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException es) {
			// TODO Auto-generated catch block
			es.printStackTrace();
		}

	}

}
