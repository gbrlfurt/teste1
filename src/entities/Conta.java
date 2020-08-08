package entities;

public class Conta {

	private String name;
	private int number;
	private double amount;
	
	
	public Conta(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public Conta(String name, int number, double inicialDeposit) {
		this.name = name;
		this.number = number;
		adicionar(inicialDeposit);
	}


	public void adicionar(double amount) {
		this.amount += amount;
	}
	
	public void retirar(double amount) {
		this.amount = (this.amount-5) - amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getNumber() {
		return number;
	}
	public double getAmount() {
		return amount;
	}
	
	public String toString() {
		return "Account:"
				+ number
				+" Holder:"
				+ name
				+" Balance:" 
				+ amount;
	}
}
