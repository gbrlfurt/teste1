package ex02;

import java.util.Scanner;

import entities.Funcionario;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Funcionario employer = new Funcionario();
		System.out.println("name:");
		employer.name = sc.nextLine();
		System.out.println("salary:");
		employer.grossSalary = sc.nextDouble();
		System.out.println("tax:");
		employer.tax = sc.nextDouble();
		System.out.println(employer);
		System.out.println("Which percentage to increasy salary?");
		employer.percentage = sc.nextDouble();
		
		System.out.println("Update data: " + employer);
		
		sc.close();
	}

}
