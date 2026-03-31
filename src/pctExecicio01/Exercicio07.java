package pctExecicio01;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
int num;
		int idade;
		System.out.println("Informe a sua idade");
		num = receba.nextInt();

	if (num >= 60) {
			System.out.println("O senhor já pode se aposentar");
		} else {
			System.out.println("O senhor terá que esperar um pouco");
		}
	}
}