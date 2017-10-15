package es.curso.java.anotaciones;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainReflexion {
	public static void main(String[] args) {
		//Obtener el Class directamente de un objeto (Recordatorio: un objeto de tipo String v�lido es un texto entre comillas)
		Class classDelTexto = "Un texto".getClass();
		System.out.println(classDelTexto.getName());
		System.out.println(classDelTexto.getSimpleName());
		
		Integer numero = 5;
		Class classDelNumero = numero.getClass();
		System.out.println(classDelNumero.getName());
		
		//Para tipos primitivos tenemos que usar �.class� 
		//(Recordatorio: algunos tipos primitivos son int, boolean, float, etc)		
		Class classDeBooleanA = int.class;
		Class classDeBooleanB = boolean.class;

		//Tambi�n podemos obtener una clase desde un nombre completamente cualificado (fully-quailified name); esto es, el nombre del paquete donde est� nuestra clase, seguido del nombre de la clase
		try {
			Class cl = Class.forName("es.curso.portal.ClaseReflexion");
			
			ClaseReflexion cr = new ClaseReflexion("Valor1",1,false);
			cr.param2="Hola";
			
			Class c = cr.getClass();
			
			System.out.println(c.getName());
			
			Field [] params =  c.getDeclaredFields();
			for (Field field : params) {
				System.out.println(field.getName());
			}
			
			//Si queremos obtener una variable p�blica
			Field variableString = c.getField("param2");
			System.out.println("Valor de param2: "+(String)variableString.get(cr));
			
			//Si queremos obtener una variable, sea privada o no
			Field variableInt = c.getDeclaredField("num");
			//System.out.println("Valor de num"+(Integer) variableInt.get(cr));
			
			
			//Si queremos obtener un array con todas las variables p�blicas de nuestra clase
			Field[] todasLasVariables = c.getFields();

			//Si queremos obtener todas las variables, independientemente de si son privadas o no
			Field[] todasLasVariablesDeclaradas = c.getDeclaredFields();
			
			//Si queremos obtener un m�todo p�blico. Si tiene par�metros podremos pasar cada uno de sus tipos.class  en orden despu�s del nombre
			Method metodoGetString = c.getMethod("metodo1");
			
			Method metodoGetString2 = c.getMethod("metodo1",String.class);
			
			//Si queremos obtener un m�todo, sea privado o no. Si tiene par�metros podremos pasar cada uno de sus tipos.class en orden despu�s del nombre
			Method metodoGetInt = c.getDeclaredMethod("metodo1", String.class);

			//Si queremos obtener un array con todas las variables p�blicas de nuestra clase
			Method[] todosLosMetodos = c.getMethods();			
			//Si queremos obtener todos los m�todos, independientemente de si son privados o no
			Method[] todosLosMetodosDeclarados = c.getDeclaredMethods();
			for (Method method : todosLosMetodosDeclarados) {
				
			}
			//Si queremos obtener un array con todos los constructores publicos de nuestra clase
			Constructor[] todosLosConstructoresPublicos = c.getConstructors();

			//Si queremos obtener todos los m�todos, independientemente de si son privados o no
			Constructor[] todosLosConstructores = c.getDeclaredConstructors();
			
		} catch (ClassNotFoundException|
				IllegalAccessException | 
				NoSuchMethodException | 
				NoSuchFieldException | 
				SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
