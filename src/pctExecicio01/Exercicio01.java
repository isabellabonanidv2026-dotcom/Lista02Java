package pctExecicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);

		int num;
		System.out.println("Informe o número que você quiser");
		num = receba.nextInt();

		if (num >=20) {
			System.out.println("Seu número é maior que 20!");
		} else {
			System.out.println("Seu número é menor que 20...");
		}
	}
}