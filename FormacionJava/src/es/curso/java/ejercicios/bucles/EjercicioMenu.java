package es.curso.java.ejercicios.bucles;

import java.util.Scanner;

public class EjercicioMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int opcion;
		
		do {

			System.out.println("1. Ejercicio 1");
			System.out.println("2. Ejercicio 2");
			System.out.println("3. Salir");
			// System.out.println("\n\tElige una opcion");
			System.out.print("\n\tElige una opcion: ");

			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();

			System.out.println(opcion);

			switch (opcion) {
				case 1:
					System.out.println("Has seleccionado opcion 1");
					break;
				case 2:
					System.out.println("Has seleccionado opcion 2");
					break;
				case 3:
					System.out.println("Adios!!!");
					break;
				default:
					System.out.println("Opcion Incorrecta");
					break;
			}

		} while (opcion!=3);
		
		System.out.println("Termina");
	}

}
