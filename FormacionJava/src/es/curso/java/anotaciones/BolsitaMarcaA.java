package es.curso.java.anotaciones;

import es.curso.java.anotaciones.misanotaciones.Dulce;
import es.curso.java.anotaciones.misanotaciones.FrutoSeco;


public class BolsitaMarcaA {
	@FrutoSeco(calorias=500, tieneVitaminaE=true, arbolQueDaEsteFruto="Almendro")
	private int almendras = 50;
	
	@FrutoSeco(tieneVitaminaE=true, calorias=600,  arbolQueDaEsteFruto="Avellano")
	private int avellanas = 40;
	
	
	@FrutoSeco(calorias=700, arbolQueDaEsteFruto="Pino")
	private int pinones = 30;
	
	@Dulce(2500)
	private int caramelos = 20;
	
	@Dulce(3800)
	private int chocolates = 15;
	
	private int juguetesPromocionales = 1;
}
