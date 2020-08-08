package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		System.out.println("Enter the measures of triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double p = (x.a+x.b+x.c)/2.0;
		double areaX = Math.sqrt(p*(p-x.a)*(p-x.a)*(p-x.c));
		p = (y.a+y.b+y.c)/2.0;
		double areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
		//fórmula para calcular a área dos triângulos
		System.out.printf("Triangle X area:%.4f%nTriangle Y area: %.4f%n", areaX, areaY);
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}

}
