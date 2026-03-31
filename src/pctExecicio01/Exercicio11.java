package pctExecicio01;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		int num;

		System.out.println("Informe o numero");
		num = receba.nextInt();

		if (num <= 10) {
			System.out.println("Pequeno");
		} else if (num > 10 && num < 50) {
			System.out.println("medio");
		} else {
			System.out.println("Grande");
		}
	}
}
