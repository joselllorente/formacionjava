package es.curso.java.mapas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProbandoMapas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String,Integer> mapa = new HashMap<String,Integer>();
		
		mapa.put("numero1", 3);
		mapa.put("numero3", 4);
		mapa.put("numero2", 5);

		mapa.containsKey("numero2");
		mapa.containsValue(5);
		
		
		mapa.remove("numero1");
		
		Collection <Integer> valores = mapa.values();
		
//		for (Integer nums : valores) {
//			System.out.println(nums);
//		}
		
		Set<String> claves = mapa.keySet();
		
//		for (String clave : claves) {
//			System.out.println("clave: "+clave);
//			System.out.println("Valor: "+mapa.get(clave));
//		}
		
		Set<Entry<String,Integer>> entries = mapa.entrySet();
		
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		
	}

}
