package es.curso.java.ejercicios.arrays;

public class ArrayColores {

	public static void main(String[] args) {
		
		String [] colores = {"Rojo","Azul","Amarillo"};
		
		for (int i = 0; i < colores.length; i++) {
			System.out.println(colores[i]);
		}

		System.out.println("==================");
		
		for (String color : colores) {
			System.out.println(color);
		}
		
	}

}
