package es.curso.java.colecciones;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class ColeccionesGet { 
    public static void main(String arg[]) {
            List<Persona> listaarray = new ArrayList<Persona>();
            List<Persona> listalinked = new LinkedList<Persona>();
            long antes;
            
            for(int i=0;i<10000;i++)
            {
               listaarray.add(new Persona(i,"Persona"+i,i));  // En este ejemplo cada persona lleva datos ficticios
            }
            for(int i=0;i<10000;i++)
            {
                listalinked.add(new Persona(i,"Persona"+i,i));
            }
            
            
            System.out.println("Tiempo invertido en obtener 10000 personas en listaarray (en nanosegundos):");
            antes = System.nanoTime();
            for(int i=0;i<10000;i++)
            {
               listaarray.get(i);  // En este ejemplo cada persona lleva datos ficticios
               
            }
            System.out.println(System.nanoTime()- antes);
            System.out.println("============================");
            System.out.println("Tiempo invertido en obtener 10000 personas en listalinked (en nanosegundos):");
            antes = System.nanoTime();
            for(int i=0;i<10000;i++)
            {
                listalinked.get(i);
            }
            System.out.println(System.nanoTime()- antes);
            
    } 
}
