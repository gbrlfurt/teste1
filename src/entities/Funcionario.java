package entities;

public class Funcionario {
	
	public String name;
	public double grossSalary;
	public double tax;
	public double percentage;
	
	public Double netSalary() {
		return this.grossSalary - this.tax;
	}
	public Double increaseSalary() {
		return netSalary() + this.grossSalary *(this.percentage/100);
	}
	
	public String toString() {
		return name
				+", "
				+"$ "
				+ String.format("%.2f",increaseSalary());
	}
}
