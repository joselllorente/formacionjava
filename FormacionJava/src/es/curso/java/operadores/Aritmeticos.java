package es.curso.java.operadores;

public class Aritmeticos {
	public static void main(String[] args) {

		int num1=3, num2=1, num3 =9, num4 = 15;
		
		//System.out.println(""+((num2+num3)*num1));
		
		int resultado = num1+ num2;
		
		System.out.println(resultado);
		System.out.println(resultado++);
		System.out.println(--resultado);
		
		num3 -= 15;
		//num3 = num3 + 15;
		System.out.println(num3);
		
		System.out.println("==========================");
		System.out.println(num3%num2);
		System.out.println(num3%num1);
		System.out.println(num4%num3);
		
	}
}
