package es.curso.java.operadores;

public class Logicos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num1=3, num2=3, num3 =9, num4 = 15;
		
		//System.out.println(!(num1<num2));
		
		System.out.println(!((num1 > num3) || (num2<num4)));

		boolean sonIguales = (num1 == num2);
		System.out.println(sonIguales);
	}

}
