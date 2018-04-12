package es.curso.java.arrays;

public class PruebaArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] num  = {1,5,7,8};
		
		int [] num2 = new int [4];
		num2[0] =5;
		num2[1] =6;
		num2[2] =7;
		num2[3] =7;
		
//		for (int i = 0; i < num2.length; i++) {
//			System.out.println(num2[i]);
//		}
//		
//		for (int numero : num2) {
//			System.out.println(numero);
//		}
		
		String [][] salas = new String [4][5];
//		for (int i = 0; i < salas.length; i++) {
//			for (int j = 0;j < salas[0].length;j++) {
//				System.out.println(i + "-" +j);
//			}
//		}
		
		String [][] nombres = new String [2][];	
		nombres [0] = new String [3];
		nombres [1] = new String [5];
		
		for (int i = 0; i < nombres.length; i++) {
			for (int j = 0;j < nombres[i].length;j++) {
				System.out.println(i + "-" +j);
			}
		}
		
		for ( String[] fila : nombres ) {
			for (String nombre : fila) {
				System.out.println(nombre);
			}
		}
		
		if (nombres[1][0]!=null)
			System.out.println(nombres[1][0].toUpperCase());
		//nombres [3][1]= nombres [3][0]= "Juan";
		
//		System.out.println(num2[4]);
	}

}
