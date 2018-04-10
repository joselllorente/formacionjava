package es.curso.java.ejercicios.herencia.HerenciaAnimales;

public class Test {

	public static void main(String[] args) {

		// Integer numero = new Integer(12);
		// System.out.println(numero);
		// //num = metodo1 (numero);
		// System.out.println(numero);
		// numero++;
		// numero = numero +1;
		// System.out.println(numero);

		for (int i = 0; i < 10;) {
			i = i++;// what is happening is that i gets pointed to a 
					//new memory location that stores the value of i 
					//(in this case 0) and then increments the old location.
			System.out.println(i);
		}

	}

	static int metodo1(int i) {
		int oldValue = i;
		i = i + 1;
		i = oldValue;
		
		return i;
	}

}
