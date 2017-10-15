package es.curso.java.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeerEscribirFicherosTextoJDK7 {

	final static String FILE_NAME = "D:\\input.txt";
	final static String OUTPUT_FILE_NAME = "D:\\output.txt";
	final static Charset ENCODING = StandardCharsets.UTF_8;
	
	public static void main(String... aArgs) throws IOException {

		LeerEscribirFicherosTextoJDK7 text = new LeerEscribirFicherosTextoJDK7();
		// Tratamiento con fichero peque�o con Java 7
		List<String> lines = text.readSmallTextFile(FILE_NAME);

		log(lines);

		lines.add("Esta es una l�nea a�adida desde el c�digo.");

		text.writeSmallTextFile(lines, FILE_NAME);

		// Tratamiento para ficheros grandes usando buffering
		text.readLargerTextFile(FILE_NAME);

		lines = Arrays.asList("Down to the Waterline", "Water of Love");

		text.writeLargerTextFile(OUTPUT_FILE_NAME, lines);

	}

	
	// Para ficheros peque�os. Java 7
	/**
	 * Nota: el javadoc de Files.readAllLines dice que es recomendable para
	 * peque�os ficheros. Pero su implementaci�n usa buffering, por lo que
	 * tambi�n es recomendable para usarlo con ficheros de texto de mayor
	 * tama�o.
	 */
	List<String> readSmallTextFile(String aFileName) throws IOException {

		Path path = Paths.get(aFileName);
		return Files.readAllLines(path, ENCODING);

	}

	void writeSmallTextFile(List<String> aLines, String aFileName)
			throws IOException {
		Path path = Paths.get(aFileName);
		Files.write(path, aLines, ENCODING);

	}

	// Para ficheros grandes Java 7
	void readLargerTextFile(String aFileName) throws IOException {

		Path path = Paths.get(aFileName);
		Scanner scanner = new Scanner(path, ENCODING.name());
		try {
			while (scanner.hasNextLine()) {

				// procesa cada l�nea del mismo modo
				log(scanner.nextLine());

			}
		}catch(Exception e){
			System.out.println("Error "+e.getMessage());
		}

	}

	void readLargerTextFileAlternate(String aFileName) throws IOException {

		Path path = Paths.get(aFileName);

		try (BufferedReader reader = Files.newBufferedReader(path, ENCODING)) {

			String line = null;

			while ((line = reader.readLine()) != null) {

				// procesa cada l�nea del mismo modo

				log(line);

			}

		}

	}

	void writeLargerTextFile(String aFileName, List<String> aLines)
			throws IOException {

		Path path = Paths.get(aFileName);

		try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)) {

			for (String line : aLines) {

				writer.write(line);

				writer.newLine();

			}

		}

	}

	private static void log(Object aMsg) {

		System.out.println(String.valueOf(aMsg));

	}

}
