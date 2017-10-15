package es.curso.java.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.curso.java.ejercicios.herencia.orquesta.Flauta;
import es.curso.java.ejercicios.herencia.orquesta.Instrumento;
import es.curso.java.ejercicios.herencia.orquesta.Tambor;

public class PruebaColecciones {

	public static void main(String[] args) {
		
		ArrayList<Instrumento> lista = new ArrayList<Instrumento>();
		
		Tambor t = new Tambor ("tambor","");
		Flauta f = new Flauta ("flauta","");
//		lista.add("Valor1");
//		lista.add(3);
		
		System.out.println(lista.size());
		
		boolean agregado = lista.add(t);
		System.out.println(agregado);
		
		agregado = lista.add(t);
		System.out.println(agregado);
		System.out.println(lista.size());

		//Instrumento elemento = lista.remove(2);
		System.out.println("Posicion 0 "+lista.get(0).getNombre());
		
		lista.add(0, f);
		
		System.out.println("Posicion 0 "+lista.get(0).getNombre());
		
		List <Instrumento> listaInstrumentos =
				new ArrayList<Instrumento>();
		
		listaInstrumentos.addAll(lista);
		//listaInstrumentos.add(f);
		
		for (Instrumento instrumento : listaInstrumentos) {
			System.out.println(instrumento.getNombre());
		}
		
		Iterator ite = listaInstrumentos.iterator();
		
		while (ite.hasNext()){
			System.out.println("Accediendo a la lista 0");
			Instrumento ins = (Instrumento)ite.next();
			System.out.println(ins);
			System.out.println("Accediendo a la lista 2\n");
		}
	}

}
