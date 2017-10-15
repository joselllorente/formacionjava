package es.curso.java.excepciones.tazacafe;

public class BarPepito {


	public static void main(String[] args) {
		Client cliente = new Client("James","Dean","123123F");
		
		CoffeCup taza = new CoffeCup(Math.random()*100);
		
		
		try {
			cliente.drinkCoffeCup(taza);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		try {
			cliente.drinkCoffeCup(taza);
		} catch (TemperatureException e) {
			System.out.println(e.getMessage());
			
			if(e instanceof TooColdTemperatureException){
				System.out.println("No se ha tomado el cafe por que estaba muy frio");
			}else{
				System.out.println("No se ha tomado el cafe por que estaba muy caliente");
			}
		}finally{
			System.out.println("El cliente "+cliente.getNombre() + " se va");
		}
		
	}

}
