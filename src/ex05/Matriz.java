package ex05;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int c = sc.nextInt();
		int[][] matriz = new int[l][c];
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0; j<matriz[i].length;j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matriz inteira:");
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0; j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Digite um número:");
		int ocor = sc.nextInt();
		System.out.println("Ocorrência:");
		for(int i = 0;i<matriz.length;i++) {
			for(int j = 0; j<matriz[i].length;j++) {
				if(matriz[i][j] == ocor) {
					System.out.println("Posição:["+i+"]["+j+"]");
					if(i>0) {
						System.out.println("UP:"+matriz[i-1][j]);
					}
					if(j>0) {
						System.out.println("LEFT:"+matriz[i][j-1]);
					}
					if(j<c-1) {
						System.out.println("RIGHT:"+matriz[i][j+1]);
					}
					if(i<l-1) {
						System.out.println("DOWN:"+matriz[i+1][j]);
					}
		}
			}
		}
		sc.close();
	}

}

