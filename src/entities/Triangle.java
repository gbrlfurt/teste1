package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	
	public double area() {//n�o precisa receber par�metro pois eles j� est�o contidos na classe
		double p = (a+b+c)/2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-a));
		
	
	
	}
	}
