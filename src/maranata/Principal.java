package maranata;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Produto product = new Produto();
		System.out.println("Digite o nome do produto:");
		product.name = sc.nextLine();
		System.out.println("Digite o valor do produto:");
		product.price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite a quantidade do produto:");
		product.quantity = sc.nextInt();
		System.out.println(product);
		System.out.print("Qual a quantidade do produto deseja adcionar?");
		int add = sc.nextInt();
		product.addProducts(add);
		System.out.println(product);
		System.out.print("Qual a quantidade do produto deseja remover?");
		int remove = sc.nextInt();
		product.removeProducts(remove);
		/*System.out.printf("Atualização: %d %s(s) no estoque. Valor total: %.2f %n", product.quantity, product.name, product.totalValueInStock());
	    */
		System.out.println(product);
	    sc.close();
	    
	}

}
