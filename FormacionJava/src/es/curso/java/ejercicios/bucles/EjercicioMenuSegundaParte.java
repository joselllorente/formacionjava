package es.curso.java.ejercicios.bucles;

import java.util.Scanner;

public class EjercicioMenuSegundaParte {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int opcion;
		
		do {

			System.out.println("\n1. Conjetura Collatz");
			System.out.println("2. Pintar Cuadrado");
			System.out.println("3. Salir");
			// System.out.println("\n\tElige una opcion");
			System.out.print("\n\tElige una opcion: ");

			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();

			System.out.println(opcion);

			switch (opcion) {
				case 1:
					System.out.println("Has seleccionado opcion 1");
					
					System.out.print("\n\tIntroduce un numero: ");
					int num = scan.nextInt();
					System.out.print(num);
					while(num!=1){
						System.out.print(", ");
						if (num%2==0){
							num = num/2;
						}else{
							num = num*3+1;
						}
						System.out.print(num);
					}
					
					break;
				case 2:
					System.out.println("Has seleccionado opcion 2");
					
					System.out.print("\n\tIntroduce tama�o: ");
					int size = scan.nextInt();
					
					for (int i=1;i<=size;i++){
						for (int j=0;j<size;j++){
							System.out.print("*\t");
						}
						System.out.println("\n");
					}
					
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
