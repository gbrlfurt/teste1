package ex03;

import java.util.Scanner;

import entities.Aluno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do Aluno:");
		aluno.name = sc.next();
		sc.nextLine();
		System.out.println("Digite as tr�s notas do aluno:");
		System.out.print("A primeira at� 30:");
		double nota1 = sc.nextDouble();
		aluno.addScore(nota1);
		System.out.print("A segunda at� 35:");
		double nota2 = sc.nextDouble();
		aluno.addScore(nota2);
		System.out.print("A terceira at� 35:");
		double nota3 = sc.nextDouble();
		aluno.addScore(nota3);
		System.out.println(aluno);
		sc.close();
	}

}
