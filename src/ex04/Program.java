package ex04;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double dolar = sc.nextDouble();
		double valor = sc.nextDouble();
		System.out.println(Calculator.converter(dolar,valor));
		
		
		sc.close();

	}

}
