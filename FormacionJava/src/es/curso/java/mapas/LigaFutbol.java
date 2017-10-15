package es.curso.java.mapas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LigaFutbol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Jugador jugador1 = new Jugador ("Nombre1","Apellido1","11111A",1);
		Jugador jugador2 = new Jugador ("Nombre2","Apellido2","11111A",2);
		Jugador jugador3 = new Jugador ("Nombre3","Apellido3","11111A",3);
		Jugador jugador4 = new Jugador ("Nombre4","Apellido4","11111A",4);
		Jugador jugador5 = new Jugador ("Nombre5","Apellido5","11111A",5);
		Jugador jugador6 = new Jugador ("Nombre2","Apellido6","11111A",6);
		Jugador jugador7 = new Jugador ("Nombre6","Apellido7","11111A",7);
		
		Set<Jugador> jugadoresEquipo1 = new HashSet<Jugador>();
		jugadoresEquipo1.add(jugador1);
		jugadoresEquipo1.add(jugador4);
		jugadoresEquipo1.add(jugador5);
		
		Set<Jugador> jugadoresEquipo2 = new HashSet<Jugador>();
		jugadoresEquipo2.add(jugador2);
		jugadoresEquipo2.add(jugador3);
		
		Set<Jugador> jugadoresEquipo3 = new HashSet<Jugador>();
		jugadoresEquipo3.add(jugador6);
		jugadoresEquipo3.add(jugador7);

		Map<String, Set<Jugador>> equipos = new HashMap<String, Set<Jugador>>();
		equipos.put("Equipo1", jugadoresEquipo1);
		equipos.put("Equipo2", jugadoresEquipo2);
		equipos.put("Equipo3", jugadoresEquipo3);

		Set<String> claveEquipos  = equipos.keySet();
		for (String claveEquipo : claveEquipos) {
			System.out.println("=======================");
			System.out.println("Equipo:" + claveEquipo);
			System.out.println("=======================");
			
			Set<Jugador> jugadoresPorClave = equipos.get(claveEquipo);
			for (Jugador jugador : jugadoresPorClave) {
				System.out.println("\t"+jugador);
			}
			
		}
		System.out.println("======================================\n\n");
		
		String dato = "Apellido";
		
		Set <Entry<String, Set<Jugador>>> entryEquipos  
							= equipos.entrySet();
		
		for (Entry<String, Set<Jugador>> entry : entryEquipos) {
			System.out.println("=======================");
			System.out.println("Equipo:" + entry.getKey());
			System.out.println("=======================");
			
			
			Set<Jugador> setJugadoresEquipo = entry.getValue();
			for (Jugador jugador : setJugadoresEquipo) {
				if (jugador.getNombre().equals(dato) || 
						jugador.getApellidos().equals(dato)){
					
					System.out.println("\t"+jugador);
					
				}
			}
			
		}
		
		
		
	}

}








