package es.curso.java.anotaciones;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import es.curso.java.anotaciones.misanotaciones.FrutoSeco;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BolsitaMarcaA bolsitaMarcaA = new BolsitaMarcaA();
		int caloriasTotalesA = contarCaloriasTotalesFrutosSecos(bolsitaMarcaA);
		System.out.println("Calorias totales de los frutos secos de una bolsita de la marca 'A': " + caloriasTotalesA);

		System.out.println("");

		BolsitaMarcaB bolsitaMarcaB = new BolsitaMarcaB();
		int caloriasTotalesB = contarCaloriasTotalesFrutosSecos(bolsitaMarcaB);
		System.out.println("Calorias totales de los frutos secos de una bolsita de la marca 'B': " + caloriasTotalesB);
	}

	public static int contarCaloriasTotalesFrutosSecos(final Object bolsita) {
		Class<?> claseBolsita = bolsita.getClass();

		int caloriasTotales = 0;

		final Field[] variables = claseBolsita.getDeclaredFields();
		for (final Field variable : variables) {

			final Annotation anotacionObtenida = variable.getAnnotation(FrutoSeco.class);

			if (anotacionObtenida != null && anotacionObtenida instanceof FrutoSeco) {
				final FrutoSeco anotacionFrutoSeco = (FrutoSeco) anotacionObtenida;

				int calorias = anotacionFrutoSeco.calorias();

				int cantidad = 0;
				try {
					variable.setAccessible(true);
					cantidad = variable.getInt(bolsita);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}

				String nombreFrutoSeco = variable.getName();

				System.out.println("	-Hay " + cantidad + " de " + nombreFrutoSeco + ", y cada una tiene " + calorias + " calor�as");

				caloriasTotales += (cantidad * calorias);
			}
		}

		return caloriasTotales;
	}

}
