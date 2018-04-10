package es.curso.java.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ColeccionesAdd { 
    public static void main(String arg[]) {
            List<Persona> listaarray = new ArrayList<Persona>();
            List<Persona> listalinked = new LinkedList<Persona>();
            long antes;
            
            System.out.println("Tiempo invertido en insertar 10000 personas en listaarray (en nanosegundos):");
            antes = System.nanoTime();
            for(int i=0;i<10000;i++)
            {
               listaarray.add(new Persona(i,"Persona"+i,i));  // En este ejemplo cada persona lleva datos ficticios
               
            }
            System.out.println(System.nanoTime()- antes);
            System.out.println("============================");
            System.out.println("Tiempo invertido en insertar 10000 personas en listalinked (en nanosegundos):");
            antes = System.nanoTime();
            for(int i=0;i<10000;i++)
            {
                listalinked.add(new Persona(i,"Persona"+i,i));
            }
            System.out.println(System.nanoTime()- antes);
            
            System.out.println("============================");
            
            System.out.println("Tiempo invertido en insertar una persona en listaarray (en nanosegundos):");
            antes = System.nanoTime();
            listaarray.add(0,new Persona(10001,"Prueba",10001)); // Inserci�n en posicion 0 de una persona
            System.out.println(System.nanoTime()- antes); 
            
            System.out.println("============================");
            
            System.out.println("Tiempo invertido en insertar una persona en listalinked (en nanosegundos):");
            antes = System.nanoTime();
            listalinked.add(0,new Persona(10001,"Prueba",10001));  // Inserci�n en posicion 0 de una persona
            System.out.println(System.nanoTime()- antes);
      } 
}
