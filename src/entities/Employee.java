package entities;

public class Employee {
	private String name;
	private Double Salary;
	private int id;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Employee(String name, Double salary, int id) {
		this.name = name;
		Salary = salary;
		this.id = id;
	}


	public String getName() {
		return name;
	}



	public Double getSalary() {
		return Salary;
	}


	public void setSalary(Double salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return id+ ", "+name+", "+String.format("%.2f", Salary);
	}
	
	public void IncreaseSalary(int por) {
		Salary += Salary*por/100;
	}
}
