package entities;

public class Calculator {
	
	public static double converter(double dolar, double valor) {
		double IOF = (dolar*valor)*6/100;
		return dolar * valor + IOF;
		
	}
	
	
	
	

}
