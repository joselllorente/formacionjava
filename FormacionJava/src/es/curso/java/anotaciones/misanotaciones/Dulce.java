package es.curso.java.anotaciones.misanotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Dulce {
	public static final int VALOR_POR_DEFECTO = 0;

	int value() default VALOR_POR_DEFECTO;	
}
