package es.curso.java.fechas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDates {

	/**
	 * @param args
	 */
	
	//la clase Calendar es una clase abstracta base para convertir 
	//entre un objeto de tipo Date (java.util.Date) 
	//y un conjunto de campos enteros 
	//como YEAR (a�o), MONTH (mes), DAY (d�a), HOUR (hora),
	public static void main(String[] args) {
		//El m�todo getInstance() de la clase nos devuelve una subclase de Calendar con el tiempo ajustado a la hora actual
		Calendar ahoraCal = Calendar.getInstance();
		System.out.println(ahoraCal.getClass());
		ahoraCal.set(2004,1,7);
		System.out.println(ahoraCal.getTime());
		ahoraCal.set(2004,1,7,7,0,0);
		System.out.println(ahoraCal.getTime());
		
		System.out.println("ANYO: "+ahoraCal.get(Calendar.YEAR));
		System.out.println("MES: "+ahoraCal.get(Calendar.MONTH));
		System.out.println("DIA: "+ahoraCal.get(Calendar.DATE));
		System.out.println("HORA: "+ahoraCal.get(Calendar.HOUR));
		if (ahoraCal.get(Calendar.MONTH) == Calendar.JUNE){
			System.out.println("ES JUNIO");
		}else{
			System.out.println("NO ES JUNIO");
		}
		
		//Realizar operaciones como sumar o restar d�as no es 
//		algo que dependa directamente de Calendar sino 
//		m�s bien de una subclase de esta que implemente alg�n 
//		tipo de calendario usado, 
//		pues no todos los calendarios tienen 12 meses 
//		ni a�os de 365 d�as como el que nosotros (en casi todo occidente) usamos.
		Calendar c1 = GregorianCalendar.getInstance();
        System.out.println("Fecha GregorianCalendar actual: "+c1.getTime());
        c1.set(2000, Calendar.AUGUST, 31);
        System.out.println("Fecha 31 Agosto 2000: "+c1.getTime());
        c1.set(Calendar.MONTH, 13);
        System.out.println("Fecha 13 meses m�s con set: "+c1.getTime());
        /* como podremos observar no nos imprimir� la fecha deseada, hemos escrito una incoherencia*/
        c1.set(2000, Calendar.AUGUST, 31);

        
        //los m�todos add() y roll() nos permiten avanzar un tiempo 
        //exacto sobre los datos obtenidos anteriormente.

        //El m�todo add(CONSTATE, valor) suma algebraicamente valor a una fecha; 
        c1.add(Calendar.MONTH, 13); /* A�adir 13 meses */
        System.out.println("Fecha 13 meses m�s con add: "+c1.getTime()); /*ahora s� es correcto*/
        c1.add(Calendar.MINUTE, 70);
        System.out.println("Fecha 70 minutos m�s: "+c1.getTime());
        
        //roll solo cambia los valores que se especificaron directamente.
        //el uso de roll no es muy com�n excepto pues en ambientes gr�ficos
        c1.roll(Calendar.HOUR, 25); /* A�adir 25 horas */
        System.out.println("Fecha 25 horas m�s: "+c1.getTime());    /*uso de roll*/
        c1.roll(Calendar.MINUTE, 70);
        System.out.println("Fecha 70 minutos m�s: "+c1.getTime());
        
        
        //Dando formato a las fechas
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
        System.out.println("Fecha Formateada: "+sdf.format(c1.getTime()));

        
        //Date metodos deprecados
        Date fecha = new Date();
		fecha.getDate();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
	}

}
