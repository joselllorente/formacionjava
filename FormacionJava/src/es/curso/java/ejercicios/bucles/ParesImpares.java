package es.curso.java.ejercicios.bucles;

public class ParesImpares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		for(int i=0,j=99;(i<=100 && j>=0);i+=2,j-=2){
//			System.out.println(""+i+","+j);
//		}
		
		for (int i=0;i<=100;i+=2){
			System.out.println(""+i+","+ (99-i));
		}
		
	}
}
