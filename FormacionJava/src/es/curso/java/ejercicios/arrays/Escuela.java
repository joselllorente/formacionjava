package es.curso.java.ejercicios.arrays;

import java.util.Scanner;

public class Escuela {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		String [][] aulas = new String [3][];
		aulas[0] = new String [3];
		aulas[1] = new String [4];
		aulas[2] = new String [2];
		
		for (int i=0;i<aulas.length;i++){
			System.out.println("Aula "+i);
			for (int j=0;j<aulas[i].length;j++){
				scan = new Scanner(System.in);
				System.out.println("\tIntroduce nombre del alumno "+j);
				aulas[i][j] = scan.nextLine();
			}
		}
		
		
		
		for (int i=0;i<aulas.length;i++){
			
			for (int j=0;j<aulas[i].length;j++){
				System.out.println(aulas[i][j]);
			}
			
		}
		
	}

}
