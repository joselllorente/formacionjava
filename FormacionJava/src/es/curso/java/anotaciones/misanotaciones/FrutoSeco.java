package es.curso.java.anotaciones.misanotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//Indica c�mo se va a guardar la anotaci�n usada.
/*
-SOURCE: La anotaci�n se retiene solo a nivel de c�digo fuente; es decir, se descarta la anotaci�n durante la compilaci�n (no se escribir� en el bytecode de tu programa, por lo que no se podr� ejecutarse).

-CLASS: Se retiene la anotaci�n por el compilador en tiempo de compilaci�n, pero la M�quina Virtual de Java la ignora.

-RUNTIME: Se retiene por la M�quina Virtual de Java, por lo que puede ser utilizada en tiempo de ejecuci�n. Por lo que la anotaci�n estar� disponible en tiempo de ejecuci�n mediante Reflection.
 * */
@Target(ElementType.FIELD)//d�nde vamos a permitir que se coloque: variable, clase, m�todo, constructor, etc
public @interface FrutoSeco {
	boolean tieneVitaminaE() default false;

	int calorias();
	
	String arbolQueDaEsteFruto() default "";
}
