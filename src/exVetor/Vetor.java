package exVetor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Employee> list = new ArrayList<>();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas você quer registrar?");
		
		int num = sc.nextInt();
		
		for(int i = 0; i<num;i++) {
			System.out.println();
			System.out.println("Employee #"+(1+i)+":");
			System.out.println("id:");
			int ident = sc.nextInt();
			while (hasId(list, ident)!=null) {
				System.out.println("Id already taken! Try again");
				ident = sc.nextInt();
			}
			System.out.println("name:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("salary:");
			double salary = sc.nextDouble();
			Employee emp = new Employee(nome, salary, ident);
			list.add(emp);
			
			
		}
		System.out.println("Enter the id that will have the salary increase:");
		sc.nextLine();
		int increase = sc.nextInt();
		Integer pos = hasId(list, increase);
		if(pos == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.println("Enter the percentage");
			int por = sc.nextInt();
			list.get(pos).IncreaseSalary(por);
		}
	System.out.println();
	System.out.println("List of employees");
	for(Employee emp: list) {
		System.out.println(emp);
	}
		sc.close();
	}
	
	public static Integer hasId(List<Employee> list, int id) {
		for(int i = 0; i<list.size();i++) {
			if(list.get(i).getId()== id) {
				return i;
			}
		}
		return null;
	}
	

}
