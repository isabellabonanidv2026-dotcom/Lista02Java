package pctExecicio01;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;

		System.out.println("Informe a temperatura");
		num = receba.nextInt();

		if (num <= 15) {
			System.out.println("Frio");
		} else if (num >= 15 && num <= 25) {
			System.out.println("Agradavel");
		} else if (num>25) {
			System.out.println("Quente");
		}
	}
}