package exerc01;

import java.util.Scanner;

import entidade.Retangulo;

public class Retang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		System.out.println("Digite o valor da largura:");
		retangulo.width = sc.nextDouble();//largura
		System.out.println("Digite o valor da altura:");
		retangulo.height = sc.nextDouble();
		System.out.println(retangulo);
		
		
		
		
		sc.close();
	}

}
