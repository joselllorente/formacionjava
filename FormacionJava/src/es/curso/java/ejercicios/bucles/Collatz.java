package es.curso.java.ejercicios.bucles;

import java.util.Scanner;

public class Collatz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Escribe un numero:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num);
		while(num!=1){
			if (num%2==0){
				num= num/2;
			}else{
				num = (num*3)+1;
			}
			System.out.println(num);
		}
		System.out.println("FINALIZA!");
	}

}
