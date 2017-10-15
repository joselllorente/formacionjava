package es.curso.java.arrays;

public class PruebaArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] num = {1,5,7,8};
		
		int [] num2 = new int [4];
		num2[0] =5;
		num2[1] =6;
		num2[2] =7;
		num2[3] =7;
		
		String [][] nombres = new String [2][];
		nombres [0] = new String [3];
		nombres [1] = new String [5];
		
		//nombres [3][1]= nombres [3][0]= "Juan";
		
		System.out.println(num2[4]);
	}

}
