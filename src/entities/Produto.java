package entities;

public class Produto {
	
	public String name;
	public double price;
	public int quantity;
	//retorno a quantidade em estoque
	public double totalValueInStock() {
		return price*quantity;
	}
	//uso o quantity que já tenho com a nova quantidade dada no parâmetro
	public void addProducts(int quantity) {
		this.quantity = this.quantity + quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return quantity
			+" "
			+ name.toUpperCase()
			+ "(s) no estoque. Valor total: R$"
			+ String.format("%.2f",totalValueInStock());
	}
	
}
