package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	
	public double area() {//não precisa receber parâmetro pois eles já estão contidos na classe
		double p = (a+b+c)/2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-a));
		
	
	
	}
	}
