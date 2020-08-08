package curso_programacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite os três valores:");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt(); 
	int resultado = maior(a,b,c);
	System.out.printf("%nO maior foi %d", resultado);
	sc.close();
	}
	
	
	public static int maior(int x, int y, int z) {
		int aux; //variável local da função
		if (x>y && x>z) {
			aux = x;
			
		}else if(y>x && y>z){
			aux = y;
		}else {
			aux = z;
		}
		return aux;
	}
		
	}


